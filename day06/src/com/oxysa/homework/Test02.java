package com.oxysa.homework;

import java.io.*;

/**
 * @author Yummy
 * @mail 873387751@qq.com
 * @date 2020-3-20 17:24
 * 2. 复制文本文件.			//要求, 用11种方式实现.
 * 1. 普通的字节流一次读写一个字节.
 * 2. 普通的字节流一次读写一个字节数组.
 * <p>
 * 3. 高效的字节流一次读写一个字节.
 * 4. 高效的字节流一次读写一个字节数组.
 * <p>
 * 5. 转换流一次读取一个字符.						//必须掌握.
 * 6. 转换流一次读取一个字符数组.
 * <p>
 * 7. 普通的字符流一次读写一个字符.
 * 8. 普通的字符流一次读写一个字符数组.
 * <p>
 * 9. 高效的字符流一次读写一个字符.
 * 10. 高效的字符流一次读写一个字符数组.
 * 11. 高效的字符流一次读写一行.
 */
public class Test02 {
    public static void main(String[] args) throws Exception {
        //普通字节流
        FileInputStream fis = new FileInputStream("./day06/data/1.txt");
        FileOutputStream fos = new FileOutputStream("./day06/data/3.txt");
        //方式一一次读取一个字节
        method01(fis, fos);
        //方式二 一次读取一个字节数组
        method02(fis, fos);


        //高效字节流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("./day06/data/1.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("./day06/data/3.txt"));
        //方式一 一次读取一个字节
        method03(bis, bos);
        //方式二 一次读取一个字节数组
        method04(bis, bos);

        //转换流'
        InputStreamReader isr = new InputStreamReader(new FileInputStream("./day06/data/1.txt"));
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("./day06/data/3.txt"));
        //方式一 一次读取一个字符
        method05(isr, osw);
        //方式二 一次读取一个字符数组
        method06(isr, osw);

        //普通的字符流
        FileReader fr = new FileReader("./day06/data/1.txt");
        FileWriter fw = new FileWriter("./day06/data/3.txt");
        //方式一 一次读取一个字符
        method07(fr, fw);
        //方式二 一次读取一个字符数组
        method08(fr, fw);

        //高效字符流
        BufferedReader br = new BufferedReader(new FileReader("./day06/data/1.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("./day06/data/3,txt"));
        //方式一 一次读取一个字符
        method09(br, bw);
        //方式二  一次读取一个字符数组
        method10(br, bw);
        //方式三一次读取一行
        String line =null;
        while ((line = br.readLine()) != null){
            bw.write(line);
            bw.newLine();
        }
        System.out.println("拷贝完成");
        br.close();
        bw.close();


    }

    public static void method10(BufferedReader br, BufferedWriter bw) throws IOException {
        int len = 0;
        char[] chs = new char[1042];
        while ((len = br.read(chs)) != -1){
            bw.write(chs,0,len);
        }
        System.out.println("拷贝完成");
        br.close();
        bw.close();
    }

    public static void method09(BufferedReader br, BufferedWriter bw) throws IOException {
        int len = 0;
        while ((len = br.read()) != -1) {
            bw.write(len);
        }
        System.out.println("拷贝完成");
        br.close();
        bw.close();
    }

    public static void method08(FileReader fr, FileWriter fw) throws IOException {
        int len = 0;
        char[] chs = new char[1024];
        while ((len = fr.read(chs)) != -1) {
            fw.write(chs, 0, len);
        }
        System.out.println("拷贝完成");
        fr.close();
        fw.close();
    }

    public static void method07(FileReader fr, FileWriter fw) throws IOException {
        int len = 0;
        while ((len = fr.read()) != -1) {
            fw.write(len);
        }
        System.out.println("拷贝完成");
        fr.close();
        fw.close();
    }

    public static void method06(InputStreamReader isr, OutputStreamWriter osw) throws IOException {
        int len = 0;
        char[] bys = new char[1024];
        while ((len = isr.read(bys)) != -1) {
            osw.write(bys, 0, len);
        }
        System.out.println();
        isr.close();
        osw.close();
    }

    public static void method05(InputStreamReader isr, OutputStreamWriter osw) throws IOException {
        int len = 0;
        while ((len = isr.read()) != -1) {
            osw.write(len);
        }
        System.out.println("拷贝完成!");
        isr.close();
        osw.close();
    }

    public static void method04(BufferedInputStream bis, BufferedOutputStream bos) throws IOException {
        int len = 0;
        byte[] bys = new byte[1024];
        while ((len = bis.read(bys)) != -1) {
            bos.write(bys, 0, len);
        }
        System.out.println("拷贝完成！！");
        bis.close();
        bos.close();
    }

    public static void method03(BufferedInputStream bis, BufferedOutputStream bos) throws IOException {
        int len = 0;
        while ((len = bis.read()) != -1) {
            bos.write(len);
        }
        System.out.println("拷贝完成");
        bis.close();
        bos.close();
    }

    public static void method02(FileInputStream fis, FileOutputStream fos) throws IOException {
        int len = 0;
        byte[] bys = new byte[1024];
        while ((len = fis.read(bys)) != -1) {
            fos.write(bys, 0, len);
        }
        System.out.println("拷贝完成");
        fis.close();
        fos.close();
    }

    public static void method01(FileInputStream fis, FileOutputStream fos) throws IOException {
        int len = 0;
        while ((len = fis.read()) != -1) {
            fos.write(len);
        }
        System.out.println("拷贝完成");
        fis.close();
        fos.close();
    }
}
