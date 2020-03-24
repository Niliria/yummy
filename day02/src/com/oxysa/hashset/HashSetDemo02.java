package com.oxysa.hashset;

import java.util.HashSet;

/**
 * @author Yummy
 * @version 1.0
 * @date 2020-3-14 13:14
 */
public class HashSetDemo02 {
    public static void main(String[] args) {
        /*重点记忆:
        HashSet保证元素的唯一性依赖hashCode(), equals().*/
        //创建hashSet集合
        HashSet<Student> hs = new HashSet<>();

        //添加学生对象
        hs.add(new Student("水原希子",34));
        hs.add(new Student("小松菜奈",24));
        hs.add(new Student("西野七濑",27));
        hs.add(new Student("西野七濑",27));

        //遍历
        for (Student h : hs) {
            System.out.println(h);
        }

    }
}
