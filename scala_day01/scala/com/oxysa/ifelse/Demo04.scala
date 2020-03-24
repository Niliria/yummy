package com.oxysa.ifelse

import scala.io.StdIn

/**
  * @author Yummy
  * @mail 873387751@qq.com
  * @date 2020-3-22 18:39
  *       练习1
  */
object Demo04 {
  def main(args: Array[String]): Unit = {
    /*
       声明2个int类型的变量并赋值，判断两个数之和，如果大于等于50，打印hello word
     */
    println("请输入第一个数值：")
    val num1: Int = StdIn.readInt()
    println("请输入第二个数值：")
    val num2: Int = StdIn.readInt()

    if (num1 + num2 >= 50) {
      println("hello word!")
    } else {
      println("条件不符合，exit!!")
    }


  }

}
