package com.tvz.mobilnelabapi.controllers;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.tvz.mobilnelabapi.mappers.dao.DeviceMapper;
import com.tvz.mobilnelabapi.model.Device;
import io.swagger.annotations.Api;

@RestController
@RequestMapping("api")
@PreAuthorize("hasRole('ROLE_USER')")
@Api(value = "Mobilne lab REST controller", tags = { "Device" })
public class DeviceController {
	private static final Logger logger = LogManager.getLogger(DeviceController.class);

	@Autowired
	private DeviceMapper deviceMapper;

	@RequestMapping(value = "device/{deviceid}", method = RequestMethod.GET)
	public Device getDevice(HttpServletRequest request, @PathVariable(value = "deviceid") Integer deviceid) {
		return deviceMapper.selectByPrimaryKey(deviceid);
	}

	@RequestMapping(value = "devices", method = RequestMethod.GET)
	public List<Device> getDevices(HttpServletRequest request) {
		return deviceMapper.selectByExample(null);
	}

	@RequestMapping(value = "device", method = RequestMethod.POST)
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public void insertDevice(HttpServletRequest request, @RequestBody Device device) throws JSONException {
		deviceMapper.insertSelective(device);
	}
	
	@RequestMapping(value = "device", method = RequestMethod.PUT)
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public void updateDevice(HttpServletRequest request, @RequestBody Device device) throws JSONException {
		deviceMapper.updateByPrimaryKey(device);
	}

}
