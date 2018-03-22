package com.foresee.echarts.option;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSONObject;

public class Brush extends Option{
	//可选值rect, polygon,lineX,lineY,keep,clear.
	private List<Object> toolbox = new ArrayList<Object>(6);
//	 brushLink: null,
//	 seriesIndex: 'all',
//	 geoIndex: null,
//	 xAxisIndex: null,
//	 yAxisIndex: null,
//	 brushType: 'rect',
//	 brushMode: 'single',
//	 transformable: true,
//	 brushStyle: {...},
//	 throttleType: 'fixRate',
//	 throttleDelay: 0,
//	 removeOnClick: true,
//	 inBrush: {...},
//	 outOfBrush: {...},
	@Override
	public JSONObject getElement() {
		// TODO Auto-generated method stub
		return this.getAttributes();
	}

}
