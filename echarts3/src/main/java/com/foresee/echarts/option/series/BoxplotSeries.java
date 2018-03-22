package com.foresee.echarts.option.series;

import com.foresee.echarts.util.ChartType;

public class BoxplotSeries extends Series{

	public BoxplotSeries() {
		this.setType(ChartType.boxplot.name());
	}
}
