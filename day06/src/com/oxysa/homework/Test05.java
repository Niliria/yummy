package com.oxysa.homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Yummy
 * @mail 873387751@qq.com
 * @date 2020-3-20 21:21
 * 知项目下有个a5.txt文本文件，里边有两行数据，如下：
 * a,c,d,e,g,h
 * a,g,b,o,q,r
 * 需求：
 * 创建输入流，读取这两行数据，每行数据都可以看做是一个ArrayList<String>集合，而每行的字母就是该集合中的元素。
 * 对两个集合中的元素去重后合并，然后将去重后的结果写入到项目下的b.txt文本文件中。
 */
public class Test05 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("./day06/data/a5.txt"));
        String line = null;
        while ((line = br.readLine()) != null) {
            ArrayList<String> list = new ArrayList<>();
            String[] arr = line.split(",");
            list.add(Arrays.toString(arr));
        }
        br.close();
    }

}
