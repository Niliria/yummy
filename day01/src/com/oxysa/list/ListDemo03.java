package com.oxysa.list;

import java.util.ArrayList;
import java.util.List;

//案例: 遍历List集合, 通过普通for + size()方式.
public class ListDemo03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("helllo");
        list.add("world");
        list.add("java");

         /*
            Collection集合中的方法
                public int size();          //获取集合的长度.
            List集合中独有的方法
                public E get(int index);    //根据索引, 获取其对应的元素.
                快捷键itli
         */
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
