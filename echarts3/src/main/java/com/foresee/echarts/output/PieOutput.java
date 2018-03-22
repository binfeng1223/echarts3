package com.foresee.echarts.output;

public class PieOutput extends BaseOutput {
	
	@Override
	public String getJSON() {
		return this.getElement().toString();
	}

}
