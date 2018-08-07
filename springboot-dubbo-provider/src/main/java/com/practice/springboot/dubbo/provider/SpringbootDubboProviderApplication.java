package com.practice.springboot.dubbo.provider;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import java.io.IOException;

@EnableDubboConfiguration
@SpringBootApplication
public class SpringbootDubboProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDubboProviderApplication.class, args);
		//阻塞作用，否则会由于不是web项目，执行main方法后立即停止服务。
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
