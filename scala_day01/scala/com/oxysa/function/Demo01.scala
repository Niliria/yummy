package com.oxysa.function

/**
 * @author Yummy
 * @Email 873387751@qq.com
 * @date 2020-3-24 19:45
 */
object Demo01 {

  def main(args: Array[String]): Unit = {
    test(4)
  }

  def test(n: Int): Unit = {
    if (n > 2) {
      test(n - 1)
    }
    println("n=" + n)
  }

}
