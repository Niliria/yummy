package com.oxysa.keyboardentry

import scala.io.StdIn

/**
  * @author Yummy
  * @mail 873387751@qq.com
  * @date 2020-3-22 16:56
  *       模拟键盘录入
  */
object Demo01 {
  def main(args: Array[String]): Unit = {
     /*
      * 要求从控制台接收用户信息 姓名 年龄 薪水
      */
    println("请输入您的姓名：")
    val name = StdIn.readLine()
    println("请输入您的年龄")
    val age = StdIn.readInt()
    println("请输入您的薪水")
    val sal = StdIn.readDouble()

    printf("用户信息为 name=%s age=%d sal=%.2f",name,age,sal)

  }

}
