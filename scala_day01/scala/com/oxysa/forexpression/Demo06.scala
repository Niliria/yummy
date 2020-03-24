package com.oxysa.forexpression

/**
 * @author Yummy
 * @Email 873387751@qq.com
 * @date 2020-3-24 13:24
 *       循环控制步长的两种方式
 */
object Demo06 {
  def main(args: Array[String]): Unit = {

    /*
    方式一 使用Range
    def apply(start: Int, end: Int, step: Int): Range = new Range(start, end, step)
    使用给定的步长值设置从' start '到' end ' (exclusive)的范围。
     */
    for (i <- Range(1, 10, 2)) {
      println("i=" + i)
    }

    println("---------")

    /*
      方式二：使用循环守卫
     */
    for (i <- 1 to 10 if i % 2 == 1) {
      println("i=" + i)
    }

  }
}
