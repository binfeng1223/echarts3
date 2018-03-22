package com.foresee.echarts.option.axis;

import java.util.ArrayList;
import java.util.List;

import com.foresee.echarts.dataview.AxisData;


public class AngleAxis extends Axis {
private List<Object> data;
	
	public List<Object> getAngleAxisData() {
		return data;
	}

	public void setAngleAxisData(List<Object>data) {
		this.data = data;
	}
	
	public void addAngleAxisData(Object axisData){
		if(data == null)
			data = new ArrayList<Object>();
		data.add(axisData);
	}
	public void addAngleAxisData(String axisDataValue){
		if(data == null)
			data = new ArrayList<Object>();
			AxisData ad = new AxisData(axisDataValue);
			data.add(ad);	
	}
}
