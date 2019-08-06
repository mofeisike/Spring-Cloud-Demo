package com.mofeisike.feign.feign.impl;

import com.mofeisike.feign.entity.Student;
import com.mofeisike.feign.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * description: FeignError <br>
 * date: 2019/8/5 15:37 <br>
 */

@Component
public class FeignError  implements FeignProviderClient{

    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中......";
    }
}
