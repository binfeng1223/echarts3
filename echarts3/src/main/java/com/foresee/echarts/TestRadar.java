package com.foresee.echarts;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.foresee.echarts.model.RadarModel;
import com.foresee.echarts.option.series.RadarSeries;
import com.foresee.echarts.option.series.Series;
import com.foresee.echarts.output.RadarOutput;

public class TestRadar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RadarModel model =new RadarModel();

		List<String> s=new  ArrayList<String>();
		s.add("a");s.add("b"); s.add("c");
		model.addRadar(s);
//		model.addRadar("a");
//		model.addRadar("b");
//		model.addRadar("c");
//		model.addRadar("d");
//		List<Radar> radarList=new  ArrayList<Radar>();
//
//		Radar r=new Radar();
//		r.addIndicators("a");
//		r.addIndicators("b");
//		r.addIndicators("c");
//		r.addIndicators("d");
//
//		radarList.add(r);
//
//		r=new Radar();
//		r.addIndicators("e");
//		r.addIndicators("f");
//		r.addIndicators("g");
//		r.addIndicators("h");
//
//		radarList.add(r);
//
//		model.setRadarList(radarList);

		List<Series> seriesList = new ArrayList<Series>();
		RadarSeries series = new RadarSeries();
		series.addAttribute("name", "测试1");

		List<Object> sData = new ArrayList<Object>();
		JSONObject sd = new JSONObject();
		sd.put("value", "[100, 8, 0.40, -80, 2000]");
		sd.put("name", "A");
		sData.add(sd);
		sd = new JSONObject();
		sd.put("value", "[60, 5, 0.30, -100, 1500]");
		sd.put("name", "B");
		sData.add(sd);
		series.setData(sData);

		seriesList.add(series);

		series = new RadarSeries();
		series.addAttribute("name", "测试2");
		sData = new ArrayList<Object>();
		sd = new JSONObject();
		sd.put("value", "[120, 118, 130, 100, 99, 70]");
		sd.put("name", "D");
		sData.add(sd);
		sd = new JSONObject();
		sd.put("value", "[90, 113, 140, 30, 70, 60]");
		sd.put("name", "E");
		sData.add(sd);

		series.setData(sData);

		seriesList.add(series);

		model.setSeriesList(seriesList);

		RadarOutput radar = new RadarOutput();
		radar.setModel(model);

		System.out.println(radar.getJSON());

	}

}
