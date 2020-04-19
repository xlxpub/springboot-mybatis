package com.xlx.db.mapper;

import com.xlx.db.BlogQuery;
import com.xlx.db.model.Blog;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author xueleixi
 * @date 2019-08-21 10:05
 */
public interface BlogMapper
{
  Blog select(int id);

  int insert(Blog blog);

  int batchInsert(List<Blog> blogList);

  int update(Blog blog);

  int delete(Blog blog);

  @Select("select * from blog where id = #{id}")
  Blog findById(long id);

  @Select("select * from blog where name = #{name}")
  Blog findByName(@Param("name") String name);

  @Select("select * from blog where email = #{email}")
  Blog findByEmail(@Param("email") String email);

  List<Blog> findTitleLike(BlogQuery query);
}
