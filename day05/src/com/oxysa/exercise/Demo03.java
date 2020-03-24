package com.oxysa.exercise;

import com.oxysa.streamtool.Tool;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author Yummy
 * @mail 873387751@qq.com
 * @date 2020-3-17 0:32
 * 案列三：图片加密
 * 核心原理: 一个数字被同一个数字位异或两次, 该数字值不变.
 * 例如:  10 ^ 20 ^ 20 = 10
 * 例如: 5 ^ 10 ^ 5 = 10
 */
public class Demo03 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;


        try {
            fis = new FileInputStream("./day05/data/123.png");
            fos = new FileOutputStream("./day05/data/234.png");
            int len = 0;
            while ((len = fis.read()) != -1) {
                fos.write(len ^ 9);
            }
            System.out.println("加密完成。。。。");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Tool.myClose(fis, fos);
        }

    }
}
