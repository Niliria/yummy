package com.oxysa.hashset;

import java.util.HashSet;

/**
 * @author Yummy
 * @version 1.0
 * @date 2020-3-14 13:04
 */
public class HashSetDemo01 {
    public static void main(String[] args) {
        /**
         * 案例一: 存储字符串并遍历
         *
         * 需求
         *
         * 定义HashSet集合, 存储字符串"hello", "world", "java", "world"
         * 遍历HashSet集合, 打印每一个元素值, 并观察程序的运行结果.
         */
         //创建hashSet集合
        HashSet<String> set = new HashSet<>();
        //添加数据
        set.add("hello");
        set.add("world");
        set.add("java");
        set.add("world");
        //遍历集合
        for (String s : set) {
            System.out.println(s);
        }
    }
}
