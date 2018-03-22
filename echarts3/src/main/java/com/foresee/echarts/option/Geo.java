package com.foresee.echarts.option;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.alibaba.fastjson.JSONObject;
import com.foresee.echarts.dataview.RegionsData;
import com.foresee.echarts.util.Constants;

public class Geo extends Option{
	private static final Logger log = Logger.getLogger(Geo.class);
	private List<RegionsData> data;
	
	public void setData(List<RegionsData> data) {
		this.data = data;
	}
	public List<RegionsData> getData() {
		return data;
	}
	public void addRegionsData(RegionsData regionsData) {
		if (data == null)
			data = new ArrayList<RegionsData>();
		data.add(regionsData);
	}

	public void addRegionsData(String name) {
		if (data == null)
			data = new ArrayList<RegionsData>();
		RegionsData rd = new RegionsData(name);
		data.add(rd);
	}
	@Override
	public JSONObject getElement() {
		// TODO Auto-generated method stub
		JSONObject json = new JSONObject();
		if (data == null || data.size() == 0)
			log.warn("geo������");
		List<Object> dataList = new ArrayList<Object>();
		for (RegionsData rd : data) {
				dataList.add(rd.getElement());
		}
		json.put(Constants.geo_data, dataList);
		json.putAll(this.getAttributes());
		return json;
	}

}
