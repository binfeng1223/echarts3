package com.foresee.echarts.model;

import java.util.ArrayList;
import java.util.List;

import com.foresee.echarts.dataview.RadarData;
import com.foresee.echarts.option.Radar;

public class RadarModel extends Model{
	private List<Radar> radarList = new ArrayList<Radar>();

	public List<Radar> getRadarList() {
		return radarList;
	}

	public void setRadarList(List<Radar> radarList) {
		this.radarList = radarList;
	}

	public void addRadar(Radar radar) {
		radarList.add(radar);
	}

	public void addRadar(RadarData radarData) {
		Radar r = new Radar();
		r.addIndicators(radarData);
		radarList.add(r);
	}

	public void addRadar(String name) {
		Radar r = new Radar();
		r.addIndicators(name);
		radarList.add(r);
	}
	public void addRadar(List<String> nameList){
		Radar r = new Radar();
		for(int i=0;i<nameList.size();i++){
			r.addIndicators(nameList.get(i));
		}
		radarList.add(r);
	}
}
