package com.oxysa.bufferedwriterreader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author Yummy
 * @mail 873387751@qq.com
 * @date 2020-3-20 14:18
 * 字符缓冲流
 */
public class Demo01 {
    public static void main(String[] args) throws Exception {
        //字符缓冲输出流往文件中写入一句话
        BufferedWriter bw = new BufferedWriter(new FileWriter("./day06/data/1.txt", true));
        bw.write("你们是我永远的爱");

        //字符缓冲输入流读取文件中的内容
        BufferedReader br = new BufferedReader(new FileReader("./day06/data/1.txt"));


        //方式一 一次写入一个字符数组
     /*
        int len = 0;
        char[] chs = new char[5];
        while ((len = br.read(chs)) != -1) {
            System.out.print(new String(chs,0,len));
        }*/

        System.out.println("================");

        //方式二 一次读取一个字符
        int len = 0;
        while ((len = br.read()) != -1) {
            bw.write(len);
        }


        //方式三 一次读写一行
        String line = null;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
        bw.close();
    }
}
