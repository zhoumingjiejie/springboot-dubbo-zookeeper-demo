package com.practice.springboot.dubbo.consumer.Controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.practice.springboot.dubbo.api.service.SayHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 0.0.0 on 2018/8/6.
 */
@RestController
public class SayHelloController {

    @Reference
    private  SayHelloService  sayHelloService;

    @RequestMapping("/hello")
    public String say(@RequestParam("name") String name) {
        return this.sayHelloService.sayHello(name);
    }
}
