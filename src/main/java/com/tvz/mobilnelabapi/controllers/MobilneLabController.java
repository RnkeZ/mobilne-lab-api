package com.tvz.mobilnelabapi.controllers;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

import javax.servlet.http.HttpServletRequest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.tvz.mobilnelabapi.composite.MeasurementsteportdataComposite;
import com.tvz.mobilnelabapi.composite.MeasurementsComposite;
import com.tvz.mobilnelabapi.mappers.dao.MeasurementreportdataMapper;
import com.tvz.mobilnelabapi.mappers.dao.MeasurementreportimagesMapper;
import com.tvz.mobilnelabapi.mappers.dao.MeasurementsMapper;
import com.tvz.mobilnelabapi.model.Measurementreportdata;
import com.tvz.mobilnelabapi.model.MeasurementreportdataExample;
import com.tvz.mobilnelabapi.model.Measurementreportimages;
import com.tvz.mobilnelabapi.model.MeasurementreportimagesExample;
import com.tvz.mobilnelabapi.model.Measurements;
import com.tvz.mobilnelabapi.model.MeasurementsExample;
import com.tvz.mobilnelabapi.utility.MobilneLabUtility;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("api")
@Api(value = "Mobilne lab REST controller", tags = { "Mobilne lab" })
@Transactional
public class MobilneLabController {
	private static final Logger logger = LogManager.getLogger(MobilneLabController.class);
	private SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

	@Autowired
	MobilneLabUtility mobilneLabUtility;

	@Autowired
	MeasurementsMapper measurementsMapper;

	@Autowired
	MeasurementreportdataMapper measurementreportdataMapper;

	@Autowired
	MeasurementreportimagesMapper measurementreportimagesMapper;

	@RequestMapping(value = "measurements/{typeid}", method = RequestMethod.GET)
	public List<MeasurementsComposite> getMeasurements(HttpServletRequest request,
			@PathVariable(value = "typeid") Integer typeid) throws JSONException {
		MeasurementsExample measurementsExample = new MeasurementsExample();
		measurementsExample.createCriteria().andUsernameEqualTo(request.getRemoteUser()).andTypeidEqualTo(typeid);
		List<MeasurementsComposite> list = measurementsMapper.selectCompositeByExample(measurementsExample);
		return list;
	}

	@RequestMapping(value = "measurements/upload/{typeid}/{deviceid}/{name}", method = RequestMethod.POST)
	public void uploadMeasurement(HttpServletRequest request, @PathVariable(value = "typeid") Integer typeid,
			@PathVariable(value = "deviceid") Integer deviceid, @PathVariable(value = "name") String name,
			@RequestParam("file") MultipartFile file) throws Exception {
		Measurements measurements = new Measurements();
		measurements.setData(mobilneLabUtility.convertFile(file));
		measurements.setDateofcreation(new Date());
		measurements.setUserid(mobilneLabUtility.getUserByPrincipal(request.getRemoteUser()).getId());
		measurements.setUsername(request.getRemoteUser());
		measurements.setTypeid(typeid);
		measurements.setDeviceid(deviceid);
		measurements.setName(name);
		measurementsMapper.insertSelective(measurements);
	}

	@RequestMapping(value = "measurements", method = RequestMethod.PUT)
	public void updateMeasurement(HttpServletRequest request, @RequestBody MeasurementsComposite measurementsComposite)
			throws JSONException {
		measurementsComposite
				.setData(measurementsMapper.selectCompositeByPrimaryKey(measurementsComposite.getId()).getData());
		measurementsMapper.updateByPrimaryKey(measurementsComposite);
	}

	@RequestMapping(value = "measurements/{measurementid}", method = RequestMethod.DELETE)
	public void deleteMeasurement(HttpServletRequest request,
			@PathVariable(value = "measurementid") Integer measurementid) throws Exception {
		measurementsMapper.deleteByPrimaryKey(measurementid);
	}

