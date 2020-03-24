package com.oxysa.ifelse

import scala.io.StdIn

/**
  * @author Yummy
  * @mail 873387751@qq.com
  * @date 2020-3-22 18:43
  *       练习2
  */
object Demo05 {
  def main(args: Array[String]): Unit = {
    /*
    声明两个Double类型的变量并且复制，判断第一个数大于10.0，切第二个数小于20.0，打印两个数的和
     */

    println("请输入第一个浮点数")
    val num1: Double = StdIn.readDouble()
    println("请输入第二个浮点数")
    val num2: Double = StdIn.readDouble()


    if (num1 > 10.0 && num2 < 20.0) {
      println("两数之和等于：" + (num1 + num2))
    } else {
      println("条件不符合，exit!!")
    }

  }

}
