package com.foresee.echarts;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.foresee.echarts.model.PieModel;
import com.foresee.echarts.option.series.PieSeries;
import com.foresee.echarts.option.series.Series;
import com.foresee.echarts.output.PieOutput;
import com.foresee.echarts.util.EchartsUtil;

public class TestPie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PieModel model = (PieModel) EchartsUtil.getModelByType("pie");
		//title
		model.setTitleText("pie图测试");
		model.getTitle().addAttribute("show", true);
		//legend
		model.addLegendData("A");
		model.addLegendData("B");
		model.addLegendData("C");
		model.addLegendData("D");
		model.addLegendData("E");
		model.addLegendData("F");
		model.addLegendData("G");
		//series
		List<Series> seriesList = new ArrayList<Series>();
		model.setSeriesList(seriesList);
		
		PieSeries series =(PieSeries) EchartsUtil.getSeriesByType("pie");
		series.addAttribute("name", "我的bar");
		series.addAttribute("barWidth", "60%");
		series.addAttribute("selectedMode", "single");
		series.addBeginRadius("0");
		series.addEndRadius("30%");
		
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
		
		series = (PieSeries) EchartsUtil.getSeriesByType("pie");
		series.addAttribute("name", "测试");
		series.addAttribute("selectedMode", "single");
		series.addBeginRadius("50%");
		series.addEndRadius("70%");
		sData = new ArrayList<Object>();
		sd = new JSONObject();
		sd.put("value", 100);
		sd.put("name", "D");
		sData.add(sd);
		sd = new JSONObject();
		sd.put("value", 200);
		sd.put("name", "E");
		sData.add(sd);
		sd = new JSONObject();
		sd.put("value", 300);
		sd.put("name", "F");
		sData.add(sd);
		sd = new JSONObject();
		sd.put("value", 400);
		sd.put("name", "G");
		sData.add(sd);
		series.setData(sData);
		model.addSeries(series);

//		//AXIS
//		YAxis y=model.getyAxis();
//		y.addAttribute("type", "value");
//		y.addAxisData("a");
//		y.addAxisData("b");
//		model.addYaxis(y);
//		
//		XAxis x = model.getxAxis();
//		x.addAttribute("type", "category");
//		x.addAttribute("name", "a");
//		x.addAxisData("a");
//		x.addAxisData("b");
//		x.addAxisData("c");
//		model.addXaxis(x);
//
//		//visualMap
//		model.addVisualMap("piecewise");
//
//		//datazoom
//		model.addDataZoom("slider");
		
		//grid
//		Grid grid=new Grid();
//		grid.addAttribute("min",10);
//		//model.addGrid(grid);
//		
//		model.addOptionPro(grid);
		
		PieOutput pie = new PieOutput();
		
		pie.setModel(model);

		System.out.println(pie.getJSON());
		
//		LineOutput line = new LineOutput();
//		line.setModel(ModelUtil.getModelByType(model, "line"));
//		System.out.println(line.getJSON());
//		line.setModel(ModelUtil.getModelByType(model, "bar"));
//		System.out.println(line.getJSON());
	}
}
