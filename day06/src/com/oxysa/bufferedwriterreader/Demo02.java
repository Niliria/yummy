package com.oxysa.bufferedwriterreader;

import java.io.*;

/**
 * @author Yummy
 * @mail 873387751@qq.com
 * @date 2020-3-20 15:59
 * 案例: 复制文件.
 * 代码内容: 高效字符流一次一个字符,  高效字符流一次一个字符数组.
 * 上述的两种方式只要做到 理解即可, 实际开发用的非常少.
 */
public class Demo02 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("./day06/data/1.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("./day06/data/3.txt"));

        //方式一 一次读取一个字符
        //method01(br, bw);

        //方式二 一次读取一个字符数组
        method02(br, bw);

        //方式三：一次读取一行
        // 涉及到的方法:
        // BufferedReader类中的特有方法:
        // public String readLine();   //一次读取一行, 结束标记是"换行符", 并返回读取到的内容(不包括换行符), 读不到返回null
        // BufferedWriter类中的特有方法:
        // public void newLine();      //根据当前操作系统给出对应的换行符. windows(\r\n), linux(\n), mac(\r>
        method03(br, bw);


    }

    public static void method03(BufferedReader br, BufferedWriter bw) throws IOException {
        String line = null;
        while ((br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
        }
        br.close();
        bw.close();
    }

    public static void method02(BufferedReader br, BufferedWriter bw) throws IOException {
        int len = 0;
        char[] chs = new char[1024];
        while ((len = br.read(chs)) != -1) {
            bw.write(chs, 0, len);
        }
        System.out.println("拷贝完成");
        br.close();
        bw.close();
    }

    public static void method01(BufferedReader br, BufferedWriter bw) throws IOException {
        int len = 0;
        while ((len = br.read()) != -1) {
            bw.write(len);
        }
        System.out.println("拷贝完成！！");
        br.close();
        bw.close();
    }
}
