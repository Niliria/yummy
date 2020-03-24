package com.oxysa.exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;

/**
 * @author Yummy
 * @mail 873387751@qq.com
 * @date 2020-3-20 16:36
 * 点名器
 */
public class Demo04 {
    public static void main(String[] args) throws Exception {

        ArrayList<String> list = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader("./day06/data/4.txt"));

        String line = null;
        while ((line = br.readLine()) != null) {
            list.add(line);
        }

        br.close();
        //创建Random对象
        Random r = new Random();
        //获取随机数
        int i = r.nextInt(list.size());
        //根据获得的随机数，获取其在list集合中对应元素
        String name = list.get(i);
        System.out.println(name);

    }
}
