package com.foresee.echarts.option.series;

import com.foresee.echarts.util.ChartType;

public class FunnelSeries extends Series{
	public FunnelSeries() {
		this.setType(ChartType.funnel.name());
	}
}
