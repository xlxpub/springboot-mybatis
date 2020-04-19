package chapter2.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author xueleixi
 * @date 2020-04-20 06:57
 */
public class SmallWheel implements Wheel
{
  Logger logger =LoggerFactory.getLogger(SmallWheel.class);
  @Override
  public void run()
  {
    logger.info("small wheel runs");
  }
}
