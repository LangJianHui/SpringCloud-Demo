package com.aaa.mrlang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author MrLang
 * @title Application8001
 * @date 2019/9/11 22:54
 */
@SpringBootApplication
@EnableEurekaServer
public class Application8001 {
    public static void main(String[] args) {

        SpringApplication.run(Application8001.class, args);
    }
}
