package com.oxysa.collection;

import java.util.ArrayList;
import java.util.Collection;

//案例: 演示Collection集合中的常用的方法
/**
    public boolean add(E e)			    添加元素.
    public boolean remove(Object obj)   从集合中移除指定的元素.
    public void clear()                 清空集合对象
    public boolean contains(Object obj) 判断集合中是否包含指定的元素
    public boolean isEmpty()            判断集合是否为空
    public int size()                   获取集合的长度, 即集合中元素的个数
 */


public class CollectionDemo02 {

    public static void main(String[] args) {
        //创建集合
        Collection<String> list = new ArrayList<>();
        //添加元素
        list.add("hello");
        list.add("world");
        list.add("java");
        //测试以上6各方法
        //测试  public boolean remove(Object obj)   从集合中移除指定的元素.
        //System.out.println("remove: " + list.remove("hello"));
        //System.out.println("remove: " + list.remove("abb"));

        //测试 public void clear()                 清空集合对象
        // list.clear();

        //测试 public boolean contains(Object obj) 判断集合中是否包含指定的元素
        // System.out.println("contains: " + list.contains("abc"));
        // System.out.println("contains: " + list.contains("java"));

        //测试 public boolean isEmpty()            判断集合是否为空  集合的长度为0, 返回true, 否则, 返回false.
        // System.out.println("isEmpty: " + list.isEmpty());

        //测试 public int size()                   获取集合的长度, 即集合中元素的个数
        System.out.println("size: " + list.size());

        //输出集合查看内容
        System.out.println("list: " + list);

    }


}
