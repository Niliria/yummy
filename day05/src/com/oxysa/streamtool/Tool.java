package com.oxysa.streamtool;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author Yummy
 * @mail 873387751@qq.com
 * @date 2020-3-16 21:48
 */
public class Tool {

    public static void outClose(FileOutputStream fos) {

        try {
            if (fos != null) {
                fos.close();
                fos = null;
            }
            System.out.println("释放资源");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public static void inClose(FileInputStream fis) {

        try {
            if (fis != null) {
                fis.close();
                fis = null;
            }
            System.out.println("释放资源！！！！");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


    public static void myClose(FileInputStream fis,FileOutputStream fos) {
        try {
            if (fis != null && fos != null) {
                fis.close();
                fos.close();
                fis = null;
                fos = null;
            }
            System.out.println("释放资源！！！！");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

