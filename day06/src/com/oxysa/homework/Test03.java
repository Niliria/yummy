package com.oxysa.homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;

/**
 * @author Yummy
 * @mail 873387751@qq.com
 * @date 2020-3-20 17:56
 * <p>
 * 3. 随机点名器案例.
 * 提示: 高效的字符流一次读写一行.
 */
public class Test03 {
    public static void main(String[] args) throws Exception {
        //创建list集合 用来存储姓名
        ArrayList<String> list = new ArrayList<>();
        //创建字符高效流
        BufferedReader br = new BufferedReader(new FileReader("./day06/data/4.txt"));
        //一次读取一行
        String line = null;
        while ((line = br.readLine()) != null) {
            //将读取到的姓名添加到集合中
            list.add(line);
        }
        //晚开早关
        br.close();

        Random r = new Random();

        int index = r.nextInt(list.size());
        String name = list.get(index);
        System.out.println(name);
    }
}
