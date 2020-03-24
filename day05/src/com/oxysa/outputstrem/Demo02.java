package com.oxysa.outputstrem;

import com.oxysa.streamtool.Tool;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Yummy
 * @mail 873387751@qq.com
 * @date 2020-3-16 19:45
 * <p>
 * 案例: FileOutputStream: 字节输出流, 三种写数据的方式.
 * <p>
 * FileOutputStream类的构造方法:
 * public FileOutputStream(String path);   创建字节输出流对象, 关联目的地文件(字符串形式)
 * public FileOutputStream(File path);     创建字节输出流对象, 关联目的地文件(File对象形式)
 * <p>
 * FileOutputStream类的成员方法:
 * public void write(int by);                          往目的地文件中写入: 一个字节.
 * public void write(byte[] bys);                      往目的地文件中写入: 一个字节数组.
 * public void write(byte[] bys, int start, int len);  往目的地文件中写入: 一个字节数组的 一部分.
 * public void close();                                关闭流, 释放资源.
 */
public class Demo02 {
    public static void main(String[] args) throws IOException {
        //1,创建字节流输出对象，关联目的文件
        //1.1目的文件不存在就创建，如果存在就覆盖
        FileOutputStream fos = new FileOutputStream(new File("./day05/data/2.txt"));

        //2,往目的文件中写入数据
        //2.1测试write(int by);往目的地文件中写入: 一个字节.
        //fos.write(97);

        //2.2测试write(byte[] bys);往目的地文件中写入: 一个字节数组.
        //byte[] bys = {65, 66, 67, 68, 69};
       // fos.write(bys);

        //测试write(byte[] bys, int start, int len);  往目的地文件中写入: 一个字节数组的 一部分.
        byte[] bys2 = {65, 66, 67, 68, 69};
        fos.write(bys2,0,3);

        //释放资源
        Tool.outClose(fos);

    }
}
