package com.tvz.mobilnelabapi.controllers;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tvz.mobilnelabapi.mappers.dao.MeasurementsMapper;
import com.tvz.mobilnelabapi.model.Measurements;
import com.tvz.mobilnelabapi.utility.MobilneLabUtility;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("mobilne")
@Api(value = "Mobilne lab REST controller", tags = { "Mobilne lab" })
@Transactional
public class MobilneLabController {
	Random rand = new Random();
	private static final Logger logger = LogManager.getLogger(MobilneLabController.class);
	private SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
	
	@Autowired
	MeasurementsMapper measurementsMapper;

	@RequestMapping(value = "measurements", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Measurements> getMeasurements(HttpServletRequest request) throws JSONException {
		List<Measurements> list = null;
//		List<Measurements> list =  measurementsMapper.selectByExample(null);
//		String data = list.get(0).getData().substring(1, list.get(0).getData().length()-2);
//		list.get(0).setData(data);
		MobilneLabUtility mobilneLabUtility = new MobilneLabUtility();
		try {
			mobilneLabUtility.convertFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
