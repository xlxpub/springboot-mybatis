import org.junit.Test;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author xueleixi
 * @date 2019-08-26 11:50
 */
public class ATest
{
  @Test
  public void t()
  {
//    Matcher matcher = Pattern.compile("\\d").matcher("hello 1bc");
//    String ret = matcher.replaceAll("a");
//    System.out.println(ret);

    Pattern p = Pattern.compile("username=(\\w+?)&password=(\\w+)");

    Matcher m = p.matcher("username=lisi&password=wangwu");


    StringBuffer sb = new StringBuffer();
    ArrayList<String> strings = new ArrayList<>();
    strings.add("username1");
    strings.add("password2");
//    System.out.println(m.matches());
    for (int i = 0; i < strings.size() && m.find(); i++) {
      System.out.println("-----"+i+","+m.groupCount()+";"+m.group(i)+";g0="+m.group(0)+";g1="+m.group(1)+";g2="+m.group(2));

      m.appendReplacement(sb, strings.get(i));
      System.out.println(m.group());
      System.out.println(m.start());
    }
//    todo
//    if (m.find()) {
//      System.out.println("group count:"+m.groupCount());
//      for (int j = 1; j <= m.groupCount(); j++) {
//        System.out.println("j-1="+(j-1));
//        m.appendReplacement(sb, strings.get(j - 1));
//      }
//    }
    m.appendTail(sb);
    System.out.println(sb.toString());


  }

  @Test
  public void pattern(){
    Pattern p = Pattern.compile("apple");
    Matcher m = p.matcher("apple 123");
    System.out.println(m.matches());
    System.out.println(p.matcher("apple").matches());
    System.out.println(p.matcher("apple1").matches());

    System.out.println(Pattern.matches(".*apple.*","i have an apple"));
    System.out.println(Pattern.matches(".*apple.*","apple"));

  }
}
