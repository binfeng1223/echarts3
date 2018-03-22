package com.foresee.echarts.option;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.alibaba.fastjson.JSONObject;
import com.foresee.echarts.dataview.MarkLineData;
import com.foresee.echarts.util.Constants;

public class MarkLine extends Option {
	private static final Logger log = Logger.getLogger(MarkLine.class);
	private List<MarkLineData> data;

	@Override
	public JSONObject getElement() {
		// TODO Auto-generated method stub
		JSONObject json = new JSONObject();
		// 转换属性key
		if (data == null || data.size() == 0)
			log.warn("MarkAreaData不存在");
		List<Object> dataList = new ArrayList<Object>();
		for (MarkLineData md : data) {
			dataList.add(md.getElement());
		}
		json.put(Constants.option_data, dataList);
		// TODO 处理形如series.label.normal.show = false
		json.putAll(this.getAttributes());
		return json;
	}

}
