package com.foresee.echarts.option;

import com.alibaba.fastjson.JSONObject;

public class Attributes extends BeanToJson{
	private JSONObject attributes = new JSONObject();

	public JSONObject getAttributes() {
		return attributes;
	}

	public void setAttributes(JSONObject attributes) {
		this.attributes = attributes;
	}

	public void addAttribute(String key, Object value) {
		if (attributes == null)
			attributes = new JSONObject();
		attributes.put(key, value);
	}

	public void removeAttribute(String key) {
		if (attributes == null)
			return;
		attributes.remove(key);
	}

	public Object getAttribute(String key) {
		if (attributes == null)
			attributes = new JSONObject();
		if (key == null)
			return null;
		return attributes.get(key);
	}
	
}
