package chapter2.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author xueleixi
 * @date 2020-04-20 06:57
 */
public class SmallWheel implements Wheel
{
  Logger logger = LoggerFactory.getLogger(SmallWheel.class);

  private String name;
  private Integer count;

  public SmallWheel()
  {
    logger.info(this.getClass().getName() + " construct");
  }

  public Logger getLogger()
  {
    return logger;
  }

  public String getName()
  {
    return name;
  }

  public Integer getCount()
  {
    return count;
  }


  @Override
  public void run()
  {
    System.out.println(name + ":" + count);
    logger.info("small wheel runs");
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public void setCount(Integer count)
  {
    this.count = count;
  }
}
