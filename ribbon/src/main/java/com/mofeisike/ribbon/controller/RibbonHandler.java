package com.mofeisike.ribbon.controller;

/**
 * description: RibbonHandler <br>
 * date: 2019/8/5 14:56 <br>
 */

import com.mofeisike.ribbon.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

@RestController
@RequestMapping("/ribbon")
public class RibbonHandler {

    @Autowired
    private RestTemplate restTemplate;

    //作为消费者的使用Ribbon做负载均衡(消费提供者)

    @GetMapping("/findAll")
    public Collection<Student> findAll() {
        //eurekaclient注册的name是provider ,所以可以直接用provider替代localhost:8010
        //return restTemplate.getForObject("http://localhost:8010/student/findAll", Collection.class);
        return restTemplate.getForObject("http://provider/student/findAll", Collection.class);
    }

    @GetMapping("/index")
    public String index() {
        return restTemplate.getForObject("http://provider/student/index", String.class);
    }
}