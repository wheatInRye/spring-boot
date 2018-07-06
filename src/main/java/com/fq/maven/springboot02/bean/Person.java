package com.fq.maven.springboot02.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @Auther: 冯庆
 * @Date: 2018/7/3 21:29
 * @Description:
 */

@Component
@ConfigurationProperties(prefix = "person")
public class Person {
    private String lastName;
    private boolean boss;
    private Car cars;
    private Map<String,String> daughters;
    private List<Object> list;

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", boss=" + boss +
                ", cars=" + cars +
                ", daughters=" + daughters +
                ", list=" + list +
                '}';
    }

    public void setCars(Car cars) {
        this.cars = cars;
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public Map<String, String> getDaughters() {
        return daughters;
    }

    public void setDaughters(Map<String, String> daughters) {
        this.daughters = daughters;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isBoss() {
        return boss;
    }

    public void setBoss(boolean boss) {
        this.boss = boss;
    }

}
