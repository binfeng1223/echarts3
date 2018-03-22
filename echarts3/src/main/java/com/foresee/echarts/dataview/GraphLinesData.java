package com.foresee.echarts.dataview;

import com.alibaba.fastjson.JSONObject;
import com.foresee.echarts.option.Option;

public class GraphLinesData extends Option{
	private String source;
	private String value;
//	private String target;
//	private Label label;
//	private ItemStyle itemStyle;
//	private String symbol;
//	private String symbolSize;
	
	public GraphLinesData(){
		
	}
	
	public GraphLinesData(String source,String value){
		this.setSource(source);
		this.setValue(value);
	}
	
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	@Override
	public JSONObject getElement() {
		// TODO Auto-generated method stub
		this.addAttribute("source", source);
		this.addAttribute("value", value);
		return this.getAttributes();
	}
	
}
