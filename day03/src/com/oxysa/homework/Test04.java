package com.oxysa.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Test04 {

    public static void main(String[] args) {
        /*
        第四题: 通过代码, 完成如下需求:
        1. 创建一个HashMap集合，存储三个键值对元素，键表示书名(String)，值是书中人物名(ArrayList<String>)
        2. 第一个ArrayList集合的元素: (三国演义)
                诸葛亮
        赵云
        3. 第二个ArrayList集合的元素: (西游记)
                唐僧
        孙悟空
        4. 第三个ArrayList集合的元素: (水浒传)
                武松
        鲁智深
        5. 遍历HashMap集合, 输出每一个元素.
        */

        //1,创建一个HashMap集合，
        HashMap<String, ArrayList<String>> hm = new HashMap<>();
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("诸葛亮");
        list1.add("赵云");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("唐僧");
        list2.add("孙悟空");
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("武松");
        list3.add("鲁智深");

        //添加三组数据
        hm.put("三国演义", list1);
        hm.put("西游记", list2);
        hm.put("水浒传", list3);

        //遍历集合
        //方式一：使用增强for
    /*    for (String key : hm.keySet()) {
            System.out.println(key + ": ");
            for (String value : hm.get(key)) {
                System.out.println("\t" + value);
            }
            System.out.println();
        }
  */
        //方式二:使用键值对对象遍历
        for (Map.Entry<String, ArrayList<String>> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + ":");
            for (String value : entry.getValue()) {
                System.out.println("\t" + value);
            }
            System.out.println();
        }


    }
}
