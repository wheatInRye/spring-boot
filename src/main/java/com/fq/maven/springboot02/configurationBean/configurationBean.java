package com.fq.maven.springboot02.configurationBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: 冯庆
 * @Date: 2018/7/4 13:36
 * @Description:配置类
 */

@Configuration
public class configurationBean {

    @Bean
    public String hello(){
        System.out.println("配置类");
        return "helloWord";
    }
}
