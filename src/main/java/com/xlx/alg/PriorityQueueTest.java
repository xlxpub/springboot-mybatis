package com.xlx.alg;

import sun.jvm.hotspot.utilities.BitMap;

import java.util.PriorityQueue;

/**
 * @author xueleixi
 * @date 2019-09-19 14:28
 */
public class PriorityQueueTest
{
  public static void main(String[] args)
  {
    PriorityQueue<String> queue = new PriorityQueue<>();
    queue.add("a");
    queue.add("b");
    queue.add("c");
    while (true) {
      String top = queue.poll();
      System.out.println(top);
      if (null == top) {
        break;
      }
    }
  }
  public void x(){
    new BitMap(1000);
  }
}
