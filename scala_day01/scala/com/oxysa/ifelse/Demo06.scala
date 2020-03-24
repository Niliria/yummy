package com.oxysa.ifelse

import scala.io.StdIn

/**
  * @author Yummy
  * @mail 873387751@qq.com
  * @date 2020-3-22 18:50
  *       练习3
  */
object Demo06 {
  def main(args: Array[String]): Unit = {
    /*
    定义两个变量int,判断两者之和是否既能被3又能被5整除
     */

    println("请输入第一个数字")
    val num1: Int = StdIn.readInt()
    println("请输入第一个数字")
    val num2: Int = StdIn.readInt()

    val sum: Int = num1 + num2
    if (sum % 3 == 0 && sum % 5 == 0) {
      println("数据没有问题")
    } else {
      println("数据不符合")
    }


  }

}
