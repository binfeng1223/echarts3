package com.foresee.echarts.model;

import java.util.ArrayList;
import java.util.List;

import com.foresee.echarts.option.Geo;

public class ScatterModel extends 	AxisModel{
	private List<Geo> geoList=new ArrayList<Geo>();

	public List<Geo> getGeoList() {
		return geoList;
	}

	public void setGeoList(List<Geo> geoList) {
		this.geoList = geoList;
	}
}
