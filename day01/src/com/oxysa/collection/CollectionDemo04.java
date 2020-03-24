package com.oxysa.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//案例: Collection集合存储学生, 并遍历.
public class CollectionDemo04 {
    public static void main(String[] args) {
        //创建集合
        Collection<Student> list = new ArrayList<>();

        //创建对象
        Student s1 = new Student("石原里美", 30);
        Student s2 = new Student("小松菜乃", 24);
        Student s3 = new Student("斋藤飞鸟", 22);

        //添加对象
        list.add(s1);
        list.add(s2);
        list.add(s3);

        //遍历集合
        Iterator<Student> it = list.iterator();
        while (it.hasNext()) {
            //这样写比较麻烦
            // Student s = it.next();
            // System.out.println(s);

            //这样比较方便
            System.out.println(it.next());
        }
    }
}
