package com.oxysa.bytebufferred;

import java.io.*;

/**
 * @author Yummy
 * @mail 873387751@qq.com
 * @date 2020-3-17 20:44
 * 案例: 测试四种拷贝(视频)文件的效率
 */
public class Demo02 {

    public static void main(String[] args) throws Exception {
        //获取当前时间的毫秒值
        long startTime = System.currentTimeMillis();
        //方式一：普通字节流一个字节的读写
        method01();
        //方式二：通过普通字节流一次读取一个数组
        method02();

        //方式三：使用字节缓冲流一次读取一个字节
        method03();

        //方式四：使用字节缓冲流一次读取一个数组
        method04();


        //程序结束毫秒值
        long endStart = System.currentTimeMillis();
        System.out.println("总计用时毫秒：" + (endStart - startTime));


    }

    //方式四：使用字节缓冲流一次读取一个数组
    private static void method04() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\ceshi\\abc.avi"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\ceshi\\output\\c1.avi"));
        int len = 0;
        byte[] bys = new byte[1024];
        while ((len = bis.read(bys)) != -1) {
            bos.write(bys, 0, len);

        }
        bis.close();
        bos.close();
    }

    //方式三：使用字节缓冲流一次读取一个字节
    private static void method03() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\ceshi\\abc.avi"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\ceshi\\output\\c1.avi"));
        int len = 0;
        while ((len = bis.read()) != -1) {
            bos.write(len);
        }
        System.out.println("复制完成");
        bis.close();
        bos.close();
    }

    //方式二：通过普通字节流一次读取一个数组
    private static void method02() throws IOException {
        FileInputStream fis = new FileInputStream("D:\\ceshi\\abc.avi");
        FileOutputStream fos = new FileOutputStream("D:\\ceshi\\output\\c1.avi");
        int len = 0;
        byte[] bys = new byte[1024];
        while ((len = fis.read(bys)) != -1) {
            fos.write(bys, 0, len);
        }
        System.out.println("复制完毕！！！");
        fis.close();
        fos.close();
    }

    //方式一：普通字节流一个字节的读写
    private static void method01() throws IOException {
        FileInputStream fis = new FileInputStream("D:\\ceshi\\abc.avi");
        FileOutputStream fos = new FileOutputStream("D:\\ceshi\\output\\c1.avi");
        int len = 0;
        while ((len = fis.read()) != -1) {
            fos.write(len);
        }
        System.out.println("拷贝完成！！1");
        fis.close();
        fos.close();
    }
}
