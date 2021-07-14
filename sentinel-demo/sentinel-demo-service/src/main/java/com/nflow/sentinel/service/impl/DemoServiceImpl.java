package com.nflow.sentinel.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nflow.sentinel.entity.Demo;
import com.nflow.sentinel.mapper.DemoMapper;
import com.nflow.sentinel.service.DemoService;
import org.springframework.stereotype.Service;

/**
 * @author liuzhihang
 * @date 2020/7/15 21:46
 */
@Service
public class DemoServiceImpl extends ServiceImpl<DemoMapper, Demo> implements DemoService {

}
