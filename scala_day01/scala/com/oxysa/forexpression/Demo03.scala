package com.oxysa.forexpression

/**
  * @author Yummy
  * @mail 873387751@qq.com
  * @date 2020-3-23 13:50
  *       引入变量
  */
object Demo03 {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 3; j = 4 - i) {
      println(j)
    }
    println("---------------------------")
    //等价于这种写法
    for (s <- 1 to 3) {
      var j = 4 - s
      println(j)
    }

    println("-------------------------")
    //也可以用{ } 取消掉小括号
    for {
      i <- 1 to 30
      j = 4 - i
    } {
      println("i=" + i + "j=" + j)
    }

  }
}
