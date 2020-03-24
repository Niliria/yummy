package com.oxysa.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//案例: List集合存储字符串并遍历.
//List集合的特点: 有序, 可重复, 元素有索引.
public class ListDemo01 {
    public static void main(String[] args) {
        //创建集合
        List<String> list = new ArrayList<>();

        //添加对象
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("java");

        //遍历集合
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }


    }
}
