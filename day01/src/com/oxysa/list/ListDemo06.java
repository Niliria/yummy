package com.oxysa.list;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

//案例: 演示LinkedList集合存储字符串然后遍历.
public class ListDemo06 {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("hello");
        list.add("world");
        list.add("java");

        //遍历集合
        //第一种 迭代器
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("==============================");

        //第二种 List体系独有的列表迭代器
        ListIterator<String> its = list.listIterator();
        while (its.hasNext()){
            System.out.println(its.next());
        }
        System.out.println("==============================");

        //第三种 增强for
        for (String s : list){
            System.out.println(s);
        }
        System.out.println("==============================");

        //第四种 普通for
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }


    }
}
