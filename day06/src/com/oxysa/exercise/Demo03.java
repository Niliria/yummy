package com.oxysa.exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * @author Yummy
 * @mail 873387751@qq.com
 * @date 2020-3-20 16:28
 * 案例: 把文本文件中的数据读取到集合中，并遍历集合。要求：文件中每一行数据是一个集合元素
 */
public class Demo03 {
    public static void main(String[] args) throws Exception {
        //开发原则 对于比较耗费系统资源的对象 晚开早关
        ArrayList<String> list = new ArrayList<>();
        //创建字符高效流
        BufferedReader br = new BufferedReader(new FileReader("./day06/data/4.txt"));
        String line = null;
        while ((line = br.readLine()) != null) {
            list.add(line);
        }
        br.close();
        for (String s : list) {
            System.out.println(s);
        }

    }
}
