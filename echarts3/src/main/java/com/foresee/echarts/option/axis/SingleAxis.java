package com.foresee.echarts.option.axis;

import java.util.ArrayList;
import java.util.List;

import com.foresee.echarts.dataview.AxisData;

public class SingleAxis extends Axis{
private List<Object> data;
	
	public List<Object> getSingleAxisData() {
		return data;
	}

	public void setSingleAxisData(List<Object>data) {
		this.data = data;
	}
	
	public void addSingleAxisData(Object axisData){
		if(data == null)
			data = new ArrayList<Object>();
		data.add(axisData);
	}
	public void addSingleAxisData(String axisDataValue){
		if(data == null)
			data = new ArrayList<Object>();
			AxisData ad = new AxisData(axisDataValue);
			data.add(ad);
	}

}
