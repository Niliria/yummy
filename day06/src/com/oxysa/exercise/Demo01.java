package com.oxysa.exercise;

import java.io.*;

/**
 * @author Yummy
 * @mail 873387751@qq.com
 * @date 2020-3-20 14:42
 * 案例一: 转换流拷贝文本文件.
 * 记忆: 转换流其实是 字符流.
 */
public class Demo01 {
    public static void main(String[] args) throws Exception {
        //需求: 把data/1.txt  -> 2.txt中.
        //01-普通字节流一次读写一个字节
        // method01();

        //02-普通字节流一次读写一个字节数组
        //method02();

        //03-高效的字节输入输出流一次读取一个字节
        // method03();

        //04-高效的字节输入输出流一次读取一个字节数组
        // method04();

        //05-转换流一次读写一个字符
        // method05();

        //06-转换流一次读写一个字符数组
        method06();
    }

    private static void method06() throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("./day06/data/1.txt"));
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("./day06/data/3.txt"));
        int len = 0;
        char[] chs = new char[128];
        while ((len = isr.read(chs)) != -1) {
            osw.write(chs, 0, len);
        }
        System.out.println("拷贝完成");
        isr.close();
        osw.close();
    }

    private static void method05() throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("./day06/data/1.txt"));
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("./day06/data/3.txt"));
        int len = 0;
        while ((len = isr.read()) != -1) {
            osw.write(len);
        }
        System.out.println("拷贝完成");
        isr.close();
        osw.close();
    }

    private static void method04() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("./day06/data/1.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("./day06/data/3.txt"));
        int len = 0;
        byte[] bys = new byte[128];
        while ((len = bis.read(bys)) != -1) {
            bos.write(bys, 0, len);
        }
        System.out.println("拷贝完成");
        bis.close();
        bos.close();
    }

    private static void method03() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("./day06/data/1.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("./day06/data/3.txt"));
        int len = 0;
        while ((len = bis.read()) != -1) {
            bos.write(len);
        }
        System.out.println("拷贝完成");
        bis.close();
        bos.close();
    }

    private static void method02() throws IOException {
        FileInputStream fis = new FileInputStream("./day06/data/1.txt");
        FileOutputStream fos = new FileOutputStream("./day06/data/3.txt");
        int len = 0;
        byte[] bys = new byte[3];
        while ((len = fis.read(bys)) != -1) {
            fos.write(bys, 0, len);
        }
        System.out.println("拷贝完成！！");
        fis.close();
        fos.close();
    }

    //普通字节流一次读写一个字节
    private static void method01() throws IOException {
        FileInputStream fis = new FileInputStream("./day06/data/1.txt");
        FileOutputStream fos = new FileOutputStream("./day06/data/3.txt");
        int len = 0;
        while ((len = fis.read()) != -1) {
            fos.write(len);
        }
        System.out.println("拷贝完成");
        fis.close();
        fos.close();
    }
}
