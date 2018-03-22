package com.foresee.echarts.util;

import com.foresee.echarts.model.AxisModel;
import com.foresee.echarts.model.BarModel;
import com.foresee.echarts.model.FunnelModel;
import com.foresee.echarts.model.GaugeModel;
import com.foresee.echarts.model.LineModel;
import com.foresee.echarts.model.MapModel;
import com.foresee.echarts.model.Model;
import com.foresee.echarts.model.PieModel;
import com.foresee.echarts.model.RadarModel;
import com.foresee.echarts.model.ScatterModel;
import com.foresee.echarts.option.series.BarSeries;
import com.foresee.echarts.option.series.FunnelSeries;
import com.foresee.echarts.option.series.GaugeSeries;
import com.foresee.echarts.option.series.LineSeries;
import com.foresee.echarts.option.series.MapSeries;
import com.foresee.echarts.option.series.PieSeries;
import com.foresee.echarts.option.series.RadarSeries;
import com.foresee.echarts.option.series.ScatterSeries;
import com.foresee.echarts.option.series.Series;
import com.foresee.echarts.output.BarOutput;
import com.foresee.echarts.output.FunnelOutput;
import com.foresee.echarts.output.GaugeOutput;
import com.foresee.echarts.output.Output;
import com.foresee.echarts.output.LineOutput;
import com.foresee.echarts.output.MapOutput;
import com.foresee.echarts.output.PieOutput;
import com.foresee.echarts.output.RadarOutput;
import com.foresee.echarts.output.ScatterOutput;

public class EchartsUtil {
	public static Model getModelByType(String type) {
		Model model = new Model();
		try {
			ChartType chartType = ChartType.valueOf(type);
			switch (chartType) {
				case line:
					model = new LineModel();
					break;
				case bar:
					model = new BarModel();
					break;
				case pie:
					model = new PieModel();
					break;
				case map:
					model = new MapModel();
					break;
				case scatter:
					model = new ScatterModel();
					break;
				case gauge:
					model = new GaugeModel();
					break;
				case radar:
					model = new RadarModel();
					break;
				case funnel:
					model = new FunnelModel();
					break;
				default:
					break;
			}
		} catch (Exception e) {
			return new Model();
		}

		return model;
	}


	public static Series getSeriesByType(String type) {
		Series series = new Series();
		try {
			ChartType chartType = ChartType.valueOf(type);
			switch (chartType) {
				case line:
					series = new LineSeries();
					break;
				case bar:
					series = new BarSeries();
					break;
				case pie:
					series = new PieSeries();
					break;
				case map:
					series = new MapSeries();
					break;
				case scatter:
					series = new ScatterSeries();
					break;
				case gauge:
					series = new GaugeSeries();
					break;
				case radar:
					series = new RadarSeries();
					break;
				case funnel:
					series = new FunnelSeries();
					break;
				default:
					break;
			}
		} catch (Exception e) {
			return new Series();
		}

		return series;
	}


	public static Output getOutputByType(String type) {
		Output output = null;
		try {
			ChartType chartType = ChartType.valueOf(type);
			switch (chartType) {
				case line:
					output = new LineOutput();
					break;
				case bar:
					output = new BarOutput();
					break;
				case pie:
					output = new PieOutput();
					break;
				case map:
					output = new MapOutput();
					break;
				case scatter:
					output = new ScatterOutput();
					break;
				case gauge:
					output = new GaugeOutput();
					break;
				case radar:
					output = new RadarOutput();
					break;
				case funnel:
					output = new FunnelOutput();
					break;
				default:
					break;
			}
		} catch (Exception e) {
			return output;
		}

		return output;
	}
	/*
	 * model之间的转换，实质性是改变的是series的type，其他情况还要改变data中的数据
	 * 如下只做简单转换需求line and bar 转换
	 * 方式：
	 * 1.数据拷贝并改变type
	 * 2.只改变type(主要的类型未改变)
	 */
	public static Model getModelByType(Model model, String type) {
		//向上转换model获得足够的方法
		AxisModel gmodel=(AxisModel)getModelByType(type);
		gmodel.setTitle(model.getTitle());
		gmodel.setAttributes(model.getAttributes());
		gmodel.setLegend(model.getLegend());
		for(int i=0;i<model.getSeriesList().size();i++){
			model.addSeriesType(i, type);
		}
		gmodel.setVisualMapList(model.getVisualMapList());
		gmodel.setDataZoomList(((AxisModel)model).getDataZoomList());
		gmodel.setGirdList(((AxisModel)model).getGirdList());
		gmodel.setSeriesList(model.getSeriesList());
		if(((AxisModel)model).getXAxisList()!=null){
			gmodel.setXAxisList(((AxisModel)model).getXAxisList());
		}
		if(((AxisModel)model).getYAxisList()!=null){
			gmodel.setYAxisList(((AxisModel)model).getYAxisList());
		}
		return gmodel;
	}
}

