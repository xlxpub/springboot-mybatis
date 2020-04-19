package com.xlx.springbootmybatis.java;

import com.google.gson.Gson;
import com.xlx.springbootmybatis.java.model.Person;
import org.junit.Test;

import java.io.*;

/**
 * @author xueleixi
 * @date 2018/8/2 下午2:54
 */

public class SerialVersionUIDTEST {
    String outputFile = "/tmp/1";

    @Test
    public void t1() throws IOException {
        Gson gson = new Gson();
        Person person = new Person("user-1",1);
        String s = gson.toJson(person);
        System.out.println(s);
        Person person1 = gson.fromJson(s, Person.class);
        System.out.println(person1);
        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(outputFile))) {
            outputStream.writeObject(person1);
        }

    }

    @Test
    public void t2() throws IOException, ClassNotFoundException {
        Gson gson = new Gson();
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(outputFile));
        Object o = inputStream.readObject();
        System.out.println(o);
    }

}
