package com.oxysa.collection;

import java.util.ArrayList;
import java.util.Collection;

//案例: Collection存储字符串, 然后遍历.
public class CollectionDemo01 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList();
        list.add("hello");
        String s1 = "world";
        list.add(s1);
        list.add("java");

        System.out.println("list: " + list);


    }

}
