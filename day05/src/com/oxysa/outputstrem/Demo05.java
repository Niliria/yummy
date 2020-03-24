package com.oxysa.outputstrem;

import com.oxysa.streamtool.Tool;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Yummy
 * @mail 873387751@qq.com
 * @date 2020-3-16 20:39
 * 案例：在指定的路径下(例如: d:/abc)创建一个大小为1G的空文件.
 */
public class Demo05 {
    public static void main(String[] args) {
        //1,创建字节输出流对象 关联目的地源文件
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("d:/abc.avi");
            //定义字节数组
            byte[] bys = new byte[1024];
            //3,通过循环实现写入数据
            for (int i = 0; i < 1024 * 100; i++) {
                fos.write(bys);
            }
            System.out.println("写入完成！！！1");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            Tool.outClose(fos);
        }
    }
}
