package com.foresee.echarts.option.axis;

import java.util.ArrayList;
import java.util.List;

import com.foresee.echarts.dataview.AxisData;

public class ParallelAxis extends Axis{
private List<Object> data;
	
	public List<Object> getParallelAxisData() {
		return data;
	}

	public void setParallelAxisData(List<Object>data) {
		this.data = data;
	}
	
	public void addParallelAxisData(Object axisData){
		if(data == null)
			data = new ArrayList<Object>();
		data.add(axisData);
	}
	public void addParallelAxisData(String axisDataValue){
		if(data == null)
			data = new ArrayList<Object>();
			AxisData ad = new AxisData(axisDataValue);
			data.add(ad);
	}

}