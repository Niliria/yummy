package com.oxysa.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//案例: 演示List集合存储自定义对象.
public class ListDemo04 {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        //创建对象
        Student s1 = new Student("石原里美", 30);
        Student s2 = new Student("小松菜乃", 24);
        Student s3 = new Student("斋藤飞鸟", 22);
        list.add(s1);
        list.add(s2);
        list.add(s3);

        //两种遍历
        //第一种迭代器
        Iterator<Student> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("============");
        //普通for循环遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }
}
