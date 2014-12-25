/*
 * 文 件 名:  BasicAttribute.java
 * 版    权:   . Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  mac
 * 修改时间:  2014-12-26
 */
package org.simonme.ognl.study.bean;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  chenxiaguang@gmail.com
 * @version  [版本号, 2014-12-26]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class BasicAttribute
{
    private String flowInstanceCode;

    private OptionalConfiguration optionalConfig;

    public String getFlowInstanceCode()
    {
        return flowInstanceCode;
    }

    public void setFlowInstanceCode(String flowInstanceCode)
    {
        this.flowInstanceCode = flowInstanceCode;
    }

    public OptionalConfiguration getOptionalConfig()
    {
        return optionalConfig;
    }

    public void setOptionalConfig(OptionalConfiguration optionalConfig)
    {
        this.optionalConfig = optionalConfig;
    }
}
