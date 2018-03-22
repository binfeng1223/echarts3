package com.foresee.echarts.dataview;

import com.alibaba.fastjson.JSONObject;
import com.foresee.echarts.option.Option;
import com.foresee.echarts.option.TextStyle;

public class AxisData extends Option{
	private String value="";

	private TextStyle textStyle;
	
	public AxisData() {
		
	}
	
	public AxisData(String value) {
		this(value, null);
	}
	
	public AxisData(String value,TextStyle textStyle){
		this.setValue(value);
		this.setTextStyle(textStyle);
	}
	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public TextStyle getTextStyle() {
		return textStyle;
	}
	public void setTextStyle(TextStyle textStyle) {
		this.textStyle = textStyle;
	}
	
	public boolean isOnlyValue() {
		if((textStyle != null && !textStyle.getElement().isEmpty()) )
			return false;
		else
			return true;
	}
	
	@Override
	public JSONObject getElement() {
		this.addAttribute("value", value);
		if(textStyle != null)
			this.addAttribute("textStyle", textStyle.getElement());
		return this.getAttributes();
	}
	
}
