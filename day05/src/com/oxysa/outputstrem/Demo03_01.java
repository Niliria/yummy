package com.oxysa.outputstrem;

import com.oxysa.streamtool.Tool;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Yummy
 * @mail 873387751@qq.com
 * @date 2020-3-16 20:14
 * 1. 创建FileOutputStream对象, 关联指定的目的地文件.
 * 2. 往文件中写入10次hello, 每个hello占一行.
 * 3. 往文件中追加一句话: 键盘敲烂, 月薪过万!
 */
public class Demo03_01 {
    public static void main(String[] args) throws IOException {
        //创建FileOutStream对象，关联指定的目的地文件
        FileOutputStream fos = new FileOutputStream(new File("./day05/data/2.txt"), true);

        //在文件中写入10次hello,每个hello占一行
        for (int i = 0; i < 10; i++) {
            fos.write("\r\n".getBytes());
            fos.write("hello".getBytes());
        }
        fos.write("\r\n".getBytes());
        fos.write("键盘敲烂，月薪过万".getBytes());

        //释放资源
        Tool.outClose(fos);

        System.out.println("打印成共！！！");


    }
}
