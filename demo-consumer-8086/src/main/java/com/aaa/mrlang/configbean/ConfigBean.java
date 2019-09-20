package com.aaa.mrlang.configbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author MrLang
 * @title ConfigBean
 * @date 2019/9/12 16:35
 */
@Configuration
public class ConfigBean {
    @Bean
    public RestTemplate redisTemplate(){
        return new RestTemplate();
    }
}
