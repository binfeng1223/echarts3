package com.foresee.echarts.option.series;

import com.foresee.echarts.util.ChartType;

public class CandlestickSeries extends Series{
	public CandlestickSeries() {
		this.setType(ChartType.candlestick.name());
	}
}
