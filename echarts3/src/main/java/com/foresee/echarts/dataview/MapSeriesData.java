package com.foresee.echarts.dataview;

import com.alibaba.fastjson.JSONObject;
import com.foresee.echarts.option.Option;

public class MapSeriesData extends Option{
	private String name;
	private String value;
	private boolean selected=false;
	// private Label label;
	// private ItemStyle itemStyle;
	
	public MapSeriesData(){
		
	}
	
	public MapSeriesData(String value){
		this(null,value,false);
	}
	
	public MapSeriesData(String name,String value){
		this(name,value,false);
	}
	
	public MapSeriesData(String name,String value,boolean selected){
		this.setName(name);
		this.setValue(value);
		this.setSelected(selected);
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

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	public boolean isOnlyValue() {
		if ((name != null && !"".equals(name.trim())) || selected != false)
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
		if (selected != false)
			this.addAttribute("selected", selected);
		return this.getAttributes();
	}

}
