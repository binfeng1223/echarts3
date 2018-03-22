package com.foresee.echarts.dataview;

import com.alibaba.fastjson.JSONObject;
import com.foresee.echarts.option.Option;


public class RegionsData extends Option{
	private String name;
	private boolean selected=false;
//	private ItemStyle itemStyle;
//	private Label label;
	
	public RegionsData(){
		
	}
	
	public RegionsData(String name){
		this(name,false);
	}
	
	public RegionsData(String name,boolean selected){
		this.setName(name);
		this.setSelected(selected);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	@Override
	public JSONObject getElement() {
		// TODO Auto-generated method stub
		this.addAttribute("name", name);
		this.addAttribute("selected", selected);
		return this.getAttributes();
	}

}
