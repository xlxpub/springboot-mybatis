package com.xlx.springbootmybatis.service;

import com.xlx.springbootmybatis.exception.InvalidArgumentException;
import com.xlx.springbootmybatis.mapper.BlogMapper;
import com.xlx.springbootmybatis.mapper.LogMapper;
import com.xlx.springbootmybatis.model.Blog;
import com.xlx.springbootmybatis.model.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author xueleixi
 * @date 2018/7/31 上午8:43
 */
@Service
public class BlogService {
    @Autowired
    BlogMapper blogMapper;

    @Autowired
    LogMapper logMapper;

    @Transactional(rollbackFor =Exception.class )
    public Integer saveOneBlog(Blog blog) throws InvalidArgumentException {
        logMapper.insertSelective(new Log("saveOneBlog"));

//        String title = blog.getTitle().trim();
//        if (null==blog.getTitle() || title.length()>=32 || title.length()<=6){
//            throw new InvalidArgumentException("title重复");
//
//        }
        //todo 增加唯一键，让sql报错
        return blogMapper.insertSelective(blog);
    }

}
