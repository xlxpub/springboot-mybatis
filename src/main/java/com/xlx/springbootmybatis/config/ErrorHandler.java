package com.xlx.springbootmybatis.config;

import com.xlx.springbootmybatis.exception.BusinessException;
import com.xlx.springbootmybatis.response.JsonResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author xueleixi
 * @date 2018/7/31 上午11:32
 */
@ControllerAdvice
public class ErrorHandler {

    @ExceptionHandler(value = BusinessException.class)
    @ResponseBody
    public Object handleError(BusinessException e) {
        return JsonResponse.error(null,e.getMessage());
    }

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    //非业务类型的错误，一般是服务器内部错误。比如数据库断开连接...
    public Object handleServerError(Exception e) {
        return JsonResponse.error(500,e.getMessage());
    }
}
