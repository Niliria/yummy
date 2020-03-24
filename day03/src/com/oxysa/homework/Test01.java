package com.oxysa.homework;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class Test01 {

    public static void main(String[] args) {
    /**
        需求
        1.创建HashMap集合, 键是学号(String), 值是学生对象(Student).
        2.往HashMap集合中添加3组数据.
        3.通过两种方式, 遍历HashMap集合
    */
        //1,创建HashMap集合
        HashMap<String, Student> hm = new HashMap<>();
        //2，添加三组数据
        hm.put("0001", new Student("石原里美", 34));
        hm.put("0002", new Student("小松菜奈", 24));
        hm.put("0003", new Student("西野七濑", 26));

        //遍历集合
        //方式一：增强for
        for (String key : hm.keySet()) {
            System.out.println(key + "..." + hm.get(key));
        }

        System.out.println("=============================");

        //方式二：普通迭代器
        Set<String> keys = hm.keySet();
        Iterator<String> it = keys.iterator();
        while (it.hasNext()) {
            String key = it.next();
            System.out.println(key + "..." + hm.get(key));
        }

        System.out.println("=============================");

        //方式三：根据键值对对象获取键和值
        for (Map.Entry<String, Student> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + "..." + entry.getValue());
        }


    }
}
