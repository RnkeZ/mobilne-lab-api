package com.tvz.mobilnelabapi.composite;

import org.json.JSONObject;

import com.fasterxml.jackson.annotation.JsonRawValue;
import com.tvz.mobilnelabapi.model.Measurements;

public class MeasurementsComposite extends Measurements {

	private static final long serialVersionUID = 1L;
	private JSONObject dataJSON;

	@JsonRawValue
	public JSONObject getDataJSON() {
		return dataJSON;
	}

	public void setDataJSON(JSONObject dataJSON) {
		this.dataJSON = dataJSON;
	}
}