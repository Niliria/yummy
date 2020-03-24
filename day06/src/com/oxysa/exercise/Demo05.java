package com.oxysa.exercise;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 * @author Yummy
 * @mail 873387751@qq.com
 * @date 2020-3-20 16:49
 * //案例: 把ArrayList<Student>集合中的内容写入到文件中.
 * 需求:
 * 1. 把ArrayList集合中的学生数据写入到文本文件。
 * 2. 要求：每一个学生对象的数据作为文件中的一行数据.
 * 3. 格式：学号,姓名,年龄,居住地
 * 4. 举例：itheima001,刘亦菲,33,北京
 */
public class Demo05 {
    public static void main(String[] args) throws Exception {
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student("1001", "小松菜奈", 18, "日本"));
        list.add(new Student("1002", "beWhy", 27, "韩国"));
        list.add(new Student("1001", "郭德纲", 50, "中国"));

        BufferedWriter bw = new BufferedWriter(new FileWriter("./day06/data/5.txt", true));

        for (Student student : list) {
            bw.write(student.toString());
            bw.newLine();
        }

        bw.close();


    }


}
