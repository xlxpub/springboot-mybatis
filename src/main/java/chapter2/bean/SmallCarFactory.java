package chapter2.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author xueleixi
 * @date 2020-04-19 22:12
 */

@Component
public class SmallCarFactory implements CarFactory
{
  Logger logger= LoggerFactory.getLogger(SmallCarFactory.class);

  public SmallCarFactory()
  {

    logger.info("SmallCarFactory construct");
  }

  @Override
  public void produce()
  {
    System.out.println("小汽车");
  }
}
