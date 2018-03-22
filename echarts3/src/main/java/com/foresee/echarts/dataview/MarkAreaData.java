package com.foresee.echarts.dataview;

import com.alibaba.fastjson.JSONObject;
import com.foresee.echarts.option.Option;

public class MarkAreaData extends Option{
	private String name;
	private String type;
	private String valueIndex;
	private String valueDim;
	private String coord[]=new String[2];;
	private String x;
	private String y;
	private String value;
	
	
//	private LineStyle lineStyle;
//	private Label label;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getValueIndex() {
		return valueIndex;
	}
	public void setValueIndex(String valueIndex) {
		this.valueIndex = valueIndex;
	}
	public String getValueDim() {
		return valueDim;
	}
	public void setValueDim(String valueDim) {
		this.valueDim = valueDim;
	}
	public String[] getCoord() {
		return coord;
	}
	public void setCoord(String[] coord) {
		this.coord = coord;
	}
	public void setCoord(String x,String y) {
		this.coord[0] = x;
		this.coord[1]=y;
	}
	public String getX() {
		return x;
	}
	public void setX(String x) {
		this.x = x;
	}
	public String getY() {
		return y;
	}
	public void setY(String y) {
		this.y = y;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	@Override
	public JSONObject getElement() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
