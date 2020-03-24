package com.oxysa.ifelse

import scala.io.StdIn

/**
  * @author Yummy
  * @mail 873387751@qq.com
  * @date 2020-3-23 9:55
  *       练习4
  */
object Demo07 {
  def main(args: Array[String]): Unit = {
    /*
    判断一个年份是否为闰年
     闰年的条件：
     1，年份能够被4整除，但是不能被100整除
     2，能够被400整除
     */
    println("请输入需要查询的年份：")
    val yesr: Int = StdIn.readInt()
    if (yesr % 4 == 0 && yesr % 100 != 0 || yesr % 400 == 0) {
      println("是闰年")
    } else {
      println("不是闰年")
    }

  }
}
