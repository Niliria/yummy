package com.oxysa.inputstream;

import com.oxysa.streamtool.Tool;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author Yummy
 * @mail 873387751@qq.com
 * @date 2020-3-16 20:48
 * InputStream: 字节输入流的底层抽象类, 因为是抽象类, 所以不能直接创建对象.
 * 它的常用的两个子类主要是:
 * FileInputStream:  普通的字节输入流
 * BufferedInputStream: 高效的字节输入流.
 * FileInputStream:
 * 概述:
 * 表示普通的字节输入流, 它是一个具体的类.
 * 构造方法:
 * public FileInputStream(String path);    创建字节输入流对象, 关联数据源文件(字符串形式)
 * public FileInputStream(File path);      创建字节输入流对象, 关联数据源文件(File对象形式)
 * 成员方法:
 * public int read();                      从数据源文件中读取数据, 一次读取一个字节. 并返回该字节的ASCII码值, 读不到返回-1.
 * public void close();                    关闭流, 释放资源.
 */
public class Demo01 {
    public static void main(String[] args) {
        //1,创建字节流输入流对象 ，关联目的文件
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("./day05/data/1.txt");

            //方式一：一次读取一个字节
            /*int by1 = fis.read();
            System.out.println("by1:" + (char) by1);
            System.out.println("by2:" + (char)fis.read());
            System.out.println("by3:" + (char)fis.read());
            System.out.println("by4:" + (char)fis.read());*/

            //方式二：采用循环的方式，不知道循环多少次，所以不使用for,使用while
            //2.1定义一个变量记录读取的内容
          /*  int len = 0;
            //2.2循环读取，只要内容不为-1，就一直读取
            while (len != -1){
                //2.3将读取到的内容赋值给变量
                len = fis.read();
                System.out.print((char) len);
            }*/

            //方式三：优化版本
            int len = 0;
/*
            (len = fis.read()) != -1 这行代码做了3件事儿:
            1. 执行 fis.read(),                   从数据源文件中 读取一个字节.
            2. 执行 len = fis.read()              将从数据源文件中读取到的字节, 赋值给变量.
            3. 执行 (len = fis.read()) != -1      判断读取到的内容是否是-1, 如果是说明文件中内容读完了, 程序结束
            否则说明文件中还有数据, 程序接着读.*/
            while ((len = fis.read()) != -1) {
                System.out.println((char) len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            Tool.inClose(fis);
        }

    }
}
