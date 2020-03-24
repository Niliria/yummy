package com.oxysa.scala.basis

/**
  * @author Yummy
  * @mail 873387751@qq.com
  * @date 2020-3-22 3:18
  *       scala print输出的三种形式
  */
object PrintDemo {
  def main(args: Array[String]): Unit = {
    //第一种直接输出 通过+ 拼接
    var str1: String = "hello"
    var str2: String = "word"
    print(str1 + str2)
    //换行
    println(str1 + str2)

    //第二种格式化输出printf
    var name: String = "yummy"
    var age: Int = 23
    var sal: Float = 16800.23F
    var height: Double = 178.66D
    //格式化输出Float与Double类型输出默认保留小数点后六位
    //%.2f保留小数点后两位
    //使用 % 相当于一个占位符
    printf("姓名:%s 年龄:%d 薪水:%.2f 身高:%.2f", name, age, sal, height)

    //第三种形式  scala支持$输出内容，编译器会解析$对应的变量
    //1，一定要加s
    println(s"\n个人信息如下：\n姓名:$name \n年龄:$age \n薪水:$sal \n身高:$height")
    //2,$输出还可以直接运算
    //2.1将变量用{}包起来 代表是一个表达式
    println(s"\n个人信息如下：\n姓名:${name + str1} \n年龄:${age + 10} \n薪水:${sal * 16} \n身高:${height + 12}")


  }

}
