package com.oxysa.codec;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * @author Yummy
 * @mail 873387751@qq.com
 * @date 2020-3-18 19:42
 * 演示不同码表 及不同码表中文占用字节问题
 * 1，编解码用的码表必须一致否则可能会乱码
 * 2，常用的编解码GBK UTF-8
 */
public class Demo02 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        /*
          String类中的方法
            public byte[] getBytes();                   根据当前的默认码表, 将字符串转成其对应的字节数组.
            public byte[] getBytes(String charsetName); 根据指定的码表, 将字符串转成其对应的字节数组.
         */

        //测试UTF-8编码集
        String s = "你好中国";
        byte[] by1 = s.getBytes();
        byte[] by2 = s.getBytes(StandardCharsets.UTF_8);
        System.out.println(Arrays.toString(by1));
        System.out.println(Arrays.toString(by2));

        System.out.println("----------------------------");

        //测试GBK编码集
        byte[] by3 = s.getBytes("GBK");
        System.out.println(Arrays.toString(by3));

        //解码 [-28, -67, -96, -27, -91, -67, -28, -72, -83, -27, -101, -67]
        byte[] bys = {-28, -67, -96, -27, -91, -67, -28, -72, -83, -27, -101, -67};
        String s1 = new String(bys, StandardCharsets.UTF_8);
        System.out.println(s1);

        byte[] bys2 = {-60, -29, -70, -61, -42, -48, -71, -6};
        String s2 = new String();
        System.out.println(s2);




    }
}
