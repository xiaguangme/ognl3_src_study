/*
 * 文 件 名:  OptionalCOnfiguration.java
 * 版    权:   . Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  mac
 * 修改时间:  2014-12-26
 */
package org.simonme.ognl.study.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  chenxiaguang@gmail.com
 * @version  [版本号, 2014-12-26]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class OptionalConfiguration
{

    private List<Param> params = new ArrayList<Param>();

    public List<Param> getParams()
    {
        return params;
    }

    public void setParams(List<Param> params)
    {
        this.params = params;
    }

}
