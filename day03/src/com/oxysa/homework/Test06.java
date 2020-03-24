package com.oxysa.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test06 {
    public static void main(String[] args) {
       /*
       第六题:	通过代码, 完成如下需求:
            1. 定义ArrayList集合, 存储5个学生对象(姓名, 语文成绩, 数学成绩).
            2. 按照总成绩降序排列.
        */
        //1，创建集合
        ArrayList<Student1> list = new ArrayList<>();

        //2，添加数据
        list.add(new Student1("zhangsan", 90, 89)); //179
        list.add(new Student1("lisi", 98, 58));   //156
        list.add(new Student1("wanger", 78, 67));  //145
        list.add(new Student1("wuliu", 88, 54));  //142
        list.add(new Student1("liaoxiaol", 98, 78)); //176


        Collections.sort(list, new Comparator<Student1>() {

            @Override
            public int compare(Student1 s1, Student1 s2) {
                return s1.getSum() - s2.getSum();
            }
        });

        //遍历集合
        for (Student1 s : list) {
            System.out.println(s);
        }


    }
}
