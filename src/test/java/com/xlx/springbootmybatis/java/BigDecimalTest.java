package com.xlx.springbootmybatis.java;

import org.junit.Test;

import java.math.BigDecimal;

/**
 * @author xueleixi
 * @date 2018/7/31 上午11:00
 */
public class BigDecimalTest {

    @Test
    public void t1(){
        System.out.println(1.01+2.02);
        System.out.println(1.01+2.02);

    }

    @Test
    public void testBigDecimal(){
        double d1=1.511;
        System.out.println(new BigDecimal(d1));
        System.out.println(new BigDecimal(String.valueOf(d1)));
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(d1));
        BigDecimal add = bigDecimal.add(new BigDecimal("1.00009"));
        System.out.println(add.doubleValue());
        System.out.println(add.toString());
    }
}
