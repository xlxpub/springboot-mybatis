package com.xlx.springbootmybatis.java.model;

import java.io.Serializable;

/**
 * @author xueleixi
 * @date 2018/8/2 下午3:00
 */
public class Person implements Serializable {
//    private static final long serialVersionUID=12L;
    private static final long serialVersionUID=13L;

    public String name;
    public Integer id;

    public Person() {
    }

    public Person(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
