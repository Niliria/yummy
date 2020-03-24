package com.oxysa.exercise;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 * @author Yummy
 * @mail 873387751@qq.com
 * @date 2020-3-20 16:17
 * 案例: 把ArrayList<String>集合中的内容写入到文件中.
 */
public class Demo02 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        list.add("小松菜奈");
        list.add("石原里美");
        list.add("桥本环奈");
        list.add("斋藤飞鸟");
        BufferedWriter bw = new BufferedWriter(new FileWriter("./day06/data/4.txt"));
        for (String s : list) {
            bw.write(s);
            bw.newLine();
        }
        System.out.println("写入完成！！！");
        bw.close();
    }
}
