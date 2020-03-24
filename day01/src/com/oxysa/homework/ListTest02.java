package com.oxysa.homework;
/*
第二题: 通过代码, 完成如下需求:
        1. 自定义一个学生类，给出成员变量name和age.
        2. 使用List集合存储学生对象并遍历.
        3. 最后在控制台输出学生对象的成员变量值。
        //格式为: 姓名: 张三, 年龄: 23
        4. 通过两种方式遍历.*/
//提示: 普通迭代器, 增强for.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest02 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        Student s1 = new Student("张三", 23);
        Student s2 = new Student("李四", 29);
        list.add(s1);
        list.add(s2);
        //普通迭代器
        Iterator<Student> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("=======================");

        //普通for
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("=======================");

        //增强for
        for (Student s : list) {
            System.out.println(s);
        }

    }
}
