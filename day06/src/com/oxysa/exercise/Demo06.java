package com.oxysa.exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * @author Yummy
 * @mail 873387751@qq.com
 * @date 2020-3-20 16:59
 * 把文本文件中的数据读取到集合中，并遍历集合。要求：文件中每一行数据是一个集合元素
 */
public class Demo06 {
    public static void main(String[] args) throws Exception {
        ArrayList<Student> list = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader("./day06/data/5.txt"));

        String line = null;
        while ((line = br.readLine()) != null) {

            //将读取到的数据写入到集合中.
            //line记录的是: 文件中的每一行数据:  itheima002, 赵丽颖, 31, 河北
            //list.add(new Student(学号, 姓名, 年龄, 居住地));
            String[] arr = line.split(", ");
            list.add(new Student(arr[0], arr[1], Integer.parseInt(arr[2]), arr[3]));
        }
        br.close();
        for (Student student : list) {
            System.out.println(student);
        }


    }
}
