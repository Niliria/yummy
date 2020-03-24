package com.oxysa.inputstream;

import com.oxysa.streamtool.Tool;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author Yummy
 * @mail 873387751@qq.com
 * @date 2020-3-16 21:19
 * 案例二: 一次读取一个字节数组
 * <p>
 * <p>
 * FileInputStream:
 * 概述:
 * 表示普通的字节输入流, 它是一个具体的类.
 * 成员方法:
 * public int read();             从数据源文件中读取数据, 一次读取一个字节. 并返回该字节的ASCII码值, 读不到返回-1.
 * public int read(byte[] bys)    从数据源文件中读取数据, 一次读取一个字节数组. 并将读取到的内容存储到字节数组中,
 * 然后返回 读取到的有效字节数, 读不到返回-1.
 */
public class Demo02 {
    public static void main(String[] args) {
        //创建字节输入流对象，关联目的文件
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("./day05/data/1.txt");
            //方式一：普通版
           /* //2,创建字节数组
            byte[] bys = new byte[3];
            //第一次读取 一次读取三个字节
            int len1 = fis.read(bys);
            System.out.println("len1 :" + len1);
            System.out.println(Arrays.toString(bys));

            //第二次读取
            int len2 = fis.read(bys);
            System.out.println("len2 :" + len2);
            System.out.println(Arrays.toString(bys));

            //第三次读取
            int len3 = fis.read(bys);
            System.out.println("len3 :" + len3);
            System.out.println(Arrays.toString(bys));
*/
            byte[] bys = new byte[3];
            //定义变量，记录读取到的有效字节数
            int len = 0;
            //循环读取, 只要条件满足, 就一直读, 并将读取到的有效字节数赋值给变量.
            while ((len = fis.read(bys)) != -1) {
                String s = new String(bys, 0, len);
                System.out.println(s);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            Tool.inClose(fis);
            System.out.println("释放资源");
        }

    }
}
