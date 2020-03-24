package com.oxysa.hashcode;

import com.oxysa.hashset.Student;

/**
 * @author Yummy
 * @date 2020-3-14 12:41
 */
public class HashCodeDemo01 {
    public static void main(String[] args) {
        /**
         * 需求:
         *
         * 1. 定义学生类, 属性为姓名和年龄.
         * 2. 在测试类的main方法中, 创建两个学生对象, 分别获取它们的哈希值, 并打印.
         * 3. 测试: 重写Object#hashcode()方法, 实现不同对象的哈希值也是相同的.
         * 4. 测试: 同一对象哈希值肯定相同, 不同对象哈希值一般不同.
         */
        //1,创建学生对象
        //哈希值：1163157884
        // Student s1 = new Student("水原希子", 30);
        //哈希值：1956725890
        // Student s2 = new Student("小松菜奈", 24);


        //3重写hashCode()方法测试，实现不同对象的哈希值也是相同的.
        //哈希值：1112213757
        Student s1 = new Student("小松菜奈", 24);
        //哈希值：1112213757
        Student s2 = new Student("小松菜奈", 24);

        //2，获取哈希值并打印
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
