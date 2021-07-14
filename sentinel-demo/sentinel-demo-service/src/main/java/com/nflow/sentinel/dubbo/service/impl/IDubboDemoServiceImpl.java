package com.nflow.sentinel.dubbo.service.impl;

import com.alibaba.csp.sentinel.adapter.apache.httpclient.SentinelApacheHttpClientBuilder;
import com.nflow.sentinel.entity.Demo;
import com.nflow.sentinel.entity.DemoDto;
import com.nflow.sentinel.service.DemoService;
import com.nflow.sentinel.dubbo.service.IDubboDemoService;
import org.apache.dubbo.config.annotation.Service;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

/**
 * @Author: Jonah.Chen
 * @Date: 2021/7/13 11:09
 * @Description:
 */
@Service(protocol = "dubbo", version = "1.0.0")
public class IDubboDemoServiceImpl implements IDubboDemoService {

    @Autowired
    private DemoService demoService;


    @Override
    public DemoDto getDemo(Long id) {
        Demo demo = demoService.getById(id);
        DemoDto demoDto = new DemoDto();
        BeanUtils.copyProperties(demo, demoDto);
        return demoDto;
    }

    @Override
    public String httpDemo() throws IOException {
        HttpClientBuilder builder = new SentinelApacheHttpClientBuilder();
        CloseableHttpClient httpclient = builder.build();
        HttpGet httpget = new HttpGet("http://localhost:8888/demo/entry_demo");
        CloseableHttpResponse response = null;
        String content;
        try {
            response = httpclient.execute(httpget);
            content = EntityUtils.toString(response.getEntity(), "UTF-8");
        } finally {
            if (response != null) {
                response.close();
            }
            //相当于关闭浏览器
            httpclient.close();

        }
        return content;
    }
}