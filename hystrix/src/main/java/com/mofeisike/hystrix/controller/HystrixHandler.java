package com.mofeisike.hystrix.controller;

import com.mofeisike.hystrix.entity.Student;
import com.mofeisike.hystrix.feign.FeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * description: HystrixHandler <br>
 * date: 2019/8/5 16:51 <br>
 */

@RestController
@RequestMapping("/hystrix")
public class HystrixHandler {

    @Autowired
    private FeignProviderClient feignProviderClient;
    @GetMapping("/findAll")
        public Collection<Student> findAll(){
            return feignProviderClient.findAll();
        }

        @GetMapping("/index")
        public String index(){
            return feignProviderClient.index();
        }

}
