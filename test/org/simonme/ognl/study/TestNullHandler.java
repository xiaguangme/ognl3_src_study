/*
 * 文 件 名:  TestNullHandler.java
 * 版    权:   . Copyright 2014-2015,  All rights reserved simonme
 * 描    述:  <描述>
 * 修 改 人:  Chenxiaguang
 * 修改时间:  2015-4-19
 */
package org.simonme.ognl.study;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import ognl.NullHandler;
import ognl.Ognl;
import ognl.OgnlException;
import ognl.OgnlRuntime;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  chenxiaguang@gmail.com
 * @version  [版本号, 2015-4-19]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class TestNullHandler implements NullHandler
{

    /**
     * 重载方法
     * 
     * @param arg0
     * @param arg1
     * @param arg2
     * @param arg3
     * @return
     */
    @Override
    public Object nullMethodResult(Map arg0, Object arg1, String arg2, Object[] arg3)
    {
        return null;
    }

    /**
     * 重载方法
     * 
     * @param arg0
     * @param arg1
     * @param arg2
     * @return
     */
    @Override
    public Object nullPropertyValue(Map arg0, Object arg1, Object arg2)
    {
        try
        {
            PropertyDescriptor pd = OgnlRuntime.getPropertyDescriptor(arg1.getClass(), (String) arg2);
            Class<?> clazz = pd.getPropertyType();
            Object newIns = buildIns(clazz);
            Ognl.setValue((String) arg2, arg1, newIns);
            return newIns;
        }
        catch (IntrospectionException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (OgnlException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (InstantiationException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (IllegalAccessException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    /**
     * <一句话功能简述> <功能详细描述>
     * 
     * @param clazz
     * @return
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @see [类、类#方法、类#成员]
     */
    private Object buildIns(Class<?> clazz) throws InstantiationException, IllegalAccessException
    {
        if (Collection.class.isAssignableFrom(clazz))
        {
            return new ArrayList();
        }
        else if (clazz == Map.class)
        {
            return new HashMap();
        }
        else
        {
            return clazz.newInstance();
        }
    }

}
