package mybatis;

import com.google.gson.Gson;
import com.xlx.db.BlogQuery;
import com.xlx.db.mapper.BlogMapper;
import com.xlx.db.model.Blog;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author xueleixi
 * @date 2019-08-21 09:54
 */
public class BasicTest
{
  SqlSession sqlSession;

  @Before
  public void init()
  {
    String resource = "com/mybatis.xml";
    InputStream inputStream = null;
    try {
      inputStream = Resources.getResourceAsStream(resource);
    }
    catch (IOException e) {
      e.printStackTrace();
    }
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    sqlSession = sqlSessionFactory.openSession();


  }

  @Test
  public void testMapper()
  {

    BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
    Blog blog = mapper.select(1);
    System.out.println(blog);
  }

  @Test
  public void testXml()
  {
    Object o = sqlSession.selectOne("com.xlx.db.mapper.BlogMapper.select", 1);
    System.out.println(o + "\n" + o.getClass().getName());
  }

  @Test
  public void testJson()
  {
    Object o = new Gson().fromJson("[1,2,3]", Object.class);
    System.out.println(o + "\n" + o.getClass().getName());
  }

  @Test
  public void testInsert()
  {
    Blog blog = new Blog("test-11", "test-11");
    BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
    int insert = mapper.insert(blog);
    System.out.println(insert);
    System.out.println(blog);
//    sqlSession.commit();
    blog = new Blog("test-12", "test-12");
    insert = mapper.insert(blog);
    System.out.println(insert);
    System.out.println(blog);

  }

  @Test
  public void testBatchInsert()
  {
    ArrayList<Blog> blogs = new ArrayList<>();
    for (int i = 1; i < 3; i++) {
      blogs.add(new Blog("tes-batch-" + i, "test-batch-" + i));
    }

    BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

    int affected = mapper.batchInsert(blogs);
    System.out.println("affected:" + affected + "\t" + blogs);
    for (Blog blog : blogs) {
      System.out.println(blog);
    }
  }

  @Test

  public void testUpdate()
  {
    BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
    Blog blog = mapper.select(1);
    if (blog != null) {
      blog.setContent("bbb");
      int update = mapper.update(blog);
      System.out.println("affected:" + update);
      sqlSession.commit();

    } else {
      System.out.println("blog not found");
    }

  }

  @Test
  public void testDelete()
  {
//    BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
//    int delete = mapper.delete(mapper.select(1));
//    System.out.println("affected:"+delete);

    int affected = sqlSession.delete("com.xlx.db.mapper.BlogMapper.delete", 1);
    System.out.println("affected:" + affected);
  }

  @Test
  public void findById()
  {
    BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);
    Blog blog = blogMapper.findById(1);
    System.out.println(blog);
  }

  @Test
  public void findTitleLike()
  {
    BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
    BlogQuery query = new BlogQuery();
    query.setTitle("%blog");
    List<Blog> blogs = mapper.findTitleLike(query);
    System.out.println(blogs);
  }



  protected void print(String... args)
  {
    String[] strings = new String[100];
    if (args.getClass().isArray()) {
      System.out.println("is array");
    } else {
      System.out.println("not array");
    }
    System.out.println(args.getClass().getName() + "\n" + strings.getClass().getName());
  }

}
