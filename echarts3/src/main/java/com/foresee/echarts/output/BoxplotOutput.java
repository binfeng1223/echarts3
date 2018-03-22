package com.foresee.echarts.output;

public class BoxplotOutput extends BaseOutput{
	@Override
	public String getJSON() {
		return this.getElement().toString();
	}
}