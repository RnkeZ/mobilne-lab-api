package com.tvz.mobilnelabapi.controllers;

import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tvz.mobilnelabapi.mappers.dao.TypeMapper;
import com.tvz.mobilnelabapi.model.Type;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("api")
@PreAuthorize("hasRole('ROLE_USER')")
@Api(value = "Mobilne lab REST controller", tags = { "Type" })
public class TypeController {
	private static final Logger logger = LogManager.getLogger(TypeController.class);

	@Autowired
	private TypeMapper typeMapper;

	@RequestMapping(value = "type/{typeid}", method = RequestMethod.GET)
	public Type getDevice(HttpServletRequest request, @PathVariable(value = "typeid") Integer typeid) {
		return typeMapper.selectByPrimaryKey(typeid);
	}

	@RequestMapping(value = "types", method = RequestMethod.GET)
	public List<Type> getDevices(HttpServletRequest request) {
		return typeMapper.selectByExample(null);
	}

}
