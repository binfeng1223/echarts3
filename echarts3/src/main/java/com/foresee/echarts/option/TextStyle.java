package com.foresee.echarts.option;

import com.alibaba.fastjson.JSONObject;

public class TextStyle extends Option{
	private String color; 
	private String fontStyle; 
	private String fontWeight; 
	private String fontFamily; 
	private String fontSize; 
	
	//������Է����ļ��д�������Է�����д��ʽ��x.y.z
	public TextStyle color(String color){
		this.color=color;
		return this;
	}
	public TextStyle fontStyle(String fontStyle){
		this.fontStyle=fontStyle;
		return this;
	}
	public TextStyle fontWeight(String fontWeight){
		this.fontWeight=fontWeight;
		return this;
	}public TextStyle fontFamily(String fontFamily){
		this.fontFamily=fontFamily;
		return this;
	}public TextStyle fontSize(String fontSize){
		this.fontSize=fontSize;
		return this;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFontStyle() {
		return fontStyle;
	}

	public void setFontStyle(String fontStyle) {
		this.fontStyle = fontStyle;
	}

	public String getFontWeight() {
		return fontWeight;
	}

	public void setFontWeight(String fontWeight) {
		this.fontWeight = fontWeight;
	}

	public String getFontFamily() {
		return fontFamily;
	}

	public void setFontFamily(String fontFamily) {
		this.fontFamily = fontFamily;
	}

	public String getFontSize() {
		return fontSize;
	}

	public void setFontSize(String fontSize) {
		this.fontSize = fontSize;
	}
	
	@Override
	public JSONObject getElement() {
		if(color != null && !"".equals(color.trim()))
			this.addAttribute("color", color);
		if(fontStyle != null && !"".equals(fontStyle.trim()))
			this.addAttribute("fontStyle", fontStyle);
		if(fontWeight != null && !"".equals(fontWeight.trim()))
			this.addAttribute("fontWeight", fontWeight);
		if(fontFamily != null && !"".equals(fontFamily.trim()))
			this.addAttribute("fontFamily", fontFamily);
		if(fontSize != null && !"".equals(fontSize.trim()))
			this.addAttribute("fontSize", fontSize);
		return this.getAttributes();
	}
}
