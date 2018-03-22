package com.foresee.echarts.option.axis;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.alibaba.fastjson.JSONObject;
import com.foresee.echarts.dataview.AxisData;
import com.foresee.echarts.option.Option;


public class Axis extends Option {
	private static final Logger log = Logger.getLogger(Axis.class);
	private List<Object> data;

	public List<Object> getData() {
		return data;
	}

	public void setData(List<Object> data) {
		this.data = data;
	}

	public void addAxisData(Object axisData) {
		if (data == null)
			data = new ArrayList<Object>();
		data.add(axisData);
	}
	
	public void addAxisData(String axisDataValue) {
			if (data == null)
				data = new ArrayList<Object>();
			AxisData ad = new AxisData(axisDataValue);
			data.add(ad);
		}

	@Override
	public JSONObject getElement() {
		JSONObject json = new JSONObject();
		if (data == null || data.size()==0) {
			log.warn("�����겻����");
		} else {
				List<Object> dataList = new ArrayList<Object>();
				for (Object ld : this.data) {
					AxisData ad=(AxisData)ld;
					if (ad.isOnlyValue())
						dataList.add(ad.getValue());
					else
						dataList.add(ad.getElement());
				}
				this.addAttribute("data", dataList);
		}
		json.putAll(this.getAttributes());
		return json;
	}
}
