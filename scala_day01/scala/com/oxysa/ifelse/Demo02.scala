package com.oxysa.ifelse

import scala.io.StdIn

/**
  * @author Yummy
  * @mail 873387751@qq.com
  * @date 2020-3-22 18:27
  *       条件控制语句：双分支
  */
object Demo02 {
  def main(args: Array[String]): Unit = {
    println("请输入您的年龄")
    val age = StdIn.readInt()
    if (age > 18) {
      println("成年了")
    } else {
      println("未成年")
    }
  }
}
