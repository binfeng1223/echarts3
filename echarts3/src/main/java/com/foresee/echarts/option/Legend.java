package com.foresee.echarts.option;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.alibaba.fastjson.JSONObject;
import com.foresee.echarts.dataview.LegendData;
import com.foresee.echarts.util.Constants;

/**
 * echarts配置项-图例
 * 
 * @author ROLL
 *
 */
public class Legend extends Option {
	private static final Logger log = Logger.getLogger(Legend.class);
	private List<LegendData> data;

	public List<LegendData> getData() {
		return data;
	}

	public void setData(List<LegendData> data) {
		this.data = data;
	}

	public void addLegendData(LegendData legendData) {
		if (data == null)
			data = new ArrayList<LegendData>();
		data.add(legendData);
	}

	public void addLegendData(String seriesName) {
		if (data == null)
			data = new ArrayList<LegendData>();
		LegendData ld = new LegendData(seriesName);
		data.add(ld);
	}

	@Override
	public JSONObject getElement() {
		JSONObject json = new JSONObject();
		// 转换属性key
		if (data == null || data.size() == 0)
			log.warn("图例项的系列名称不存在");
		else {
			List<Object> dataList = new ArrayList<Object>();
			for (LegendData ld : data) {
				if (ld.isOnlyName())
					dataList.add(ld.getName());
				else
					dataList.add(ld.getElement());
			}
			json.put(Constants.option_data, dataList);
		}
		// TODO 处理形如series.label.normal.show = false
		json.putAll(this.getAttributes());
		return json;
	}
}
