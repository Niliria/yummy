package com.oxysa.scala.basis

/**
  * @author Yummy
  * @mail 873387751@qq.com
  * @date 2020-3-22 11:12
  */
object InputDemo {
  def main(args: Array[String]): Unit = {
    var s1 = 12.5
    println(s1.toInt) //12

    var s2 = "12.5"
    //println(s2.toInt)//报错在scala中，不是讲小数点后的数据进行截取而是直接抛出异常，整数类型的字符串数字可以转换为Int类型
    println(s2.toDouble)

    var s3 = "hello" * 3
    println(s3)


  }
}
