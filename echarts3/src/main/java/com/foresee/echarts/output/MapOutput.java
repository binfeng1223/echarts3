package com.foresee.echarts.output;

public class MapOutput extends BaseOutput{
	
	@Override
	public String getJSON() {
		return this.getElement().toString();
	}
}
