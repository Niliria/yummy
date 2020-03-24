package com.oxysa.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

//案例: 演示ArrayList集合存储字符串然后遍历.
public class ListDemo05 {
    public static void main(String[] args) {
        //创建集合
        List<String> list = new ArrayList<>();
        //添加元素对象
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("hadoop");
        //遍历
        //第一种迭代器
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            // String s = it.next();
            // System.out.println(s);
            System.out.println(it.next());
        }
        System.out.println("======================");
        //第二种普通for循环遍历
        for (int i = 0; i < list.size(); i++) {
            // String s = list.get(i);
            // System.out.println(s);
            System.out.println(list.get(i));
        }
        System.out.println("======================");

        //第三种List独有列表迭代器
        ListIterator<String> its = list.listIterator();
        while (its.hasNext()) {
            System.out.println(its.next());
        }
        System.out.println("======================");

        //第四种增强for
        for (String s : list){
            System.out.println(s);
        }



    }
}
