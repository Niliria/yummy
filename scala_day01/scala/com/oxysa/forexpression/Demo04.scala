package com.oxysa.forexpression

/**
  * @author Yummy
  * @mail 873387751@qq.com
  * @date 2020-3-23 15:50
  *       嵌套循环
  */
object Demo04 {
  def main(args: Array[String]): Unit = {
    //应为没有关键字所以加 ;隔断逻辑
    for (i <- 1 to 3; j <- 3 to 10) {
      println("i=" + i + "  " + "j =" + j)
    }


    println("-----------------------")


    for (i <- 1 to 3) {
      for (j <- 3 to 10) {
        println("i=" + i + "  " + "j =" + j)
      }
    }


  }
}
