package com.oxysa.homework;

/*第三题: 通过代码, 完成如下需求:
        1. 自定义一个人类，给出成员变量name和age.
        2. 使用ArrayList集合存储人类对象并遍历.
        3. 最后在控制台输出人类对象的成员变量值。
        //格式为: 姓名: 张三, 年龄: 23
        4. 通过四种方式遍历.
提示: 普通迭代器, 增强for, 列表迭代器, 普通for*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListTest03 {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        Person p1 = new Person("张三", 24);
        Person p2 = new Person("李四", 25);
        Person p3 = new Person("王二", 26);
        list.add(p1);
        list.add(p2);
        list.add(p3);

        //普通迭代器
        Iterator<Person> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("========================");

        //list专有列表迭代器
        ListIterator<Person> its = list.listIterator();
        while (its.hasNext()) {
            System.out.println(its.next());
        }
        System.out.println("========================");

        //普通for
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("========================");

        //增强for
        for (Person p : list){
            System.out.println(p);
        }
    }
}
