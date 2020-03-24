package com.oxysa.homework;
//以下为扩展题:
/*第六题: 通过代码, 完成如下需求:
        1. 定义ArrayList集合，存入多个字符串, 例如: "ab1", "123ad", "def", "bca", "def", "def", "dadfadf"  "dddaaa"  "你好啊"  "我来啦"  "别跑啊"
        2. 遍历集合, 删除长度大于5的字符串, 打印删除后的集合对象
        3. 基于上一步, 删除集合中元素包含0-9数字的字符串(只要字符串中包含0-9中的任意一个数字就需要删除此整个字符串), 打印删除后的集合对象.
        4. 基于上一步, 删除集合中所有的"def"字符串, 打印删除后的集合对象.*/


import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListTest06 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("wqe");
        arrayList.add("ad2");
        arrayList.add("2rew");
        arrayList.add("w5gs");
        arrayList.add("w31fss");
        arrayList.add("sagdgg");
        arrayList.add("1wwr3f");
        arrayList.add("wfwui32uh8");
        arrayList.add("我来了");
        arrayList.add("别走了212");


        //1，遍历集合, 删除长度大于5的字符串, 打印删除后的集合对象
        ListIterator<String> iterator = arrayList.listIterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            if (s.length() > 5) {
                iterator.remove();
            }
        }
        System.out.println(arrayList);
        System.out.println("=============================");

        //2 基于上一步, 删除集合中元素包含0-9数字的字符串(只要字符串中包含0-9中的任意一个数字就需要删除此整个字符串)
        for (int j = 0; j < arrayList.size(); j++) {
            char[] chars = arrayList.get(j).toCharArray();
            for (int k = 0; k < chars.length; k++) {
               if (chars[k] >= '0' && chars[k] <='9'){
                   //删除
                   arrayList.remove(j);
                   j--;
                   break;
               }
            }
        }
        Iterator<String> iterator1 = arrayList.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }



    }
}
