package com.oxysa.outputstrem;

import com.oxysa.streamtool.Tool;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Yummy
 * @mail 873387751@qq.com
 * @date 2020-3-16 20:03
 * 案例：演示如何换行以及追加数据
 * FileOutputStream类的构造方法:
 * public FileOutputStream(String path);                   创建字节输出流对象, 关联目的地文件(字符串形式)
 * public FileOutputStream(String path, boolean append);   创建字节输出流对象, 关联目的地文件(字符串形式)
 * 如果传入true, 表示往文件中追加数据.
 * <p>
 * public FileOutputStream(File path);                     创建字节输出流对象, 关联目的地文件(File对象形式)
 * public FileOutputStream(File path, boolean append);     创建字节输出流对象, 关联目的地文件(File对象形式)
 * 如果传入true, 表示往文件中追加数据.
 * <p>
 * FileOutputStream类的成员方法:
 * public void write(int by);                          往目的地文件中写入: 一个字节.
 * public void write(byte[] bys);                      往目的地文件中写入: 一个字节数组.
 * public void write(byte[] bys, int start, int len);  往目的地文件中写入: 一个字节数组的 一部分.
 * public void close();                                关闭流, 释放资源.
 * <p>
 * 结论:
 * 1. 不同的操作系统, 换行符不一样.
 * \r\n    window操作系统
 * \n      linux操作系统
 * \r      mac操作系统.
 */
public class Demo03 {
    public static void main(String[] args) throws IOException {
        //1创建字节流输出对象 关联数据源
        //1.1注意创建字节输出流对象, 关联目的地文件(字符串形式)如果传入true, 表示往文件中追加数据.
        FileOutputStream fos = new FileOutputStream(new File("./day05/data/2.txt"), true);

        //2,对目标文件中写入数据
        byte[] bys = {65, 66, 67, 68, 69};

        //2.1 写入换行符  String#getBytes()可以把字符串形式转化成对应的数组形式
        fos.write("\r\n".getBytes());
        fos.write(bys, 0, 4);

        //关闭流
        Tool.outClose(fos);
        System.out.println("写入成功！");

    }
}
