package com.java.xdd.web.pojo;

import java.util.Date;

/**
 * Created by qw on 2017/6/28.
 */
public class Person {
    private String name;

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }


    private Date birthday;

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    private Long salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
