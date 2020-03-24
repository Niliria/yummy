package com.oxysa.ifelse

import scala.io.StdIn

/**
  * @author Yummy
  * @mail 873387751@qq.com
  * @date 2020-3-22 18:31
  *       条件控制语句
  *       单分支和双分支
  */
object Demo03 {
  def main(args: Array[String]): Unit = {
    println("请输入第一个数")
    val num1 = StdIn.readInt()
    println("请输入第二个数")
    val num2 = StdIn.readInt()
    if (num1 > 2) {
      if (num2 > 4) {
        println(num1 + num2)
      }
      println("num2不符合条件" + num2)

    } else {
      println("num1 is:" + num1)
    }


  }
}
