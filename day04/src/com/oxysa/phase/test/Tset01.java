package com.oxysa.phase.test;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Yummy
 * @mail 873387751@qq.com
 * @date 2020-3-14 21:04
 */
public class Tset01 {
    public static void main(String[] args) {
        /*
        1.利用键盘录入，输入一个字符串
	    2.统计该字符串中各个字符的数量(提示:字符不用排序)
	    3.如：用户输入字符串
	    "If~you-want~to~change-your_fate_I_think~you~must~come-to-the-dark-horse-to-learn-java"
        4.程序输出结果为:
	    -(9)I(2)_(3)a(7)c(2)d(1)e(6)f(2)g(1)h(4)i(1)j(1)k(2)l(1)m(2)n(4)o(8)r(4)s(2)t(8)u(4)v(1)w(1)y(3)~(6)
         */

        System.out.println("请输入字符串>>>>>>>>");
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        //获取数据
        String next = sc.next();
        //创建hashMap集合字符作为key,出现的次数作为value
        HashMap<Character, Integer> hm = new HashMap<>();
        //把输入的字符串转化为数组
        char[] chars = next.toCharArray();
        //遍历
        for (char key : chars) {
            if (hm.containsKey(key)){
                Integer value = hm.get(key);
                hm.put(key,1);
            }else {
                hm.put(key,1);
            }
        }
        //7,拼接字符串
        StringBuilder sb = new StringBuilder();
        for (Character key : hm.keySet()) {
            Integer value = hm.get(key);
            sb.append(key).append("(").append(value).append(")");
        }
        //8输出
        System.out.println(sb);


    }
}
