package com.foresee.echarts.option.series;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.alibaba.fastjson.JSONObject;
import com.foresee.echarts.util.ChartType;
import com.foresee.echarts.util.Constants;

/**
 * 饼图的数据系列
 * 
 * @author ROLL
 *
 */
public class PieSeries extends Series {
	protected static final Logger log = Logger.getLogger(PieSeries.class);
	// 南丁格尔图,值为默认false、radius（区域半径都百分比区别）、area（区域同大，半径区分）
	private String roseType = "false";
	private List<String> radius = new ArrayList<String>();

	public String getRoseType() {
		return roseType;
	}

	public void setRoseType(String roseType) {
		if ("radius".equals(roseType.trim()) || "area".equals(roseType.trim())
				|| "false".equals(roseType.trim()))
			this.roseType = roseType;
		else
			log.error("roseType设值出错!默认使用false值。");
	}

	public PieSeries() {
		this.setType(ChartType.pie.name());
	}
	
	public void addBeginRadius(String begin){
		radius.add(begin);
	}
	
	public void addEndRadius(String end){
		radius.add(end);
	}

	@Override
	public JSONObject getElement() {
		JSONObject json = super.getElement();
//		if (!"false".equals(roseType.trim()))
//			json.put(Constants.pie_roseType, roseType);
//		if(radius != null && radius.size() == 2)
//			json.put(Constants.pie_radius, radius);
		json.put(Constants.pie_radius, "40%");
		return json;
	}
}
