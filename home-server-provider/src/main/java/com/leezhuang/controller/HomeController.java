package com.leezhuang.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/homes")
public class HomeController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/index")
    public String index() {
        return "home server port: " + port;
    }
}
