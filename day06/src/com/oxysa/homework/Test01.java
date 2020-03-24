package com.oxysa.homework;

import java.io.*;

/**
 * @author Yummy
 * @mail 873387751@qq.com
 * @date 2020-3-20 17:10
 * 1. 复制图片, 或者视频.		//要求, 用4种方法实现.
 * 1. 普通的字节流一次读写一个字节.
 * 2. 普通的字节流一次读写一个字节数组.
 * <p>
 * 3. 高效的字节流一次读写一个字节.				//必须掌握.
 * 4. 高效的字节流一次读写一个字节数组.
 */
public class Test01 {

    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("./day06/data/a.png");
        FileOutputStream fos = new FileOutputStream("./day06/data/b.png");
        //方式一：普通字节流一次读写一个字节
        method01(fis, fos);

        //方式二：普通字节流一次读取一个数组
        method02(fis, fos);

        //高效字节流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("./day06/data/a.png"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("./day06/data/b.png"));

        //方式一：一次读取一个字节
        method03(bis, bos);


        //方式二：一次读取一个字节数组
        method04(bis, bos);


    }

    public static void method04(BufferedInputStream bis, BufferedOutputStream bos) throws IOException {
        int len = 0;
        byte[] bys = new byte[1024];
        while ((len = bis.read(bys)) != -1) {
            bos.write(bys, 0, len);
        }
        System.out.println("拷贝完成");
        bis.close();
        bos.close();
    }

    public static void method03(BufferedInputStream bis, BufferedOutputStream bos) throws IOException {
        int len = 0;
        while ((len = bis.read()) != -1) {
            bos.write(len);
        }
        System.out.println("拷贝完成！！");
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
