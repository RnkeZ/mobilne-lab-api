package com.tvz.mobilnelabapi.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.tvz.mobilnelabapi.composite.MeasurementsComposite;
import com.tvz.mobilnelabapi.composite.UserComposite;
import com.tvz.mobilnelabapi.mappers.dao.MeasurementsMapper;
import com.tvz.mobilnelabapi.model.Device;
import com.tvz.mobilnelabapi.model.Measurements;
import com.tvz.mobilnelabapi.model.MeasurementsExample;
import com.tvz.mobilnelabapi.model.Type;
import com.tvz.mobilnelabapi.model.UserExample;
import com.tvz.mobilnelabapi.utility.MobilneLabUtility;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("api")
@PreAuthorize("hasRole('USER')")
@Api(value = "Mobilne lab REST controller", tags = { "Mobilne lab" })
@Transactional
public class MobilneLabController {
	private static final Logger logger = LogManager.getLogger(MobilneLabController.class);
	private SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

	@Autowired
	MobilneLabUtility mobilneLabUtility;

	@Autowired
	MeasurementsMapper measurementsMapper;

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
	
	@RequestMapping(value = "measurements/{measurementid}", method = RequestMethod.DELETE)
	public void deleteMeasurement(HttpServletRequest request, @PathVariable(value = "measurementid") Integer measurementid) throws Exception {
		measurementsMapper.deleteByPrimaryKey(measurementid);
	}
}
