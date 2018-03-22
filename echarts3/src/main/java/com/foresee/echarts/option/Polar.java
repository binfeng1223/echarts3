package com.foresee.echarts.option;

import java.util.ArrayList;
import java.util.List;

public class Polar extends Attributes {
	private String zlevel;//用于 Canvas 分层
	private String z;//控制图形的前后顺序
	private String center[] = new String[2];//极坐标系的中心（圆心）坐标，数组的第一项是横坐标，第二项是纵坐标
	private List<Object> radius = new ArrayList<Object>(2);//极坐标系的半径，数组的第一项是内半径，第二项是外半径
	//geter and seter
	public void setRadius(String x,String y) {
		this.radius.add(x);
		this.radius.add(y);
	}
	
	public void setCenter(String x,String y) {
		this.center[0] = x;
		this.center[1] = y;
	}
	public String getZlevel() {
		return zlevel;
	}

	public void setZlevel(String zlevel) {
		this.zlevel = zlevel;
	}

	public String getZ() {
		return z;
	}

	public void setZ(String z) {
		this.z = z;
	}

	public String[] getCenter() {
		return center;
	}

	public void setCenter(String[] center) {
		this.center = center;
	}

	public List<Object> getRadius() {
		return radius;
	}

	public void setRadius(List<Object> radius) {
		this.radius = radius;
	}
	//方便的属性添加方法
	public Polar zlevel(String zlevel) {
		this.zlevel = zlevel;
		return this;
	}
	
	public Polar z(String z) {
		this.z = z;
		return this;
	}
	public Polar center(String x,String y) {
		this.center[0] = x;
		this.center[1] = y;
		return this;
	}
	
	public Polar center(String[] center) {
		this.center = center;
		return this;
	}

	public Polar radius(String x,String y) {
		this.radius.add(x);
		this.radius.add(y);
		return this;
	}
	
	public Polar radius(List<Object> radius) {
		this.radius = radius;
		return this;
	}

}
