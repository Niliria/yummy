package com.oxysa.hashset;

import java.util.LinkedHashSet;

/**
 * @author Yummy
 * @version 1.0
 * @date 2020-3-14 13:28
 */
public class LinkedHashSetDemo02 {
    public static void main(String[] args) {

        /* linkedHashSet有序，唯一(引用数据类型实体类需用重写equals() & hashCode()方法)
         */

        //创建集合
        LinkedHashSet<Student> ls = new LinkedHashSet<>();

        //添加学生对象
        ls.add(new Student("水原希子",34));
        ls.add(new Student("小松菜奈",24));
        ls.add(new Student("西野七濑",27));
        ls.add(new Student("西野七濑",27));

        //遍历
        for (Student l : ls) {
            System.out.println(l);
        }

    }
}
