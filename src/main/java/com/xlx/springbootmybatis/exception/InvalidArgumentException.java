package com.xlx.springbootmybatis.exception;

/**
 * @author xueleixi
 * @date 2018/7/31 上午11:33
 */
public class InvalidArgumentException extends BusinessException {
    public InvalidArgumentException() {
    }

    public InvalidArgumentException(String message) {
        super(message);
    }

    public InvalidArgumentException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidArgumentException(Throwable cause) {
        super(cause);
    }

    public InvalidArgumentException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
