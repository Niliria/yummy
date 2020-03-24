package com.oxysa.outputstrem;

import com.oxysa.streamtool.Tool;

import java.io.File;
import java.io.FileOutputStream;

/**
 * @author Yummy
 * @mail 873387751@qq.com
 * @date 2020-3-16 20:27
 * 案例：FileOutStream加入异常案例
 */
public class Demo04 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            //制造异常
            //System.out.println(1 / 0);
            //1创建FileOutStream对象 关联数据源文件
            fos = new FileOutputStream(new File("./day05/data/2.txt"), true);
            fos.write("hello".getBytes());
            System.out.println("写入成功");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Tool.outClose(fos);
            System.out.println("会执行嘛？？");
        }


    }
}
