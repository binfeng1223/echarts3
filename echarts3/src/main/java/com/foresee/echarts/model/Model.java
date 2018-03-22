package com.foresee.echarts.model;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.alibaba.fastjson.JSONObject;
import com.foresee.echarts.dataview.LegendData;
import com.foresee.echarts.option.Legend;
import com.foresee.echarts.option.Option;
import com.foresee.echarts.option.Title;
import com.foresee.echarts.option.Tooltip;
import com.foresee.echarts.option.VisualMap;
import com.foresee.echarts.option.series.Series;
/**
 * echarts数据模型
 * 供外界继承或调用
 * @author ROLL
 *
 */
public class Model {
	protected static final Logger log = Logger.getLogger(Model.class);
	private Legend legend =new Legend();
	private List<Series> seriesList = new ArrayList<Series>();
	private JSONObject attributes = new JSONObject();//主节点添加
	private Title title=new Title();
	private Tooltip tooltip = new Tooltip();
	private List<VisualMap> visualMapList=new ArrayList<VisualMap>();

	public List<VisualMap> getVisualMapList() {
		return visualMapList;
	}

	public void setVisualMapList(List<VisualMap> visualMapList) {
		this.visualMapList = visualMapList;
	}
	
	public void addVisualMap(VisualMap v){
		visualMapList.add(v);
	}
	
	public void addVisualMap(String visualMapType){
		VisualMap v=null;
		if("".equals(visualMapType.trim()) || visualMapType==null){
			 v=new VisualMap();
		}else {
			 v=new VisualMap(visualMapType);
		}
		visualMapList.add(v);
	}

	public Title getTitle() {
		return title;
	}

	public void setTitle(Title title) {
		this.title = title;
	}
	
	public String getTitleText(){
		return title.getText();
	}
	
	public void setTitleText(String text){
		title.setText(text);
	}
	
	public Tooltip getTooltip() {
		return tooltip;
	}

	public void setTooltip(Tooltip tooltip) {
		this.tooltip = tooltip;
	}
	
	public void addTooltipAttribute(String key, Object value){
		this.tooltip.addAttribute(key, value);
	}

	public Legend getLegend() {
		return legend;
	}

	public void setLegend(Legend legend) {
		this.legend = legend;
	}

	public List<Series> getSeriesList() {
		return seriesList;
	}

	public void setSeriesList(List<Series> seriesList) {
		this.seriesList = seriesList;
	}

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
	public void setLegendData(List<LegendData> dataItems){
		legend.setData(dataItems);
	}
	
	public void addLegendData(LegendData legendData){
		legend.addLegendData(legendData);
	}
	
	public void addLegendData(String seriesName){
		legend.addLegendData(seriesName);
	}
	
	public void addSeries(Series series){
		seriesList.add(series);
	}
	
	public void addSeriesName(int index, String seriesName){
		this.getSeries(index).setName(seriesName);
	}
	
	public void addSeriesType(int index, String type){
		this.getSeries(index).setType(type);
	}
	
	public Series getSeries(int index){
		return seriesList.get(index);
	}
	
	public void addSeriesProperty(int index, String key, Object value){
		if(seriesList.size() > index){
			this.getSeries(index).addAttribute(key, value);
		}else
			log.warn("数据模型的系列指标越界, the index is out of range");
	}

	//接着使用类添加option属性
	public void addOptionPro(Option op){
		String name=op.getClass().getSimpleName();//由于类起名时都已option属性命名
		name = name.substring(0, 1).toLowerCase() + name.substring(1);
		this.attributes.put(name, op.getElement());
	}
}
