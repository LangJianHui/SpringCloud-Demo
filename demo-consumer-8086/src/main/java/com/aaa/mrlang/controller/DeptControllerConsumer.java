package com.aaa.mrlang.controller;

import com.aaa.mrlang.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author MrLang
 * @title DeptControllerConsumer
 * @date 2019/9/12 16:45
 */
@RestController
public class DeptControllerConsumer {

    private  static  String REST_URL_PREFIX="http://localhost:8082";
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("consumer/dept/add")
    public boolean add(Dept dept){
        return restTemplate.postForObject(REST_URL_PREFIX, dept, Boolean.class);
    }

    @RequestMapping("consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/"+id, Dept.class);
    }

    @RequestMapping("consumer/dept/list")
    public List<Dept> get(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list/", List.class);
    }

}
