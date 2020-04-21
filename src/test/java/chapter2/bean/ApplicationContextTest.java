package chapter2.bean;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Arrays;

/**
 * @author xueleixi
 * @date 2020-04-21 06:36
 */
public class ApplicationContextTest
{
  @Test
  public void javaConfig()
  {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("chapter2.bean");
    Object carFactory = context.getBean("smallCarFactory");
    System.out.println(carFactory);
    System.out.println("-------");
    //
//    CarFactory car = context.getBean(CarFactory.class);
//    System.out.println(car);
    String[] names = context.getBeanDefinitionNames();

    System.out.println(Arrays.toString(names));
  }

  @Test
  public void xmlConfig()
  {
    GenericXmlApplicationContext context = new GenericXmlApplicationContext("classpath:beans.xml");
//    Object carFactory = context.getBean("smallCarFactory");
//    System.out.println(carFactory);
//    System.out.println("-------");
//    CarFactory car = context.getBean(CarFactory.class);
//    System.out.println(car);
    String[] names = context.getBeanDefinitionNames();
    System.out.println(Arrays.toString(names));

  }
}
