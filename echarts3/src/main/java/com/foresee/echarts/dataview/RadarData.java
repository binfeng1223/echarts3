package com.foresee.echarts.dataview;

import com.alibaba.fastjson.JSONObject;
import com.foresee.echarts.option.Option;

public class RadarData extends Option{
	private String name="";
	private int max=0;
	private int min=0;
	public RadarData(){
		
	}
	public RadarData(String name){
		this(name,0,0);
	}
	public RadarData(String name,int min,int max){
		this.setName(name);
		this.setMin(min);
		this.setMax(max);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	@Override
	public JSONObject getElement() {
		// TODO Auto-generated method stub
		this.addAttribute("name", name);
		if(min !=0)
			this.addAttribute("min", min);
		if(max != 0)
			this.addAttribute("max", max);
		return this.getAttributes();
	}
	
}
