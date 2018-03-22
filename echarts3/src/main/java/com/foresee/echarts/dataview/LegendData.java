package com.foresee.echarts.dataview;

import com.alibaba.fastjson.JSONObject;
import com.foresee.echarts.option.Option;
import com.foresee.echarts.option.TextStyle;

public class LegendData extends Option{
	private String name = "";
	private String icon;
	private TextStyle textStyle;
	
	public LegendData() {
		
	}
	
	public LegendData(String name) {
		this(name, null, null);
	}
	
	public LegendData(String name, String icon, TextStyle textStyle){
		this.setName(name);
		this.setIcon(icon);
		this.setTextStyle(textStyle);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name != null)
			this.name = name;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public TextStyle getTextStyle() {
		return textStyle;
	}
	public void setTextStyle(TextStyle textStyle) {
		this.textStyle = textStyle;
	}
	
	public boolean isOnlyName() {
		if((icon != null && !"".equals(icon.trim())) 
				|| (textStyle != null && !textStyle.getElement().isEmpty()) )
			return false;
		else
			return true;
	}
	
	@Override
	public JSONObject getElement() {
		this.addAttribute("name", name);
		if(icon !=null && !"".equals(icon))
			this.addAttribute("icon", icon);
		if(textStyle != null)
			this.addAttribute("textStyle", textStyle.getElement());
		return this.getAttributes();
	}
	
}
