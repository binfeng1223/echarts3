package com.foresee.echarts.option;

import com.alibaba.fastjson.JSONObject;



public class Tooltip extends Option {
	// 把boolean改变成Object，在初始化是object是null，过滤方便。
	private Object show;
	private Object showContent;
	private String trigger;
	private String triggerOn;
	private Object alwaysShowContent;
	private String showDelay;
	private String hideDelay;
	private Object enterable;
	private String position;
	private String transitionDuration;
	private String formatter;
	private String backgroundColor;
	private String borderColor;
	private String borderWidth;
	private String padding;
	private TextStyle textStyle;
	// extraCssText: ...,
	// axisPointer: {...},
	
	// getter and setter
	public Object getShow() {
		return show;
	}

	public void setShow(Object show) {
		this.show = show;
	}

	public Object getShowContent() {
		return showContent;
	}

	public void setShowContent(Object showContent) {
		this.showContent = showContent;
	}

	public String getTrigger() {
		return trigger;
	}

	public void setTrigger(String trigger) {
		this.trigger = trigger;
	}

	public String getTriggerOn() {
		return triggerOn;
	}

	public void setTriggerOn(String triggerOn) {
		this.triggerOn = triggerOn;
	}

	public Object getAlwaysShowContent() {
		return alwaysShowContent;
	}

	public void setAlwaysShowContent(Object alwaysShowContent) {
		this.alwaysShowContent = alwaysShowContent;
	}

	public String getShowDelay() {
		return showDelay;
	}

	public void setShowDelay(String showDelay) {
		this.showDelay = showDelay;
	}

	public String getHideDelay() {
		return hideDelay;
	}

	public void setHideDelay(String hideDelay) {
		this.hideDelay = hideDelay;
	}

	public Object getEnterable() {
		return enterable;
	}

	public void setEnterable(Object enterable) {
		this.enterable = enterable;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getTransitionDuration() {
		return transitionDuration;
	}

	public void setTransitionDuration(String transitionDuration) {
		this.transitionDuration = transitionDuration;
	}

	public String getFormatter() {
		return formatter;
	}

	public void setFormatter(String formatter) {
		this.formatter = formatter;
	}

	public String getBackgroundColor() {
		return backgroundColor;
	}

	public void setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
	}

	public String getBorderColor() {
		return borderColor;
	}

	public void setBorderColor(String borderColor) {
		this.borderColor = borderColor;
	}

	public String getBorderWidth() {
		return borderWidth;
	}

	public void setBorderWidth(String borderWidth) {
		this.borderWidth = borderWidth;
	}

	public String getPadding() {
		return padding;
	}

	public void setPadding(String padding) {
		this.padding = padding;
	}

	public TextStyle getTextStyle() {
		return textStyle;
	}

	public void setTextStyle(TextStyle textStyle) {
		this.textStyle = textStyle;
	}

	// 方便使用的属性添加方法
	public Tooltip show(boolean show) {
		this.show = show;
		return this;
	}

	public Tooltip showContent(boolean showContent) {
		this.showContent = showContent;
		return this;
	}

	public Tooltip trigger(String trigger) {
		this.trigger = trigger;
		return this;
	}

	public Tooltip triggerOn(String triggerOn) {
		this.triggerOn = triggerOn;
		return this;
	}

	public Tooltip alwaysShowContent(boolean alwaysShowContent) {
		this.alwaysShowContent = alwaysShowContent;
		return this;
	}

	public Tooltip showDelay(String showDelay) {
		this.showDelay = showDelay;
		return this;
	}

	public Tooltip hideDelay(String hideDelay) {
		this.hideDelay = hideDelay;
		return this;
	}

	public Tooltip enterable(boolean enterable) {
		this.enterable = enterable;
		return this;
	}

	public Tooltip position(String position) {
		this.position = position;
		return this;
	}

	public Tooltip transitionDuration(String transitionDuration) {
		this.transitionDuration = transitionDuration;
		return this;
	}

	public Tooltip formatter(String formatter) {
		this.formatter = formatter;
		return this;
	}

	public Tooltip backgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
		return this;
	}

	public Tooltip borderColor(String borderColor) {
		this.borderColor = borderColor;
		return this;
	}

	public Tooltip borderWidth(String borderWidth) {
		this.borderWidth = borderWidth;
		return this;
	}

	public Tooltip padding(String padding) {
		this.padding = padding;
		return this;
	}

	public Tooltip textStyle(TextStyle textStyle) {
		this.textStyle = textStyle;
		return this;
	}

	@Override
	public JSONObject getElement() {
		//TODO tooltip还没有完善设计，需要重构一次
		return new JSONObject();
	}
}
