package com.mofei.nativeconfigclient.controller;

/**
 * description: NativeConfigHandler <br>
 * date: 2019/8/6 9:11 <br>
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/native")
public class NativeConfigHandler {
    @Value("${server.port}")
    private String port;
    @Value("${foo}")
    private String foo;

    @GetMapping("/index")
    public String index() {
        return this.port + "-" + this.foo;
    }
}