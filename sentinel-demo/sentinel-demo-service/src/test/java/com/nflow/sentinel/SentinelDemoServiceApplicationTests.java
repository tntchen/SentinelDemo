package com.nflow.sentinel;

import com.nflow.sentinel.entity.Demo;
import com.nflow.sentinel.mapper.DemoMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest(classes = SentinelDemoServiceApplication.class)
class SentinelDemoServiceApplicationTests {


    @Resource
    private DemoMapper demoMapper;

    @Test
    void contextLoads() {
    }

    @Test
    public void dbTest() {

        Demo demo = demoMapper.selectById(1);

        System.out.println("demo = " + demo);

    }

}
