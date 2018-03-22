package com.foresee.echarts.model;

import java.util.ArrayList;
import java.util.List;

import com.foresee.echarts.option.DataZoom;
import com.foresee.echarts.option.Grid;
import com.foresee.echarts.option.axis.Axis;

/**
 * 与下，y轴有关的option属性有：
 *  brush//（区域选择组件/支持图形scatter、bar、candlestick（k线图）；在toolbox启用）
 *  grid //（直角坐标系内绘图网格）
 * dataZoom //（dataZoom 组件主要对数轴）
 * geo //（地理坐标系组件/散点图，线集）
 * radiusAxis //（极坐标系的半径轴）
 * angleAxis //（极坐标系的角度轴）
 * parallel //（平行坐标系）
 * parallelAxis //（平行坐标系中的坐标轴） 
 * singleAxis //（单轴）可以被应用到散点图中展现一维数据
 * polar //(散点和折线图)
 */
/*
 * 提供x，y轴model，提供给有x/y轴的model继承 可以使用list<XAxis>具体值或者List<Object>
 * 使用Object要在具体模型使用时转换
 */
public class AxisModel extends Model {

	private List<Axis> xAxisList = new ArrayList<Axis>();
	private List<Axis> yAxisList = new ArrayList<Axis>();

	private List<DataZoom> dataZoomList = new ArrayList<DataZoom>();
	private List<Grid> girdList = new ArrayList<Grid>();

	// 每一次返回都要清空值，方便以后使用，无set方法
	public Axis getYAxis(int index) {
		Axis a = null;
		//Y坐标最多允许2个轴
		if(yAxisList.size() > 0){
			return yAxisList.get(index);
		}
		return a;
	}

	// 每一次返回都要清空值，方便以后使用，无set方法
	public Axis getXAxis(int index) {
		Axis a = null;
		//X坐标最多允许2个轴
		if(xAxisList.size() > 0){
			return xAxisList.get(index);
		}
		return a;
	}
	
	public Axis getYAxis() {
		//取Y轴，如果没初始化则先初始化
		Axis ay = getYAxis(0);
		if(ay == null){
			ay = new Axis();
			this.addYAxis(ay);
		}
		return ay;
	}
	
	public Axis getXAxis() {
		Axis ax = getXAxis(0);
		if(ax == null){
			ax = new Axis();
			this.addXAxis(ax);
		}
		return ax;
	}

	public void addDataZoom(DataZoom dz) {
		dataZoomList.add(dz);
	}

	public void addDataZoom(String dataZoomtype) {
		DataZoom dz = null;
		if ("".equals(dataZoomtype.trim()) || dataZoomtype == null) {
			dz = new DataZoom();
		} else {
			dz = new DataZoom(dataZoomtype);
		}
		dataZoomList.add(dz);
	}

	public List<DataZoom> getDataZoomList() {
		return dataZoomList;
	}

	public void setDataZoomList(List<DataZoom> dataZoomList) {
		this.dataZoomList = dataZoomList;
	}

	public void addGrid(Grid grid) {
		girdList.add(grid);
	}

	public List<Grid> getGirdList() {
		return girdList;
	}

	public void setGirdList(List<Grid> girdList) {
		this.girdList = girdList;
	}

	public List<Axis> getXAxisList() {
		return xAxisList;
	}

	public void setXAxisList(List<Axis> xAxisList) {
		this.xAxisList = xAxisList;
	}

	public List<Axis> getYAxisList() {
		return yAxisList;
	}

	public void setYAxisList(List<Axis> yAxisList) {
		this.yAxisList = yAxisList;
	}

	public void addXAxis(Axis xAxis) {
		this.xAxisList.add(xAxis);
	}

	public void addYAxis(Axis yAxis) {
		this.yAxisList.add(yAxis);
	}

	/**
	 * 如果只有一个轴，index默认0
	 * @param index default 0
	 * @param axisDataValue
	 */
	public void addXAxisData(int index, String axisDataValue) {
		Axis x = this.getXAxis(index);
		if(x == null)
			x = new Axis();
		x.addAxisData(axisDataValue);
		this.addXAxis(x);
	}
	
	public void addXAxisData(String axisDataValue) {
		this.addXAxisData(0, axisDataValue);
	}

	public void addYAxisData(int index, String axisDataValue) {
		Axis y = this.getYAxis(index);
		if(y == null)
			y = new Axis();
		y.addAxisData(axisDataValue);
		yAxisList.add(y);
	}
	
	public void addYAxisData(String axisDataValue) {
		this.addYAxisData(0, axisDataValue);
	}
}
