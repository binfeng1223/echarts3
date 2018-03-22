package com.foresee.echarts.option;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class BeanToJson {
	public static <T> JSONObject getOutputFormBean(T o) throws JsonGenerationException, JsonMappingException, IOException {
		ObjectMapper om = new ObjectMapper();
		String jsonStr = om.writeValueAsString(o);
		return JSON.parseObject(jsonStr);
	}
}
