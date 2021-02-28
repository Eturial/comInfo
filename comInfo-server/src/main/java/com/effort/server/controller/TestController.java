package com.effort.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试
 *
 * @author 86137
 * @since 1.0.0
 */
@RestController
public class TestController {

    @GetMapping("hello")
    public String hello() {
        return "hello";
    }
}
