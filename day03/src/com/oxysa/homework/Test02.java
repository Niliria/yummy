package com.oxysa.homework;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test02 {

    public static void main(String[] args) {
        /**
            第二题: 通过代码, 完成如下需求:
                1. 创建HashMap集合, 键是学生对象(Student), 值是居住地(String).
                2. 往HashMap集合中添加3组数据.
                3. 通过两种方式, 遍历HashMap集合.
        */

        //1,创建集合
        HashMap<Student, String> hm = new HashMap<>();
        //添加3组数据
        hm.put(new Student("石原里美", 34), "日本东京");
        hm.put(new Student("小松菜奈", 24), "北海道");
        hm.put(new Student("西野七濑", 26), "大阪");

        //2,遍历数据
        //方式一：增强for
        for (Student key : hm.keySet()) {
            System.out.println(key + "... " + hm.get(key));
        }

        //方式二：根据键值对对象获取键和值
        Set<Map.Entry<Student, String>> entries = hm.entrySet();

        for (Map.Entry per : entries) {
            System.out.println(per.getKey() + "..." + per.getValue());
        }

    }
}
