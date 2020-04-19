package chapter2.bean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

/**
 * @author xueleixi
 * @date 2020-04-19 22:14
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CarConfig.class)
public class AutoBeanTest
{
  Logger logger= LoggerFactory.getLogger(AutoBeanTest.class);

  private CarFactory iCarFactory;

  @Autowired
  public void setCarFactory(CarFactory carFactory)
  {
    logger.info("setting carFactory");
    this.iCarFactory = carFactory;
  }

  @Autowired
  CarFactory carFactory;



  @Test
  public void carFactoryShouldNotBeNull()
  {
    assertNotNull(carFactory);
    logger.info(carFactory.getClass().getName());
    assertSame(iCarFactory,carFactory);
  }
}