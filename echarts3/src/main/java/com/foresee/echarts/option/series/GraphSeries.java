package com.foresee.echarts.option.series;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.foresee.echarts.dataview.GraphLinesData;
import com.foresee.echarts.util.ChartType;
import com.foresee.echarts.util.Constants;

public class GraphSeries extends Series{
	private List<GraphLinesData>data=new ArrayList<GraphLinesData>();
	public GraphSeries() {
		this.setType(ChartType.bar.name());
	}
	@Override
	public JSONObject getElement() {
		JSONObject json = super.getElement();
		JSONArray list = new JSONArray();
		for (GraphLinesData gd : data){
			list.add(gd.getElement());
		}
		json.put(Constants.lines, list);
		return json;
	}
}
