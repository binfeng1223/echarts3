package com.foresee.echarts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.foresee.echarts.model.LineModel;
import com.foresee.echarts.option.axis.Axis;
import com.foresee.echarts.option.series.LineSeries;
import com.foresee.echarts.option.series.Series;
import com.foresee.echarts.output.LineOutput;
import com.foresee.echarts.util.Constants;
import com.foresee.echarts.util.EchartsUtil;

public class TestLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LineModel model = (LineModel) EchartsUtil.getModelByType("line");
		//title
		model.setTitleText("line图测试");
		model.getTitle().addAttribute("show", true);
		
		model.addLegendData("firstLine");
		model.addLegendData("secondLine");
		model.addLegendData("thirdLine");
		model.addLegendData("fourLine");
		
		//AXIS
		Axis y= new Axis();
		y.addAttribute("type", "value");
		model.addYAxis(y);
		
		Axis x = new Axis();
		x.addAttribute("type", "category");
		x.addAttribute("name", "日期");
		x.addAxisData("mon");
		x.addAxisData("tue");
		x.addAxisData("Wen");
		x.addAxisData("thu");
		x.addAxisData("fri");
		x.addAxisData("sar");
		x.addAxisData("sun");
		model.addXAxis(x);
		
		//series
		List<Series> seriesList = new ArrayList<Series>();
		model.setSeriesList(seriesList);
		
		LineSeries series =(LineSeries) EchartsUtil.getSeriesByType("line");
		series.addAttribute("name", "firstLine");
		Object[] sdata = new Double[]{20d,30d,15d,18d,20.3,18.0,33.2};
		series.setData(Arrays.asList(sdata));
//		series.putAreaStyleValues(Constants.areaStyle_normal, new Object());//测试面积颜色
		series.setSmooth(true); //圆滑曲线图
		model.addSeries(series);
		
		series =(LineSeries) EchartsUtil.getSeriesByType("line");
		series.addAttribute("name", "secondLine");
		sdata = new Double[]{13d,22d,14.3d,17.2,21.6,43.0,27.2};
		series.setData(Arrays.asList(sdata));
		model.addSeries(series);
		
		series =(LineSeries) EchartsUtil.getSeriesByType("line");
		series.addAttribute("name", "thirdLine");
		sdata = new Double[]{23d,12d,17.3d,42.2,51.6,41.0,37.2};
		series.setData(Arrays.asList(sdata));
		series.setSmooth(true);
		model.addSeries(series);
		
		series =(LineSeries) EchartsUtil.getSeriesByType("line");
		series.addAttribute("name", "fourLine");
		sdata = new Double[]{33d,12d,44.3d,27.2,31.6,23.0,24.2};
		series.setData(Arrays.asList(sdata));
//		series.putAreaStyleValues(Constants.areaStyle_normal, new Object());
		model.addSeries(series);
		

		LineOutput line = new LineOutput();
		
		line.setModel(model);

		System.out.println(line.getJSON());
		
	}
}
