package com.foresee.echarts.option.series;

import com.foresee.echarts.util.ChartType;

public class BarSeries extends StackSeries{
	
	public BarSeries() {
		this.setType(ChartType.bar.name());
	}

}