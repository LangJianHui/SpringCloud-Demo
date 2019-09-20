package com.aaa.mrlang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author MrLang
 * @title Provider8082
 * @date 2019/9/11 23:17
 */
@SpringBootApplication
@EnableEurekaClient
//@MapperScan(basePackages = "com.aaa.mrlang.dao")
public class Provider8082 {
    public static void main(String[] args) {
        SpringApplication.run(Provider8082.class, args);
    }
}


