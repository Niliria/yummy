package com.oxysa.homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*第一题: 通过代码, 完成如下需求:
        1. 自定义一个学生类，给出成员变量name和age.
        2. 使用Collection集合存储学生对象并遍历.
        3. 最后在控制台输出学生对象的成员变量值。
        //格式为: 姓名: 张三, 年龄: 23
        4. 通过两种方式遍历.*/
//提示: 普通迭代器, 增强for.
public class CollectionTest01 {
    public static void main(String[] args) {
        Collection<Student> list = new ArrayList<>();
        Student s1 = new Student("张三", 23);
        Student s2 = new Student("李四", 29);
        list.add(s1);
        list.add(s2);

        Iterator<Student> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("=======================");

        for (Student s : list){
            System.out.println(s);
        }
    }

}
