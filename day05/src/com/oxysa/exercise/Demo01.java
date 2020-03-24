package com.oxysa.exercise;

import com.oxysa.streamtool.Tool;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author Yummy
 * @mail 873387751@qq.com
 * @date 2020-3-16 22:56
 * 案例一: 普通的字节流赋值文本文件.
 * <p>
 * IO流的核心步骤:
 * 1. 创建输入流, 关联数据源文件.
 * 2. 创建输出流, 关联目的地文件.
 * 3. 定义变量, 记录读取到的字节内容(或者有效字节数).
 * 4. 只要条件满足, 就一直读, 并将读取到的数据, 赋值给变量.
 * 5. 将读取到的数据写入到指定的目的地文件中.
 * 6. 释放资源.
 */
public class Demo01 {
    public static void main(String[] args) {


        FileInputStream fis = null;
        FileOutputStream fos = null;
        //方式一:一次读写一个字节
        //method01(fis, fos);


        //方式二：一次读取一个数组
        method02(fis, fos);


    }

    private static void method02(FileInputStream fis, FileOutputStream fos) {
        try {
            fis = new FileInputStream("./day05/data/1.txt");
            fos = new FileOutputStream("./day05/data/2.txt");
            //定义一个变量 记录读取到的有效内容
            int len = 0;
            //定义一个字节数组
            byte[] bys = new byte[5];
            //只要条件满足就一直读
            while ((len = fis.read(bys)) != -1) {
                fos.write(bys, 0, len);
            }
            System.out.println("复制完毕！！");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Tool.myClose(fis, fos);
        }
    }

    private static void method01(FileInputStream fis, FileOutputStream fos) {
        try {
            //创建字节输入流，关联数据源
            fis = new FileInputStream("./day05/data/1.txt");
            //创建字节输出流，关联数据源
            fos = new FileOutputStream("./day05/data/2.txt");
            //定义一个变量记录记录读取到的有效字节内容
            int len = 0;
            //只要条件满足就一直读，并将读取到的值赋值给变量
            while ((len = fis.read()) != -1) {
                fos.write(len);
            }
            System.out.println("读写完成！！！");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Tool.myClose(fis, fos);
        }
    }
}
