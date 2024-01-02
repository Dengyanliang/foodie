package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Desc:
 * @Auther: dengyanliang
 * @Date: 2023/12/15 18:09
 */
// 扫描 mybatis 通用 mapper 所在的包
@MapperScan(basePackages = "com.deng.mapper")
// 扫描所有包以及相关组件包
@ComponentScan(basePackages = {"com.deng","org.n3r.idworker"})
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
