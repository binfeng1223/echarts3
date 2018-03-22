package com.foresee.echarts.output;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.foresee.echarts.model.RadarModel;
import com.foresee.echarts.option.Radar;
import com.foresee.echarts.util.Constants;

public class RadarOutput extends BaseOutput {

	@Override
	public JSONObject getElement() {
		// TODO Auto-generated method stub
		JSONObject element = super.getElement();
		RadarModel model = (RadarModel)this.getModel();
		if (model.getRadarList() != null && model.getRadarList().size() > 0) {
			JSONArray radarList = new JSONArray();
			for (Radar radar : model.getRadarList()) {
				radarList.add(radar.getElement());
			}
			element.put(Constants.radar, radarList);
		}
		return element;
	}
	
	@Override
	public String getJSON() {
		return this.getElement().toString();
	}
}