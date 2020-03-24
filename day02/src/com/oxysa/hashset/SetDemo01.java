package com.oxysa.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author Yummy
 * @version 1.0
 * @date 2020-3-14 12:31
 */
public class SetDemo01 {
    public static void main(String[] args) {
        /**
         * 案例: Set入门.
         * Set集合的特点: 无序, 唯一, 元素没有索引.
         *    需求:
         *      1. 创建Set集合对象, 存储字符串数据: "hello", "world", "java", "world"
         *      2. 通过两种方式, 遍历Set集合.
         */
        //创建Set集合
        Set<String> set = new HashSet<>();

        //添加数据
        set.add("hello");
        set.add("world");
        set.add("java");
        set.add("world");

        //遍历Set集合
        //方式一：迭代器遍历
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            String next = it.next();
            System.out.println(next);
        }
        System.out.println("--------------------");

        //方式二使用增强for
        for (String s : set) {
            System.out.println(s);
        }
    }
}
