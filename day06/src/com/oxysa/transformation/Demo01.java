package com.oxysa.transformation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @author Yummy
 * @mail 873387751@qq.com
 * @date 2020-3-18 22:44
 * 转换流入门
 * OutputStreamWriter: 字符流 通向 字节流的桥梁.
 * 构造方法:
 * public OutputStreamWriter(OutputStream os)                      //创建转换输出流对象, 采用默认码表(utf-8)往文件中写数据.
 * public OutputStreamWriter(OutputStream os, String charsetName)  //创建转换输出流对象, 采用指定码表往文件中写数据.
 * <p>
 * InputStreamReader:  字节流 通向 字符流的桥梁.
 * 构造方法:
 * public InputStreamReader(InputStream is)                      //创建转换输入流对象, 采用默认码表(utf-8)从文件中读数据.
 * public InputStreamReader(InputStream is, String charsetName)  //创建转换输入流对象, 采用指定码表从文件中读数据.
 */
public class Demo01 {
    public static void main(String[] args) throws Exception {
        //核心思想 字符流=字节流 + 编码表
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("./day06/data/2.txt"), "GBK");

        //演示 向文件中一次写入一个字符
        // osw.write('中');
        // osw.write('国');
        // osw.write('加');
        // osw.write('油');

        //演示 向文件中一次写入一个字符串
        String s = "我爱中国";
        osw.write(s);


        //演示 字符流从文件中一次读取一个字符
        InputStreamReader isr = new InputStreamReader(new FileInputStream("./day06/data/1.txt"));
        // int len = 0;
        // while ((len = isr.read()) != -1) {
        //     System.out.println((char) len);
        // }

        //演示 字符流从文件中一次读取一个字节数组
        int len1 = 0;
        char[] chs = new char[3];
        while ((len1 = isr.read(chs)) != -1) {
            osw.write(chs, 0, len1);
        }
        isr.close();
        osw.close();


    }
}
