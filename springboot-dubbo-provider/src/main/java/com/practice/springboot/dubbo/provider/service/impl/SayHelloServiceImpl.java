package com.practice.springboot.dubbo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.practice.springboot.dubbo.api.service.SayHelloService;
import org.springframework.stereotype.Component;

/**
 * Created by 0.0.0 on 2018/8/1.
 */
@Service(interfaceClass = SayHelloService.class)
@Component("sayHelloService")
public class SayHelloServiceImpl implements SayHelloService {
    public String sayHello(String name) {
        return "Hello " + name + "!";
    }
}
