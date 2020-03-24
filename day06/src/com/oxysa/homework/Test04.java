package com.oxysa.homework;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author Yummy
 * @mail 873387751@qq.com
 * @date 2020-3-20 18:04
 * 4. 已知项目下有个a.txt文件，里边存的有5个学员的信息（格式：姓名，语文成绩，数学成绩，英语成绩）
 * 示例：
 * 张三，37,90,100
 * 李四，90,73,81
 * 王五，60,90,76
 * 赵六，89,21,72
 * 田七，100,100,100
 * <p>
 * 需求：
 * 创建输入流对象，读取文本文件中的信息，然后按照总分从高到低的顺序，将排序后的学生信息写入到项目下的b.txt文本文件中。
 * 格式如下：
 * 田七，100,100,100
 * 李四，90,73,81
 * 张三，37,90,100
 * 王五，60,90,76
 * 赵六，89,21,72
 */
public class Test04 {
    public static void main(String[] args) throws Exception {
        ArrayList<Student> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("./day06/data/a.txt"));
        String line = null;
        while ((line = br.readLine()) != null) {
            String[] arr = line.split(",");
            list.add(new Student(arr[0],
                    Integer.parseInt(arr[1]),
                    Integer.parseInt(arr[2]),
                    Integer.parseInt(arr[3])));
        }
        br.close();
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num = (o2.getChinese() + o2.getMath() + o2.getEnglish()) -
                        (o1.getChinese() + o1.getMath() + o1.getEnglish());

                return num;
            }
        });
        BufferedWriter bw = new BufferedWriter(new FileWriter("./day06/data/b.txt"));

        for (Student student : list) {
            String s = student.toString();
            bw.write(s);
            bw.newLine();
        }
        bw.close();

    }
}
