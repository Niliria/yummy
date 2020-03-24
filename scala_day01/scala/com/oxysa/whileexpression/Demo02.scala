package com.oxysa.whileexpression

/**
 * @author Yummy
 * @Email 873387751@qq.com
 * @date 2020-3-24 15:33
 *       do while循环
 */
object Demo02 {
  def main(args: Array[String]): Unit = {
    var i: Int = 1

    do {
      println("hello scala" + i)
      i += 1
    } while (i <= 10)
  }
}
