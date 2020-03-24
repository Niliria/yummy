package com.oxysa.hashset;

import java.util.LinkedHashSet;


//1. 创建LinkedHashSet集合对象, 存储字符串"hello", "world", "java", "world"
// 2. 遍历集合, 并将结果打印到控制台上.

/**
 * @author Yummy
 * @version 1.0
 * @date 2020-3-14 13:25
 */
public class LinkedHashSetDemo01 {
    public static void main(String[] args) {
        //创建集合
        LinkedHashSet<String> ls = new LinkedHashSet<>();
        //添加元素
        ls.add("hello");
        ls.add("world");
        ls.add("java");
        ls.add("world");
        //遍历集合
        for (String l : ls) {
            System.out.println(l);
        }
    }
}