	@Transactional
	@RequestMapping(value = "measurements/reportdata-images/{measurmentid}/{imagename}/", method = RequestMethod.POST)
	public void insertMeasurementReportImages(HttpServletRequest request,
			@PathVariable("measurmentid") String measurmentid, @PathVariable("imagename") String imagename,
			@RequestBody String image) throws JSONException {
		Measurementreportimages measurementreportimages = new Measurementreportimages();
		measurementreportimages.setMeasurementid(new Integer(measurmentid));
		measurementreportimages.setImagename(imagename);
		measurementreportimages.setImage(image);
		measurementreportimagesMapper.insertSelective(measurementreportimages);
	}

	@RequestMapping(value = "measurements/reportdata-images/{measurmentid}", method = RequestMethod.GET)
	public List<Measurementreportimages> getMeasurementReportImages(HttpServletRequest request,
			@PathVariable("measurmentid") Integer measurmentid) throws JSONException {
		MeasurementreportimagesExample measurementreportimagesExample = new MeasurementreportimagesExample();
		measurementreportimagesExample.createCriteria().andMeasurementidEqualTo(measurmentid);
		return measurementreportimagesMapper.selectByExample(measurementreportimagesExample);
	}

	@RequestMapping(value = "measurements/reportdata-images/{id}", method = RequestMethod.DELETE)
	public void deleteReportDataImage(HttpServletRequest request, @PathVariable(value = "id") Integer id)
			throws Exception {
		measurementreportimagesMapper.deleteByPrimaryKey(id);
	}

	@Transactional
	@RequestMapping(value = "measurements/reportdata-calculations", method = RequestMethod.POST)
	public void insertMeasurementReportData(HttpServletRequest request,
			@RequestBody List<Measurementreportdata> measurementsCalculationsComposite) throws JSONException {
		for (Measurementreportdata item : measurementsCalculationsComposite) {
			measurementreportdataMapper.insertSelective(item);
		}
	}

	@RequestMapping(value = "measurements/reportdata-calculations/{measurmentid}", method = RequestMethod.GET)
	public List<Measurementreportdata> getMeasurementReportData(HttpServletRequest request,
			@PathVariable("measurmentid") Integer measurmentid) throws JSONException {
		MeasurementreportdataExample measurementreportdataExample = new MeasurementreportdataExample();
		measurementreportdataExample.createCriteria().andMeasurementidEqualTo(measurmentid);
		return measurementreportdataMapper.selectByExample(measurementreportdataExample);
	}

	@RequestMapping(value = "measurements/reportdata-calculations/{id}", method = RequestMethod.DELETE)
	public void deleteMeasurementReportData(HttpServletRequest request, @PathVariable(value = "id") Integer id)
			throws Exception {
		measurementreportdataMapper.deleteByPrimaryKey(id);
	}

	/*************/
	@RequestMapping(value = "sync/{userid}", method = RequestMethod.GET, produces="application/zip")
	public ResponseEntity<byte[]> getZip(HttpServletRequest request, @PathVariable(value = "userid") Integer userid) throws IOException {
		String sourceFile = "J:\\Projects\\mobilne-lab-api\\src\\main\\resources\\public.txt";
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ZipOutputStream zipOut = new ZipOutputStream(bos);
		File fileToZip = new File(sourceFile);
		FileInputStream fis = new FileInputStream(fileToZip);
		ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
		zipOut.putNextEntry(zipEntry);
		final byte[] bytes = new byte[1024];
		int length;
		while ((length = fis.read(bytes)) >= 0) {
			zipOut.write(bytes, 0, length);
		}
		zipOut.close();
		fis.close();
		bos.close();
		
	    MultiValueMap<String, String> headers = new LinkedMultiValueMap<>();
	    headers.add("Content-Type", "application/octet-stream");
	    headers.add("Content-Disposition", "attachment; filename=\"zipFile.zip\"");
	    return new ResponseEntity<>(bos.toByteArray(), headers, HttpStatus.OK);
	}
}
