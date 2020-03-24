package com.oxysa.transformation;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * @author Yummy
 * @mail 873387751@qq.com
 * @date 2020-3-20 15:41
 * 案例: 把data文件夹下的1.txt(UTF-8码表)文件内容 复制到 2.txt(GBK码表)文件中.
 */
public class Demo03 {
    public static void main(String[] args) throws Exception {

        //方式一 一次读取一个字符
        //method01();

        //方式二 一次读取一个字符数组
        //创建字符转换输入流，关联源文件
        method02();

    }

    public static void method02() throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("./day06/data/1.txt"), StandardCharsets.UTF_8);
        //创建字符转换输出流，关联源文件
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("./day06/data/2.txt"), "GBK");
        //定义变量
        int len = 0;
        char[] chs = new char[1024];
        while ((len = isr.read(chs)) != -1) {
            osw.write(chs, 0, len);
        }
        System.out.println("拷贝完成！！");
        isr.close();
        osw.close();
    }

    public static void method01() throws IOException {
        //创建字符转换输入流，关联源文件
        InputStreamReader isr = new InputStreamReader(new FileInputStream("./day06/data/1.txt"), StandardCharsets.UTF_8);
        //创建字符转换输出流，关联源文件
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("./day06/data/2.txt"), "GBK");
        //定义变量
        int len = 0;
        while ((len = isr.read()) != -1) {
            osw.write(len);
        }
        System.out.println("拷贝完成");
        isr.close();
        osw.close();
    }


}
