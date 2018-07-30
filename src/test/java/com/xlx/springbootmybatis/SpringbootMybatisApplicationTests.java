package com.xlx.springbootmybatis;

import com.xlx.springbootmybatis.mapper.BlogMapper;
import com.xlx.springbootmybatis.model.Blog;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisApplicationTests {

	@Autowired
	BlogMapper blogMapper;

	@Test
	public void contextLoads() {
		Assert.assertNotNull(blogMapper);
		Blog blog = blogMapper.selectByPrimaryKey(1);
		System.out.println(blog);
	}



}
