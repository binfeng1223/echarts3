package com.foresee.echarts.option;

import org.apache.log4j.Logger;

import com.alibaba.fastjson.JSONObject;

/**
 *  是视觉映射组件，用于进行『视觉编码』
 *
 */

public class VisualMap  extends Option {
	private static final Logger log = Logger.getLogger(VisualMap.class);
	//continuous:内置 显示或隐藏手柄（手柄能拖拽改变值域）,piecewise :分段型视觉映射组件，有两种模式
	private String type = "continuous"; 
	
	public VisualMap(){
		
	}
	public VisualMap(String type){
		if("continuous".equals(type.trim())||"piecewise".equals(type.trim()))
			this.setType(type);
		else 
			log.error("VisualMap 的type设置出错!");
	}
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public JSONObject getElement() {
		this.addAttribute("type", type);
		return this.getAttributes();
	}

}