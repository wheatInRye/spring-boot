package com.fq.maven.springboot02;

import com.fq.maven.springboot02.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot02ApplicationTests {

    @Autowired
    private Person person;
    @Autowired
    private ApplicationContext ioc;
    @Test
    public void contextLoads() {
        System.out.println(person);
        System.out.println(ioc.getBean("hello"));
    }

}
