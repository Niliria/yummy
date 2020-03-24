package com.oxysa.bytebufferred;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

/**
 * @author Yummy
 * @mail 873387751@qq.com
 * @date 2020-3-17 20:12
 * 案例：字节高效流 缓冲字节流 入门
 */
public class Demo01 {
    public static void main(String[] args) throws Exception {
        //1. 通过字节缓冲输出流往文件中写一句话.
        //测试: public BufferedOutputStream(OutputStream os) 构造方法
        //创建普通字节输出流
        // FileOutputStream fos = new FileOutputStream("./day06/data/1.txt");
        // //创建高效字节输出流
        // BufferedOutputStream bos = new BufferedOutputStream(fos);
        // //往文件中写入数据
        // bos.write(97);
        // bos.write(98);
        // bos.write(99);
        // //刷新，即把缓冲区的数据刷新到文件中
        // // bos.flush();
        // // bos.close();
        // //bos = null;
        // bos.write(100);
        // bos.write(101);
        // bos.write(102);
        // // bos.flush();
        // bos.close();


        // //合并版本写法
        // BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("./day06/data/1.txt"));
        // //一次写入一个数组
        // byte[] bys = {97, 98, 99, 100, 101, 102};
        // bos.write(bys);
        // bos.flush();
        // bos.close();


        //2,1通过字节缓冲输入流读取数据
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("./day06/data/1.txt"));
        //2.1 一次读取一个字节
        // int len = 0;
        // while ((len = bis.read()) != -1) {
        //     System.out.println((char)len);
        // }

        //2.2 一次读取一个数据
        int len = 0;
        byte[] bys1 = new byte[3];
        while ((len = bis.read(bys1))!= -1){
            System.out.print(new String(bys1,0,len));
        }

    }
}
