package com.oxysa.list;

import java.util.ArrayList;
import java.util.List;

//案例: 演示List集合的常用方法
/*
    public void add(int index, E element)     在集合的指定位置插入元素.
    public E remove(int index)                根据索引移除该位置上的元素, 并返回被删除的元素.
    public E set(int index, E element)        修改指定位置的元素为指定的值,并返回被修改的元素.
    public E get(int index)                   根据索引, 获取该位置上的元素.

    细节:
        上述的四个方法, 如果传入的索引不存在, 就会报 索引越界异常(IndexOutOfBoundsException.)
 */
public class ListDemo02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("abd");

        //测试 public void add(int index, E element)     在集合的指定位置插入元素.
        // list.add(2,"hadoop");

        //测试 public E remove(int index)                根据索引移除该位置上的元素, 并返回被删除的元素.
        //System.out.println("remove: " + list.remove(2));

        //测试 public E set(int index, E element)        修改指定位置的元素为指定的值,并返回被修改的元素.
        // System.out.println("set: " + list.set(2,"scala"));

        //测试 public E get(int index)                   根据索引, 获取该位置上的元素.
        System.out.println("get: "+ list.get(3));


        System.out.println("list:" + list);
    }
}
