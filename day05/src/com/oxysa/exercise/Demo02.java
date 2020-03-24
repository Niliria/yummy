package com.oxysa.exercise;

import com.oxysa.streamtool.Tool;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author Yummy
 * @mail 873387751@qq.com
 * @date 2020-3-16 23:08
 * 案例一: 普通的字节流赋值图片.
 */
public class Demo02 {
    public static void main(String[] args) {

        FileInputStream fis = null;
        FileOutputStream fos = null;

        //方式一：一次读取一个字节
        method01(fis, fos);
        //方式二：一次读取一个字节数组
        method02(fis, fos);


    }

    private static void method02(FileInputStream fis, FileOutputStream fos) {
        try {
            fis = new FileInputStream("D:\\asdf.png");
            fos = new FileOutputStream("./day05/data/qqq.png");

            int len = 0;
            byte[] bys = new byte[5];
            while ((len = fis.read(bys)) != -1) {
                fos.write(bys, 0, len);
            }
            System.out.println("okk--------------");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Tool.myClose(fis, fos);
        }
    }

    private static void method01(FileInputStream fis, FileOutputStream fos) {
        try {
            fis = new FileInputStream("D:\\asdf.png");
            fos = new FileOutputStream("./day05/data/qqq.png");

            int len = 0;
            while ((len = fis.read()) != -1) {
                fos.write(len);
            }
            System.out.println("okkkkkkkkkk");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Tool.myClose(fis, fos);
        }
    }
}
