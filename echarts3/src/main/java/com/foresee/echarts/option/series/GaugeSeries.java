package com.foresee.echarts.option.series;

import com.foresee.echarts.util.ChartType;

public class GaugeSeries extends Series{
	public GaugeSeries() {
		this.setType(ChartType.gauge.name());
	}

}