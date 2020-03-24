package com.oxysa.codec;

import java.io.FileInputStream;

/**
 * @author Yummy
 * @mail 873387751@qq.com
 * @date 2020-3-18 19:31
 * 字节流读中文
 * 1，不管是英文字母大写小写 特殊符号 在任何码表中都是占用一个字节
 * 2，中文在GBK码表中占用两个字节  UTF-8中占用3个字节  但是不管在什么码表中 中文的第一个字节都是负数
 * 3，字符流 = 字节流+编码表
 */
public class Demo01 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("./day06/data/1.txt");
        int len = 0;
        while ((len = fis.read()) != -1) {
            System.out.print((byte) len + " ");
        }
        fis.close();

    }
}
