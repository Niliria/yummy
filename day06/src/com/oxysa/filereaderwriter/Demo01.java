package com.oxysa.filereaderwriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Yummy
 * @mail 873387751@qq.com
 * @date 2020-3-20 15:32
 * 普通字符流
 */
public class Demo01 {
    public static void main(String[] args) throws Exception {
        //方式一普通字符流一次读写一个字符
        method01();

        //方式二普通字符流一次读取一个字符数组
        method02();
    }

    public static void method02() throws IOException {
        FileReader fr = new FileReader("./day06/data/1.txt");
        FileWriter fw = new FileWriter("./day06/data/4.txt");
        int len = 0;
        char[] chs = new char[128];
        while ((len = fr.read(chs)) != -1){
            fw.write(chs,0,len);
        }
        System.out.println("拷贝完成");
        fr.close();
        fw.close();
    }

    public static void method01() throws IOException {
        FileReader fr = new FileReader("./day06/data/1.txt");
        FileWriter fw = new FileWriter("./day06/data/4.txt");
        int len =0;
        while ((len = fr.read()) != -1){
            fw.write(len);
        }
        System.out.println("拷贝完成");
        fr.close();
        fw.close();
    }
}
