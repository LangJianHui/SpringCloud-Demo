package com.aaa.mrlang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author MrLang
 * @title Appliction8000
 * @date 2019/9/11 22:53
 */
@SpringBootApplication
@EnableEurekaServer
public class Appliction8000 {
    public static void main(String[] args) {
        SpringApplication.run(Appliction8000.class, args);

    }
}
