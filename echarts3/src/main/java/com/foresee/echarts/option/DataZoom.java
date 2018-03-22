package com.foresee.echarts.option;

import org.apache.log4j.Logger;

import com.alibaba.fastjson.JSONObject;

/**
 * echarts数据区域缩放组件
 * @author ROLL
 *
 */
public class DataZoom extends Option {
	private static final Logger log = Logger.getLogger(DataZoom.class);
	//inside:内置 ;slider:滑动条型组件
	private String type = "inside"; 
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public DataZoom(){
		
	}
	public DataZoom(String type)
	{
		if("inside".equals(type.trim())||"slider".equals(type.trim()))
			this.setType(type);
		else 
			log.error("DataZoom 的 type设置出错!");
	}
	@Override
	public JSONObject getElement() {
		this.addAttribute("type", type);
		return this.getAttributes();
	}

}
