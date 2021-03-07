package com.zav.shared;

import java.io.Serializable;

public class User implements Serializable {
    private String name;
    private Sex sex;


    public User() {
    }

    public User(String name, Sex sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }
}
