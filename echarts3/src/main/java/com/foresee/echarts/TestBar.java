package com.foresee.echarts;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.foresee.echarts.model.BarModel;
import com.foresee.echarts.option.axis.Axis;
import com.foresee.echarts.option.series.BarSeries;
import com.foresee.echarts.option.series.Series;
import com.foresee.echarts.output.BarOutput;
import com.foresee.echarts.util.EchartsUtil;

public class TestBar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BarModel model = (BarModel) EchartsUtil.getModelByType("bar");
		//title
		model.setTitleText("bar图测试");
		model.getTitle().addAttribute("show", true);
		
		model.addLegendData("FirstBar");
		model.addLegendData("TwoBar");
		//series
		List<Series> seriesList = new ArrayList<Series>();
		model.setSeriesList(seriesList);
		
		BarSeries series =(BarSeries) EchartsUtil.getSeriesByType("bar");
		series.addAttribute("name", "FirstBar");
		
		List<Object> sData = new ArrayList<Object>();
		JSONObject sd = new JSONObject();
		sd.put("value", 200);
		sd.put("name", "A");
		sData.add(sd);
		sd = new JSONObject();
		sd.put("value", 300);
		sd.put("name", "B");
		sData.add(sd);
		sd = new JSONObject();
		sd.put("value", 500);
		sd.put("name", "C");
		sData.add(sd);
		series.setData(sData);
		model.addSeries(series);
		
		series =(BarSeries) EchartsUtil.getSeriesByType("bar");
		series.addAttribute("name", "TwoBar");
		
		sData = new ArrayList<Object>();
		sd = new JSONObject();
		sd.put("value", 150);
		sd.put("name", "A");
		sData.add(sd);
		sd = new JSONObject();
		sd.put("value", 420);
		sd.put("name", "B");
		sData.add(sd);
		sd = new JSONObject();
		sd.put("value", 330);
		sd.put("name", "C");
		sData.add(sd);
		series.setData(sData);
		model.addSeries(series);
		
		//AXIS
//		Axis y= new Axis();
//		y.addAttribute("type", "value");
//		model.addYAxis(y);
		model.getYAxis().addAttribute("type", "value");
		
		Axis x = new Axis();
		x.addAttribute("type", "category");
		x.addAttribute("name", "日期");
		x.addAxisData("A");
		x.addAxisData("B");
		x.addAxisData("C");
		model.addXAxis(x);

//		//visualMap
//		model.addVisualMap("piecewise");
//
//		//datazoom
//		model.addDataZoom("slider");
//		
//		//grid
//		Grid grid=new Grid();
//		grid.addAttribute("min",10);
//		model.addGrid(grid);
//		
//		model.addOptionPro(grid);
		
		BarOutput bar = new BarOutput();
		
		bar.setModel(model);

		System.out.println(bar.getJSON());
		
//		LineOutput line = new LineOutput();
//		line.setModel(ModelUtil.getModelByType(model, "line"));
//		System.out.println(line.getJSON());
//		line.setModel(ModelUtil.getModelByType(model, "bar"));
//		System.out.println(line.getJSON());
	}
}
