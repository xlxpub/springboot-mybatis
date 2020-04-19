package chapter2.bean;

/**
 * @author xueleixi
 * @date 2020-04-19 22:12
 */
//@Component
public class MediumCarFactory implements CarFactory
{
  @Override
  public void produce()
  {
    System.out.println("中型汽车");
  }
}
