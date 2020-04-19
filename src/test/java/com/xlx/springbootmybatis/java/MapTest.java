package com.xlx.springbootmybatis.java;

import org.junit.Test;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author xueleixi
 * @date 2018/8/2 上午11:52
 */
public class MapTest {

    @Test
    public void test1(){
        HashMap<String, String> map = new HashMap<>();
        String oldValue = map.put("key1", "value1");
        String  value= map.get("key1");
        //iterate
        //thread unsafe
        Map<String, String> synchronizedMap = Collections.synchronizedMap(map);
        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("1","1");

    }

    @Test
    //LinkedHashMap 按照插入顺序存储
    //TreeMap 按照key进行排序
    public void testMapOrder(){
//        new String[][] {{}}
//        String[] names={""};
        String[][] arr={
                {"C","c"},
                {"B","b"},
                {"A","a"},
                {"12","12"},
        };
        HashMap<String, String> hashMap = new HashMap<>();
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        TreeMap<String, String> treeMap = new TreeMap<>();
        for (String[] strings : arr) {
            hashMap.put(strings[0],strings[1]);
            linkedHashMap.put(strings[0],strings[1]);
            treeMap.put(strings[0],strings[1]);
        }
        System.out.println("hash map");
        for (String key : hashMap.keySet()) {
            System.out.println(key);
        }
        System.out.println("-- linked hash map ---");

        for (String key : linkedHashMap.keySet()) {
            System.out.println(key);
        }

        System.out.println("-- treeMap --");
        for (String key : treeMap.keySet()) {
            System.out.println(key);
        }


    }

    @Test
    public void testNullKey(){
        HashMap<String, String> hashMap = new HashMap<>();
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        TreeMap<String, String> treeMap = new TreeMap<>();
        hashMap.put(null,null);
        hashMap.put(null,null);
        linkedHashMap.put(null,null);
        linkedHashMap.put(null,null);
        treeMap.put(null,null);//treeMap 不支持null key,且必须实现Comparator
//        treeMap.put(null,null);

        System.out.println("hash map");
        for (String key : hashMap.keySet()) {
            System.out.println(key);
        }
        System.out.println("-- linked hash map ---");

        for (String key : linkedHashMap.keySet()) {
            System.out.println(key);
        }

        System.out.println("-- treeMap --");
        for (String key : treeMap.keySet()) {
            System.out.println(key);
        }
    }

}
