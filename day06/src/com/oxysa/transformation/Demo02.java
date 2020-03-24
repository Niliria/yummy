package com.oxysa.transformation;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

/**
 * @author Yummy
 * @mail 873387751@qq.com
 * @date 2020-3-19 12:28
 * 案例：演示转换输出流的五种写入数据方式
 * OutputStreamWriter的5个成员方法:
 * public void write(int ch);
 * public void write(char[] chs);
 * public void write(char[] chs, int start, int len);
 * public void write(String str);
 * public void write(String str, int start, int len);
 */
public class Demo02 {
    public static void main(String[] args) throws Exception {
        OutputStreamWriter osw = new OutputStreamWriter(
                new FileOutputStream("./day06/data/1.txt", true)
                , StandardCharsets.UTF_8);
        //根据当前系统自动匹配换行符
        String property = System.getProperty("line.separator");

        //测试 * public void write(int ch);
        osw.write('小');
        osw.write(property);
        osw.write('子');
        osw.write(property);

        //测试 * public void write(char[] chs);
        char[] car = {'你', '们', '是', '我', '永', '远', '的', '爱'};
        osw.write(car);
        osw.write(property);
        //测试 * public void write(char[] chs, int start, int len);
        osw.write(car, 0, 5);
        osw.write(property);

        //测试 * public void write(String str);
        osw.write("超级爱你");
        osw.write(property);

        //测试 * public void write(String str);
        String s1 = "他不懂你的心假装冷静";
        osw.write(s1, 0, 3);
        osw.write(property);

        System.out.println("写入成功！！！");
        osw.close();

    }
}
