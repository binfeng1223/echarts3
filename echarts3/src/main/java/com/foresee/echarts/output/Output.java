package com.foresee.echarts.output;

import com.foresee.echarts.model.Model;

/**
 * echarts
 * @author ROLL
 */
public interface Output {
	
	public void setModel(Model model);

	public Model getModel();
	

	public String getJSON();
}
