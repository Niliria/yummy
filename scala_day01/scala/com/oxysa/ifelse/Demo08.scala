package com.oxysa.ifelse

import scala.io.StdIn

/**
  * @author Yummy
  * @mail 873387751@qq.com
  * @date 2020-3-23 10:21
  *       条件控制语句：多分支
  */
object Demo08 {
  def main(args: Array[String]): Unit = {
    /*小明参加考试，他父亲与小明达成承诺
      成绩为100，奖励macbook
      成绩为80-99,奖励iPhone11
      成绩为60-80，奖励airPods
      60一下大耳刮子
     */
    println("考了多少分?")
    val result: Int = StdIn.readInt()
    if (result == 100) {
      println("奖励macBook")
    } else if (result <= 99 && result >= 80) {
      println("奖励iphone11")
    } else if (result < 80 && result >= 60) {
      println("奖励airPods")
    } else {
      println("男女混合双打！！！")
    }

  }
}
