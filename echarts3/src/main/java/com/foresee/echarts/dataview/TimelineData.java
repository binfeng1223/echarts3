package com.foresee.echarts.dataview;

import com.alibaba.fastjson.JSONObject;
import com.foresee.echarts.option.Option;

public class TimelineData extends Option {
	private String value;
	// 图形样式，默认为：emptyCircle可选'circle', 'rect', 'roundRect', 'triangle',
	// 'diamond', 'pin', 'arrow'或自定义'image://url','path://'
	private String symbol;
	// 图形大小的特别设置
	private String symbolSize;

	private String tooltip;
	
	public TimelineData(){
		
	}
	
	public TimelineData(String value){
		this(value,null,null,null);
	}
	
	public TimelineData(String value,String symbol,String symbolSize){
		this(value,symbol,symbolSize,null);
	}
	
	public TimelineData(String value,String symbol,String symbolSize,String tooltip){
		this.setValue(value);
		this.setSymbol(symbolSize);
		this.setSymbolSize(symbolSize);
		this.setTooltip(tooltip);
	}

	public String getTooltip() {
		return tooltip;
	}

	public void setTooltip(String tooltip) {
		this.tooltip = tooltip;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getSymbolSize() {
		return symbolSize;
	}

	public void setSymbolSize(String symbolSize) {
		this.symbolSize = symbolSize;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public boolean isOnlyValue() {
		if ((symbol != null && !"".equals(symbol.trim()))
				|| (symbolSize != null && !"".equals(symbolSize.trim()))
				|| (tooltip != null && !"".equals(tooltip.trim())))
			return false;
		else
			return true;
	}

	@Override
	public JSONObject getElement() {
		// TODO Auto-generated method stub
		this.addAttribute("value", value);
		if(symbol !=null && !"".equals(symbol))
			this.addAttribute("symbol", symbol);
		if(symbolSize !=null && !"".equals(symbolSize))
			this.addAttribute("symbolSize", symbolSize);
		if(tooltip !=null && !"".equals(tooltip)){
			JSONObject td=new JSONObject();
			td.put("formatter",tooltip);
			this.addAttribute("tooltip",td);
		}
			
		return this.getAttributes();
	}

}
