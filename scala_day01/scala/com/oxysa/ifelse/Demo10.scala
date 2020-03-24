package com.oxysa.ifelse

import scala.io.StdIn

/**
  * @author Yummy
  * @mail 873387751@qq.com
  * @date 2020-3-23 12:31
  *       条件控制语句：多分支练习
  *
  */
object Demo10 {
  def main(args: Array[String]): Unit = {
    /*
      根据淡旺季月份 打印票价
      4-10旺季
         成人(18-60) :60
         儿童(18一下)：半价
         老人(60以上)：1/3
      淡季：
        成人:40
        其他:20
     */
    println("请选择月份：")
    val month: Int = StdIn.readInt()
    println("请输入年龄：")
    val age: Int = StdIn.readInt()

    //旺季
    if (month >= 4 && month <= 10) {
      if (age >= 18 && age <= 60) {
        println("成人票请支付60块钱")
      } else if (age < 18) {
        println("滴~ 小孩卡，请支付30块钱")
      } else if (age > 60) {
        println("滴~ 敬老卡，请支付20块钱")
      }
    } else {
      if (age >= 18 && age <= 60) {
        println("哎 淡季成人票请支付40块钱")
      } else {
        println("淡季 儿童票老人票一律20块钱")
      }

    }

  }
}
