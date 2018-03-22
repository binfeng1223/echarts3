package com.foresee.echarts.option;

import com.alibaba.fastjson.JSONObject;
import com.foresee.echarts.util.Constants;
public class Title extends Option{
	
	public Title() {
		this.addAttribute("left", "center"); 
	}
	
	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public JSONObject getElement() {
		JSONObject json = new JSONObject();
		if(text != null && !"".equals(text.trim()))
			this.addAttribute(Constants.title_text, text);
		json.putAll(this.getAttributes());
		return json;
		
	}
	
}
