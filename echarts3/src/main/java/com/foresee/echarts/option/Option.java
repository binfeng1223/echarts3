package com.foresee.echarts.option;

/**
 * echarts配置项抽象接口
 * 主要面对内部对象构建
 * @author ROLL
 */
/*
 * 把Option分为Attributes属性和输出Element元素
 * Attributes 继承BeanToJson 使用getOutputFormBean可以使bean to json
 * Element接口中 getElement() 实现此方法对象转为Echarts的JSON对象元素
 */
public abstract class Option extends Attributes implements Element{

}
