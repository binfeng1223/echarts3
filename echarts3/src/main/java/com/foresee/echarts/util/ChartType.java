package com.foresee.echarts.util;

/***
 * 图形类型
 * 基于echarts3
 * @author ROLL
 */
public enum ChartType {
	line, // 折线(面积)图
	bar,  // 柱状(条形)图
	pie, //饼(圆环)图
	scatter, //散点(气泡)图
	effectScatter, //动画效果的散点(气泡)图
	radar,//雷达(面积)图
	treemap,//矩形树图
	boxplot, //盒式图
	candlestick, //k线图  与'k'相同
	k,//k线图 与'candlestick'等同
	heatmap,//热力图
	map,//地图
	parallel, //平行坐标图
	lines, //线图(2个点的流向，有开始和结束)
	graph, //关系图
	sankey, //桑基图
	funnel,//漏斗图
	gauge,//仪表盘
	
	/*下面图形类型定义非ECharts所申明*/
	combine,//混搭 (不同图形的混搭，如冒泡与地图、线图与地图等)
	dualycombine;//双Y轴混搭(直角坐标系专用)
	
}
