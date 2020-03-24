package com.oxysa.homework;

import java.util.Scanner;
import java.util.TreeMap;

public class Test05 {

    public static void main(String[] args) {
     /*
       第五题: 通过代码, 完成如下需求:
        1. 键盘录入一个字符串，要求统计字符串中每个字符串出现的次数。
        2. 举例：键盘录入“aababcabcdabcde”  在控制台输出：“a(5)b(4)c(3)d(2)e(1)”
     */
        //1,创建键盘录入对象
        System.out.println("请输入一串字符串:");
        //2,创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        //3,获取输入的字符串
        String s = sc.nextLine();
        //4，使用TreeMap 升序排列A-Z
        //字符作为key,出现的次数作为value
        TreeMap<Character, Integer> tm = new TreeMap<>();
        //5,把输入的字符串转化为字符数组
        char[] chars = s.toCharArray();
        //6，遍历
        for (char key : chars) {
            //判断字符是否重复出现
            if (tm.containsKey(key)) {
                //获取出现的次数
                Integer value = tm.get(key);
                tm.put(key, value + 1);
            } else {
                //如果首次出现 记为一
                tm.put(key, 1);
            }
        }

        //7,拼接字符串
        StringBuilder sb = new StringBuilder();
        for (Character key : tm.keySet()) {
            Integer value = tm.get(key);
            sb.append(key).append("(").append(value).append(")");
        }
        //8输出
        System.out.println(sb);
    }
}
