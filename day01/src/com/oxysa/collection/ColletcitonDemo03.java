package com.oxysa.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//案例: 遍历Collection集合, 通过迭代器的方式遍历.
/*
    Collection集合中的方法:
    	public Iterator<E> iterator();			根据集合对象, 获取其对应的迭代器对象.

    Iterator迭代器(接口)中的成员方法:
        public boolean hasNext();			判断迭代器中是否还有下一个元素.
        public E next();					获取迭代器中的下一个元素, 如果没有元素了你还调用该方法, 就会报: NoSuchElementException.
 */
public class ColletcitonDemo03 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");

        //遍历集合
        Iterator<String> it = list.iterator();
        //判断迭代器中是否还有下一个元素.
        while (it.hasNext()) {
            //如果有, 就获取下一个元素.
            String s = it.next();
            System.out.println(s);
        }

    }
}
