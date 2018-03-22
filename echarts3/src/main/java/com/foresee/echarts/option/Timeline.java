package com.foresee.echarts.option;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.alibaba.fastjson.JSONObject;
import com.foresee.echarts.dataview.TimelineData;
import com.foresee.echarts.util.Constants;

public class Timeline extends Option{
	private static final Logger log = Logger.getLogger(Timeline.class);
	//目前只支持为 slider,只提供get方法
	private String type="slider";
	private List<TimelineData> data;
	public List<TimelineData> getData() {
		return data;
	}
	public void setData(List<TimelineData> data) {
		this.data = data;
	}
	public String getType() {
		return type;
	}
	
	public void addTimelineData(TimelineData timelineData){
		if(data == null)
			data = new ArrayList<TimelineData>();
		data.add(timelineData);
	}
	
	public void addTimelineData(String value){
		if(data == null)
			data = new ArrayList<TimelineData>();
		TimelineData td = new TimelineData(value);
		data.add(td);
	}
	@Override
	public JSONObject getElement() {
		// TODO Auto-generated method stub
		JSONObject json = new JSONObject();
		// 转换属性key
		if (data == null || data.size() == 0)
			log.warn("timeline不存在");
	
		List<Object> dataList = new ArrayList<Object>();
		for(TimelineData td : data){
			if(td.isOnlyValue())
				dataList.add(td.getValue());
			else
				dataList.add(td.getElement());
		}
		json.put(Constants.timeline_data, dataList);
		json.putAll(this.getAttributes());
		return json;
	}

}
