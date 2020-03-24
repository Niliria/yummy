package com.oxysa.ifelse

import scala.io.StdIn

/**
  * @author Yummy
  * @mail 873387751@qq.com
  * @date 2020-3-22 18:21
  *
  *       条件控制语句：单分支
  */
object Demo01 {
  def main(args: Array[String]): Unit = {
    println("请输入您的年龄：")
    val age = StdIn.readInt()
    if (age > 19) {
      println("age > 18")
    }

    /*
    Scala中任意表达式都是有返回值的，也就意味着if -else表达式其实是有返回值的
    具体返回结果的值取决于满足条件代码的最后一行内容
     */
    val num = 20
    val res = if (num > 18) { //res=yes ok
      println("hellp")
      9 - 8
      "yes ok"
    } else {
      7
    }
    println("res=" + res)


    val num2 = 20
    val res2 = if (num2 > 50) {
      "结果大于50"
    }
    println(res2)  //控制台返回是 ()
  }


}

