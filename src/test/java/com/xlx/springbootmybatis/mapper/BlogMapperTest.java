package com.xlx.springbootmybatis.mapper;

import com.xlx.springbootmybatis.model.Blog;
import com.xlx.springbootmybatis.model.BlogExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

/**
 * @author xueleixi
 * @date 2018/7/30 上午7:33
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BlogMapperTest {

    @Autowired
    BlogMapper blogMapper;

    Logger logger = LoggerFactory.getLogger("test");


    @Test
    public void countByExample() {
        BlogExample blogExample = new BlogExample();
        blogExample
                .or().andContentLike("%content%")
        ;
        long count1 = blogMapper.countByExample(blogExample);
        long count2 = blogMapper.countByExample(null);

        System.out.println("count1=" + count1 + ";count2:" + count2);
    }

    @Test
    public void deleteByExample() {
    }

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {
//        blogMapper.insert()
        Blog blog = new Blog();
        blog.setTitle("blog-2");
        blog.setContent("content-2");
        blogMapper.insert(blog);
        logger.info(blog.toString());
    }

    @Test
    public void insertSelective() {
        blogMapper.insertSelective(new Blog("blog-i", null));
    }

    @Test
    public void selectByExample() {
        BlogExample example = new BlogExample();
        example.or().andContentIn(Arrays.asList("1", "2", "3"))
                .andIdGreaterThanOrEqualTo(12)
                .andTitleIsNotNull()
        ;
        List<Blog> blogs = blogMapper.selectByExample(example);
        blogs.forEach(System.out::println);
    }

    @Test
    public void selectByPrimaryKey() {
    }

    @Test
    public void updateByExampleSelective() {
    }

    @Test
    public void updateByExample() {
    }

    @Test
    public void updateByPrimaryKeySelective() {
    }

    @Test
    public void updateByPrimaryKey() {
    }
}