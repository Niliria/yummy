package com.oxysa.ifelse

import scala.io.StdIn

/**
  * @author Yummy
  * @mail 873387751@qq.com
  * @date 2020-3-23 12:21
  *       练习5
  *       条件控制语句多分支
  */
object Demo09 {
  def main(args: Array[String]): Unit = {
    /*
       参加百米运动会，如果用时8秒以内进入决赛，否则淘汰
       根据性别提示进入到男子组与女子组
     */
    println("请输入您的成绩：")
    val source = StdIn.readInt()
    if (source <= 8) {
      println("请输入您的性别：")
      val gender: Char = StdIn.readChar()
      if (gender.equals('男')) {
        println("请进入男子组")
      } else if (gender.equals('女')) {
        println("请进入女子组")
      } else {
        println("性别有误")
      }
    } else {
      println("您以淘汰")
    }

  }
}
