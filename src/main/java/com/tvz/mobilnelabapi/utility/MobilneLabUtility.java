package com.tvz.mobilnelabapi.utility;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.tvz.mobilnelabapi.mappers.dao.UserMapper;
import com.tvz.mobilnelabapi.model.User;
import com.tvz.mobilnelabapi.model.UserExample;

@Component
public class MobilneLabUtility {

	private static final Logger logger = LogManager.getLogger(MobilneLabUtility.class);
	
	@Autowired
	UserMapper userMapper;

	public String convertFile(MultipartFile file) throws Exception {
//		File output = new File("./misc/data.json");
//		File input = new File("./misc/data4g.csv");
		File webInput = multipartToFile(file);
		List<Map<?, ?>> data = readObjectsFromCsv(webInput);
		return writeAsJson(data);
	}

	public static List<Map<?, ?>> readObjectsFromCsv(File file) throws IOException {
		CsvMapper mapper = new CsvMapper();
		CsvSchema schema = CsvSchema.emptySchema().withHeader().withColumnSeparator(',');
		MappingIterator<Map<?, ?>> mappingIterator = mapper.readerFor(Map.class).with(schema).readValues(file);
		return mappingIterator.readAll();
	}

	public static String writeAsJson(List<Map<?, ?>> data) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		return mapper.writeValueAsString(data);
	}

	public File multipartToFile(MultipartFile file) throws IOException {
		File convFile = new File(file.getOriginalFilename());
		convFile.createNewFile();
		FileOutputStream fos = new FileOutputStream(convFile);
		fos.write(file.getBytes());
		fos.close();
		return convFile;
	}
	
	public User getUserByPrincipal(String username) {
		UserExample example = new UserExample();
		example.createCriteria().andUsernameEqualTo(username).andEnabledEqualTo(true);
		return userMapper.selectByUsername(username);
	}
	
}
