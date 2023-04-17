package com.bichngoc.android_day2.models;

import java.io.Serializable;

public class UserSerializable implements Serializable {
    private String name;
    private int age;

    public UserSerializable() {
    }

    public UserSerializable(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
