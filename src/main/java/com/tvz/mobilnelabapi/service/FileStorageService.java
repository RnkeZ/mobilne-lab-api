package com.tvz.mobilnelabapi.service;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.tvz.mobilnelabapi.config.FileStorageProperties;
import com.tvz.mobilnelabapi.exception.FileStorageException;
import com.tvz.mobilnelabapi.exception.MyFileNotFoundException;
import com.tvz.mobilnelabapi.utility.MobilneLabUtility;

@Service
public class FileStorageService {

	private final Path fileStorageLocation;

	@Autowired
	MobilneLabUtility mobilneLabUtility;

	@Autowired
	public FileStorageService(FileStorageProperties fileStorageProperties) {

		this.fileStorageLocation = Paths.get(fileStorageProperties.getUploadDir()).toAbsolutePath().normalize();

		try {
			Files.createDirectories(this.fileStorageLocation);

		} catch (Exception ex) {
			throw new FileStorageException("Could not create the directory where the uploaded files will be stored.",
					ex);
		}
	}

	public String storeFile(MultipartFile file, HttpServletRequest request) {
		// Normalize file name
		String fileName = mobilneLabUtility.getUserByPrincipal(request.getRemoteUser()).getUsername() + '-'
				+ StringUtils.cleanPath(file.getOriginalFilename());

		try {
			// Check if the file's name contains invalid characters
			if (fileName.contains("..")) {
				throw new FileStorageException("Sorry! Filename contains invalid path sequence " + fileName);
			}

			// Copy file to the target location (Replacing existing file with the same name)
			String username = fileName.split("-")[0];
			String measurment = fileName.split("-")[1];
			System.out.println("!!!!!!!!!!!!!" + username + "!!!!!!!!!!!!!!!!!!!!!!!!!");
			Path measurementDirectory = Paths.get(fileStorageLocation.toAbsolutePath().toString(),
					username + "-" + measurment);
			System.out.println("!!!!!!!!!!!!!" + measurementDirectory.toString() + "!!!!!!!!!!!!!!!!!!!!!!!!!");
			if (Files.notExists(measurementDirectory)) {
				Files.createDirectory(measurementDirectory);
			}
			Path targetLocation = measurementDirectory.resolve(fileName);

			System.out.println("!!!!!!!!!!!!!" + targetLocation.toString() + "!!!!!!!!!!!!!!!!!!!!!!!!!");
			Files.copy(file.getInputStream(), targetLocation, StandardCopyOption.REPLACE_EXISTING);

			return username + "-" + measurment + "/" + fileName;

		} catch (IOException ex) {
			throw new FileStorageException("Could not store file " + fileName + ". Please try again!", ex);
		}
	}

	public Resource loadFileAsResource(String directory, String fileName) {
		try {
			Path filePath = this.fileStorageLocation.resolve(directory + "/" + fileName).normalize();
			Resource resource = new UrlResource(filePath.toUri());
			if (resource.exists()) {
				return resource;
			} else {
				throw new MyFileNotFoundException("File not found " + fileName);
			}
		} catch (MalformedURLException ex) {
			throw new MyFileNotFoundException("File not found " + fileName, ex);
		}
	}

	public boolean deleteFile(String fileName) {
		Path measurementDirectory = Paths.get(fileStorageLocation.toAbsolutePath().toString());
		Path targetLocation = measurementDirectory.resolve(fileName);
		File file = targetLocation.toFile();
		boolean fileDeleted = file.delete();
		if (measurementDirectory.toFile().isDirectory()) {
			if (measurementDirectory.toFile().list().length == 0) {
				measurementDirectory.toFile().delete();
			}
		}
		return fileDeleted;
	}

}
