package com.foresee.echarts.dataview;

import com.alibaba.fastjson.JSONObject;
import com.foresee.echarts.option.Option;

/**
 * 标线的数据
 * 分为单个数据（一个数据可以指定如平均值、线条等）格式为{}
 * 双个数据格式为[{开始位置},{终点位置}]
 *
 */
public class MarkLineData extends Option{
	//type可选值min、max、average
	private String type;
	//仅当存在type时可用
	private String valueIndex;
	private  String coord[]=new String[2];
	private String x;
	private String y;
	private String value;
	private String name;
	private String yAxis;
	private String xAxis;
	
//	private LineStyle lineStyle;
//	private Label label;
	
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getyAxis() {
		return yAxis;
	}
	public void setyAxis(String yAxis) {
		this.yAxis = yAxis;
	}
	public String getxAxis() {
		return xAxis;
	}
	public void setxAxis(String xAxis) {
		this.xAxis = xAxis;
	}
	@Override
	public JSONObject getElement() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
