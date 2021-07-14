package com.nflow.sentinel.dubbo.service;

import com.nflow.sentinel.entity.DemoDto;

import java.io.IOException;

/**
 * @Author: Jonah.Chen
 * @Date: 2021/7/13 11:09
 * @Description:
 */
public interface IDubboDemoService {

    DemoDto getDemo(Long id);

    String httpDemo() throws IOException;
}