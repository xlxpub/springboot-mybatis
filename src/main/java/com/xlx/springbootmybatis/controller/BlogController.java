package com.xlx.springbootmybatis.controller;

import com.xlx.springbootmybatis.exception.BusinessException;
import com.xlx.springbootmybatis.exception.InvalidArgumentException;
import com.xlx.springbootmybatis.mapper.BlogMapper;
import com.xlx.springbootmybatis.model.Blog;
import com.xlx.springbootmybatis.response.JsonResponse;
import com.xlx.springbootmybatis.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author xueleixi
 * @date 2018/7/31 上午8:17
 */
@RestController
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    BlogService blogService;

    @Autowired
    BlogMapper blogMapper;

    @RequestMapping("/{id}")
    public Object get(@PathVariable Integer id) {
        return JsonResponse.ok(blogMapper.selectByPrimaryKey(id));
    }

    @RequestMapping("/put")
    public Object put(@Valid Blog blog, Errors errors) throws BusinessException {
        System.out.println(blog);
        if (errors.hasErrors()) {
            FieldError fieldError = errors.getFieldError();
            throw new InvalidArgumentException(fieldError.getDefaultMessage());
        }

        return JsonResponse.ok(blogService.saveOneBlog(blog));
    }
}
