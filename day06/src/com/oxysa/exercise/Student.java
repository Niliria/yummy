package com.oxysa.exercise;

/**
 * @author Yummy
 * @mail 873387751@qq.com
 * @date 2020-3-20 16:52
 */
public class Student {

    private String sid;
    private String name;
    private int age;
    private String address;

    public Student(String sid, String name, int age, String address) {
        this.sid = sid;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return sid + ", " + name + ", " + age + ", " + address;
    }
}
