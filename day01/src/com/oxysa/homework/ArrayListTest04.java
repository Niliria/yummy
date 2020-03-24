package com.oxysa.homework;
/*第四题: 通过代码, 完成如下需求:
        1. 自定义一个学生类，给出成员变量name和age.
        2. 定义ArrayList集合, 用来存储学生对象.
        3. 键盘录入3个学生的信息, 将他们封装成学生对象后, 添加到ArrayList集合中.
        4. 判断集合中是否有姓名叫 刘亦菲 的学生, 如果有, 就往集合中添加学生对象: 糖糖, 18
        5. 遍历集合. 	//用任意一种方式遍历即可.*/

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class ArrayListTest04 {
    public static void main(String[] args) {
        ArrayList<Student> list = addStudent();
        ListIterator<Student> iterator = list.listIterator();
        while (iterator.hasNext()){
            Student stu = iterator.next();
            if ("刘亦菲".equals(stu.getName())){
                Student addStu = new Student("糖糖", 18);
                iterator.add(addStu);
            }
        }

        System.out.println(list);
    }

    //添加学生信息
    public static ArrayList<Student> addStudent() {
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        //创建一个集合对象 存储多个学生信息
        ArrayList<Student> list = new ArrayList<>();
        for (int i = 1;i<= 3;i++){
            System.out.println("请输入第"+ i +"个学生信息");
            //输入姓名
            System.out.println("请输入学生姓名：");
            String name = sc.next();
            //输入姓年龄
            System.out.println("请输入学生年龄：");
            int age = sc.nextInt();
            Student stu = new Student(name,age);
            list.add(stu);
        }
        System.out.println("添加学生成功");
        //添加到集合
        return list;

    }

}
