package com.foresee.echarts.option.series;

import com.alibaba.fastjson.JSONObject;
import com.foresee.echarts.util.ChartType;
import com.foresee.echarts.util.Constants;

/*
 * 可以不创建的，直接在Series用构造函数即可。
 * 创建为了便于分清，哪个建造的
 */
public class LineSeries extends StackSeries {
	// smooth默认false,是否平滑显示
	private boolean smooth = false;
	
	private JSONObject areaStyle = new JSONObject();

	public boolean isSmooth() {
		return smooth;
	}

	public void setSmooth(boolean smooth) {
		this.smooth = smooth;
	}

	public LineSeries() {
		this.setType(ChartType.line.name());
	}
	
	public JSONObject getAreaStyle() {
		return areaStyle;
	}
	
	public void setAreaStyle(JSONObject areaStyle) {
		this.areaStyle = areaStyle;
	}
	public void putAreaStyleValues(String key, Object value) {
		this.areaStyle.put(key, value);
	}
	
	@Override
	public JSONObject getElement() {
		JSONObject json = super.getElement();
		json.put(Constants.smooth, smooth);
//		json.put(Constants.areaStyle, areaStyle);
		return json;
	}
}
