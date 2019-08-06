package com.mofeisike.feign.feign;

import com.mofeisike.feign.entity.Student;
import com.mofeisike.feign.feign.impl.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;


/**
 * description: FeignProviderClient <br>
 * date: 2019/8/5 15:33 <br>
 */


@FeignClient(value = "provider",fallback = FeignError.class)
//@FeignClient(value = "provider")
// 声明式接口,添加注解即可, value访问那个微服务
public interface FeignProviderClient {

    @GetMapping("/student/findAll")
    public Collection<Student> findAll();

    @GetMapping("/student/index")
    public String index();
}
