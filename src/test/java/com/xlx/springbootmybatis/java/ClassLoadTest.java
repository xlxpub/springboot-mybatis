package com.xlx.springbootmybatis.java;

import org.junit.Test;
import sun.misc.Launcher;

import java.net.URL;

/**
 * @author xueleixi
 * @date 2018/8/2 下午3:53
 *
加载器层次结构：
JVM启动时，姓曾的三个类加载器组成的机构
1.Bootstrap ClassLoader 根类 ------引导类加载器，加载java核心类。非java.lang.ClassLoader子类，而是JVM自身实现
2.Extension ClassLoader 扩展类-----加载JRE的扩展目录中的JAR包的类（%JAVA_HOME%/jre/lib/ext或java.ext.dirs系统属性指定的目录）
3.System ClassLoader 系统类-----加载cmd java -cp **,环境变量指定的jar包和类路径。ClassLoader.getSystemClassLoader获得 系统类加载器。
4.用户类加载器。。。
 */
public class ClassLoadTest {

    @Test
    public void test1() throws ClassNotFoundException {
        Class<?> abc = Class.forName("java.lang.String");
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        ClassLoader parent = classLoader.getParent();
    }

    @Test
    //获取启动加载器加载的文件
    public void test2(){
        URL[] urLs = Launcher.getBootstrapClassPath().getURLs();
        for (URL urL : urLs) {
            System.out.println(urL);
        }
    }
}

class A extends ClassLoader{

}