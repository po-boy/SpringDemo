package com.springmvc.pojo.model;

/**
 * Created by 炜 on 2017/12/28.
 */
public class User {
    private String name;
    private Integer age;
    private School school;

    public User() {
        super();
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public School getSchool() {
        return school;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
