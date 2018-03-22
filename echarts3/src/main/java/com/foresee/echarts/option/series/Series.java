package com.foresee.echarts.option.series;

import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.foresee.echarts.option.Option;
import com.foresee.echarts.util.Constants;
import com.foresee.exception.message.EchartMessageCode;
/**
 * echarts配置项-系列
 * @author ROLL
 *
 */
public class Series extends Option {
	private String type;
	private String name;
	private List<Object> data;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setData(List<Object> data) {
		this.data = data;
	}
	public List<Object> getData() {
		return data;
	}
	
	@Override
	public JSONObject getElement() {
		JSONObject json = new JSONObject();
		// 转换属性key
//		if (data == null || data.size() == 0)
//			throw new ErrorMessage(EchartMessageCode.series_data_not_exist);
	
		json.put(Constants.option_data, data);
		json.put(Constants.series_type, type);
		if(name != null)
			json.put(Constants.series_name, name);
		//TODO 处理形如series.label.normal.show = false
		json.putAll(this.getAttributes());
		return json;
	}
}
