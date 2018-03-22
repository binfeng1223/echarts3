package com.foresee.echarts.output;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.foresee.echarts.model.AxisModel;
import com.foresee.echarts.option.DataZoom;
import com.foresee.echarts.option.Grid;
import com.foresee.echarts.option.axis.Axis;
import com.foresee.echarts.util.Constants;

public abstract class AxisOutput extends BaseOutput {
	protected String xAxis = Constants.axis_x;
	protected String yAxis = Constants.axis_y;

	@Override
	public JSONObject getElement() {
		JSONObject element = super.getElement();
		AxisModel model = (AxisModel) this.getModel();
		
		//输出对象加入X轴
		if (model.getXAxisList() != null && model.getXAxisList().size() != 0) {
			JSONArray xs = new JSONArray();
			for (Axis xa : model.getXAxisList()) {
				xs.add(xa.getElement());
			}
			element.put(xAxis, xs);
		}
		
		//输出对象加入Y轴
		if (model.getYAxisList() != null && model.getYAxisList().size() > 0) {
			JSONArray ys = new JSONArray();
			for (Axis ya : model.getYAxisList()) {
				ys.add(ya.getElement());
			}
			element.put(yAxis, ys);
		}

		//输出对象加入datazoom
		if (model.getDataZoomList().size() != 0) {
			JSONArray DataZoomList = new JSONArray();
			for (DataZoom dataZoom : model.getDataZoomList()) {
				DataZoomList.add(dataZoom.getElement());
			}
			element.put(Constants.dataZoom, DataZoomList);
		}
		
		//输出对象加入Grid
		if (model.getGirdList().size() != 0) {
			JSONArray GirdList = new JSONArray();
			for (Grid girdList : model.getGirdList()) {
				GirdList.add(girdList.getElement());
			}
			element.put(Constants.gird, GirdList);
		}
		
		return element;
	}
	
	@Override
	public String getJSON() {
		return this.getElement().toString();
	}

	public void changXY() {
		xAxis = Constants.axis_y;
		yAxis = Constants.axis_x;
	}
}
