package com.oxysa.forexpression

/**
  * @author Yummy
  * @mail 873387751@qq.com
  * @date 2020-3-23 13:33
  *       循环守卫
  */
object Demo02 {
  def main(args: Array[String]): Unit = {

    for (i <- 1 to 3 if i != 2) {
      println("循环守卫i" + i)
    }

    for (j <- 1 to 3) {
      if (j != 2) {
        println("循环守卫j" + j)
      }
    }
  }
}
