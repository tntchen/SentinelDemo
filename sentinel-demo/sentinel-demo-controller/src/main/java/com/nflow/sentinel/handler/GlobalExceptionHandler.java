package com.nflow.sentinel.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * controller 异常处理
 *
 * @author
 * @date 2020/1/2 17:25
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ResponseBody
    @ExceptionHandler(value = BlockException.class)
    public String blockExceptionHandler(BlockException blockException) {
        return "请求过于频繁";
    }
}
