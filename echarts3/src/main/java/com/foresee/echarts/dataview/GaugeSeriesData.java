package com.foresee.echarts.dataview;

import com.alibaba.fastjson.JSONObject;
import com.foresee.echarts.option.Option;

/**
 * 改变value方法 app.timeTicket = setInterval(function (){
 * option.series[0].data[0].value = 值; myChart.setOption(option,true); },秒);
 * 
 *（data在配置中未有指定，根据图例内容编写）
 */
public class GaugeSeriesData extends Option {
	private String name;// 仪表中间显示名称
	private String value;// 指针指向值

	public GaugeSeriesData(){
		
	}
	
	public GaugeSeriesData(String value){
		this(null,value);
	}
	
	public GaugeSeriesData(String name,String value){
		this.setName(name);
		this.setValue(value);
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public boolean isOnlyValue() {
		if ((name != null && !"".equals(name.trim())))
			return false;
		else
			return true;
	}

	@Override
	public JSONObject getElement() {
		// TODO Auto-generated method stub
		this.addAttribute("value", value);
		if (name != null && !"".equals(name))
			this.addAttribute("name", name);
		return this.getAttributes();
	}

}
