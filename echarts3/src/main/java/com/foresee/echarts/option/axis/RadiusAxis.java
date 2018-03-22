package com.foresee.echarts.option.axis;

import java.util.ArrayList;
import java.util.List;

import com.foresee.echarts.dataview.AxisData;

/**
 * echarts
 * @author ROLL
 *
 */
public class RadiusAxis extends Axis {
private List<Object> data;
	
	public List<Object> getRadiusAxisData() {
		return data;
	}

	public void setRadiusAxisData(List<Object>data) {
		this.data = data;
	}
	
	public void addRadiusAxisData(Object axisData){
		if(data == null)
			data = new ArrayList<Object>();
		data.add(axisData);
	}
	public void addRadiusAxisData(String axisDataValue){
		if(data == null)
			data = new ArrayList<Object>();
			AxisData ad = new AxisData(axisDataValue);
			data.add(ad);
	}

}