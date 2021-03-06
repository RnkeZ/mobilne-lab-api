package com.tvz.mobilnelabapi.composite;

import org.json.simple.JSONArray;

import com.tvz.mobilnelabapi.model.Device;
import com.tvz.mobilnelabapi.model.Measurements;
import com.tvz.mobilnelabapi.model.Type;

public class MeasurementsComposite extends Measurements {
	private static final long serialVersionUID = 1L;
	private JSONArray dataJSON;
	private Type type;
	private Device device;

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Device getDevice() {
		return device;
	}

	public void setDevice(Device device) {
		this.device = device;
	}
	
	public JSONArray getDataJSON() {
		return dataJSON;
	}

	
	public void setDataJSON(JSONArray dataJSON) {
		this.dataJSON = dataJSON;
	}

}
