package chapter2.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author xueleixi
 * @date 2020-04-19 22:12
 */
//@Component
public class MediumCarFactory implements CarFactory
{
  Logger logger = LoggerFactory.getLogger(MediumCarFactory.class);

  public MediumCarFactory()
  {
    logger.info(this.getClass().getName() + " construct");
  }

  @Override
  public void produce()
  {
    System.out.println("中型汽车");
  }
}
