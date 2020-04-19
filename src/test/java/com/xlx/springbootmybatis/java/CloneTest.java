package com.xlx.springbootmybatis.java;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author xueleixi
 * @date 2018/8/2 下午5:47
 */
public class CloneTest  {
     static class Student implements Cloneable{
        private String name;
        private int age;
        private List<String> hobbies;

        public Student() {
        }

         public List getHobbies() {
             return hobbies;
         }

         public void setHobbies(List<String > hobbies) {
             this.hobbies = hobbies;
         }


         public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

         @Override
         public String toString() {
             return "Student{" +
                     "name='" + name + '\'' +
                     ", age=" + age +
                     ", hobbies=" + hobbies +
                     '}';
         }

         @Override
         public Object clone() throws CloneNotSupportedException {
             return super.clone();
         }
     }

    @Test
    public void test1() throws CloneNotSupportedException {
        Student student = new Student("name", 12);
        student.setHobbies(Arrays.asList("h1","h2","h3"));
        Student cloned = (Student) student.clone();
        System.out.println(student);
        System.out.println(cloned);
        cloned.name = "-";
        cloned.age = 1;
        List<String> hobbies = cloned.getHobbies();
        hobbies.set(0,"xx0");
//        cloned.setHobbies(Arrays.asList("hhhhh"));
        System.out.println(student);
        System.out.println(cloned);
    }


}
