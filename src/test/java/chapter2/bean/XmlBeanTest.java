package chapter2.bean;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author xueleixi
 * @date 2020-04-19 22:14
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:beans.xml"})
public class XmlBeanTest
{
  Logger logger= LoggerFactory.getLogger(XmlBeanTest.class);

  private CarFactory iCarFactory;

//  @Autowired
  public void setCarFactory(CarFactory carFactory)
  {
    logger.info("setting carFactory");
    this.iCarFactory = carFactory;
  }

//  @Autowired
//  CarFactory carFactory;

  @Autowired
  Wheel wheel;

  @Test
  public void carFactoryShouldNotBeNull()
  {
//    assertNotNull(carFactory);
//    logger.info(carFactory.getClass().getName());
//    assertSame(iCarFactory,carFactory);
    Assert.assertNotNull(wheel);
  }
}