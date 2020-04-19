package com.xlx.springbootmybatis.java;

import org.junit.Test;

/**
 * @author xueleixi
 * @date 2018/8/2 下午5:30
 */
public class EqualsTest {

    @Test
    public void test(){
        String s1="12";//String.valueOf
        String s12="12";
        String s2=new String("12");
        String s3=String.valueOf("12");
        System.out.println("12"=="12");
        System.out.println(s1==s12);
        System.out.println(s1==s2);
        System.out.println(s1==s3);
    }


}
