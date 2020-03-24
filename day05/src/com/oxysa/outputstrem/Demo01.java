package com.oxysa.outputstrem;


import com.oxysa.streamtool.Tool;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Yummy
 * @mail 873387751@qq.com
 * @date 2020-3-16 19:28
 * //案例: FileOutputStream入门
 * /*
 *     OutputStream是一个抽象类, 表示所有 字节输出流的父类.
 *     我们常用的是它的两个子类: FileOutputStream, BufferedOutputStream.
 *
 *     FileOutputStream类中的构造方法:
 *         public FileOutputStream(String path)
 *
 *    FileOutputStream类的成员方法:
 *         public void write(int ch)   //一次写入一个字节.
 *         public void close();        //关闭流对象, 节约资源, 提高效率.
 *
 */
public class Demo01 {
    public static void main(String[] args) throws IOException {
        //需求: 往day05模块下的data文件夹中, 新建一个文件, 并往里边写数据.
        //1. 创建字节输出流对象, 关联目的地文件.
        //相对路径, 一般是相对于当前项目来讲的.
        //如果目的地文件不存在, 程序会自动创建.
        FileOutputStream fos = new FileOutputStream(new File("./day05/data/1.txt"));
        //2往文件中写入一些指定的内容
        fos.write(97);
        fos.write(98);
        fos.write(99);
        //3关闭资源流资源
        Tool.outClose(fos);
        System.out.println("写入完成！！");

    }
}
