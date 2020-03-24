package com.oxysa.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Test03 {

    public static void main(String[] args) {
        /**
         第三题: 通过代码, 完成如下需求:
         1. 定义ArrayList<HashMap<String, String>>集合, 存储三个元素, 每个元素都是一个双列集合, 具体如下:
         2. 第一个双列集合, 记录的信息如下:
         孙策	大乔
         周瑜	小乔
         3. 第二个双列集合, 记录的信息如下:
         郭靖	黄蓉
         杨过	小龙女
         4. 第三个双列集合, 记录的信息如下:
         令狐冲	任盈盈
         林平之	岳灵珊
         5. 把上述的三个双列集合当做元素对象, 添加到ArrayList集合中.
         6. 遍历ArrayList集合, 输出每个元素.
         */

        //1,定义ArrayList<HashMap<String, String>>集合
        ArrayList<HashMap<String, String>> list = new ArrayList<>();
        //2,创建map集合存储三组数据
        HashMap<String, String> hm1 = new HashMap<>();
        //3,在hashMap中添加三组数据
        hm1.put("孙策", "大乔");
        hm1.put("周瑜", "小乔");

        HashMap<String, String> hm2 = new HashMap<>();
        hm2.put("郭靖", "黄蓉");
        hm2.put("杨过", "小龙女");

        HashMap<String, String> hm3 = new HashMap<>();
        hm3.put("令狐冲", "任盈盈");
        hm3.put("林平之", "岳灵珊");

        //添加到ArrayList集合中
        list.add(hm1);
        list.add(hm2);
        list.add(hm3);

        //4,遍历集合
        for (HashMap<String, String> hm : list) {

         /*
           //方式一：使用增强for
           for (String key : hm.keySet()) {
                System.out.println(key + "...." + hm.get(key));
            }
         */

            //方式二:使用键值对对象获取键和值
            for (Map.Entry<String, String> entry : hm.entrySet()) {
                System.out.println(entry.getKey() + "..." + entry.getValue());
            }
            System.out.println();
        }
    }
}
