package com.foresee.echarts.option;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.alibaba.fastjson.JSONObject;
import com.foresee.echarts.dataview.RadarData;
import com.foresee.echarts.util.Constants;

/**
 * echarts雷达坐标组件
 * @author ROLL
 *
 */
public class Radar extends Option {
	private static final Logger log = Logger.getLogger(Radar.class);
	private List<RadarData> indicators;

	public List<RadarData> getIndicators() {
		return indicators;
	}

	public void setIndicators(List<RadarData> indicators) {
		this.indicators = indicators;
	}
	public void addIndicators(RadarData radarData){
		if(indicators == null)
			indicators = new ArrayList<RadarData>();
		indicators.add(radarData);
	}
	
	public void addIndicators(String name){
		if(indicators == null)
			indicators = new ArrayList<RadarData>();
		RadarData rd = new RadarData(name);
		indicators.add(rd);
	}
	@Override
	public JSONObject getElement() {
		JSONObject json = new JSONObject();
		// 转换属性key
		if (indicators == null || indicators.size() == 0)
			log.warn("雷达图的指示器未定义.");
		List<Object> dataList = new ArrayList<Object>();
		for(RadarData ld : indicators){
				dataList.add(ld.getElement());
		}
		json.put(Constants.radar_indicator, dataList);
		json.putAll(this.getAttributes());
		return json;
	}
}
