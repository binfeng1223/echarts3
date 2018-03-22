package com.foresee.echarts.option.series;

import com.alibaba.fastjson.JSONObject;
import com.foresee.echarts.util.Constants;

public class StackSeries extends Series{
	
	private String stack;
	public String getStack() {
		return stack;
	}
	public void setStack(String stack) {
		this.stack = stack;
	}
	
	@Override
	public JSONObject getElement() {
		// TODO Auto-generated method stub
		JSONObject json = super.getElement();
		if(stack != null && !stack.trim().equals(""))
			json.put(Constants.series_stack, stack);
		return super.getElement();
	}
}
