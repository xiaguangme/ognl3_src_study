/*
 * 文 件 名:  SetValueTest.java
 * 版    权:   . Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  mac
 * 修改时间:  2014-12-26
 */
package org.simonme.ognl.study;

import java.util.ArrayList;

import ognl.Ognl;
import ognl.OgnlException;
import ognl.OgnlRuntime;

import org.junit.BeforeClass;
import org.junit.Test;
import org.simonme.ognl.study.bean.BasicAttribute;
import org.simonme.ognl.study.bean.Param;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  chenxiaguang@gmail.com
 * @version  [版本号, 2014-12-26]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class SetValueTest
{

    @BeforeClass
    public static void setup()
    {
        OgnlRuntime.setNullHandler(Object.class, new TestNullHandler());
    }

    @Test
    public void testPrint()
    {
        System.out.println("hello");
    }

    @Test
    public void testGetValue4Attr()
    {
        BasicAttribute b = new BasicAttribute();
        try
        {
            Object o = Ognl.getValue("optionalConfig.params", b);
            System.out.println(o);
        }
        catch (OgnlException e)
        {
            e.printStackTrace();
        }
    }

    @Test
    public void testSetValue4List()
    {
        BasicAttribute b = new BasicAttribute();
        try
        {
            Param p1 = new Param();
            p1.setName("test");
            p1.setValue("testValue");
            Ognl.setValue(Ognl.parseExpression("optionalConfig.params"), b, new ArrayList<Param>());
        }
        catch (OgnlException e)
        {
            e.printStackTrace();
        }
    }
}
