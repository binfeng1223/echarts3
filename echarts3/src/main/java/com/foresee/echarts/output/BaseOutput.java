package com.foresee.echarts.output;

import org.apache.log4j.Logger;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.foresee.echarts.model.Model;
import com.foresee.echarts.option.Element;
import com.foresee.echarts.option.Tooltip;
import com.foresee.echarts.option.VisualMap;
import com.foresee.echarts.option.series.Series;
import com.foresee.echarts.util.Constants;

public abstract class BaseOutput implements Element, Output{
	protected static final Logger log = Logger.getLogger(BaseOutput.class);
	private Model model;
	
	@Override
	public void setModel(Model model) {
		this.model = model;
	}
	
	public Model getModel() {
		return model;
	}
	
	@Override
	public JSONObject getElement() {
		// TODO Auto-generated method stub
		JSONObject element = new JSONObject();
		if (this.model == null) {
		log.error("图形的数据模型不存在!");
	//		throw new ErrorMessage(EchartMessageCode.chart_model_not_exist);
		}
	
		if(model.getTitleText() != null )
			element.put(Constants.title, model.getTitle().getElement());
		
	
		if(model.getLegend() != null )
			element.put(Constants.legend, model.getLegend().getElement());
		
		if(model.getSeriesList() != null){
			JSONArray seriesList = new JSONArray();
			for (Series series : model.getSeriesList()){
				seriesList.add(series.getElement());
			}
			element.put(Constants.series, seriesList);
		}
		
		if(model.getVisualMapList().size()!=0){
			JSONArray visualMapList = new JSONArray();
			for (VisualMap visualMap : model.getVisualMapList()){
				visualMapList.add(visualMap.getElement());
			}
			element.put(Constants.visualMap, visualMapList);
		}
		
		if(model.getAttributes() != null)
			element.putAll(model.getAttributes());
		
		//TODO 默认加入tooltip，tooltip还没完善
		if(model.getTooltip() != null) {
			element.put(Constants.tooltip, model.getTooltip().getElement());
		}else
			element.put(Constants.tooltip, new JSONObject());
		
		return element;
	}
	
}
