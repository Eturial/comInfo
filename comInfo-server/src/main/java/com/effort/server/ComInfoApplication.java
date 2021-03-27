package com.effort.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

/**
 * 启动类
 *
 * @author 86137
 * @since 1.0.0
 * */
@SpringBootApplication
@MapperScan("com.effort.server.mapper")
public class ComInfoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComInfoApplication.class, args);
    }
}
