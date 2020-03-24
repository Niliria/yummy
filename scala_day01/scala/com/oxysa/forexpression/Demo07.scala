package com.oxysa.forexpression

/**
 * @author Yummy
 * @Email 873387751@qq.com
 * @date 2020-3-24 13:47
 *       循环练习
 */
object Demo07 {
  def main(args: Array[String]): Unit = {
    /*
    打印1-100之间所有是9的倍数的整数的个数以及总和
     */
    var count = 0
    var sum = 0
    for (i <- 1 to 100) {
      if (i % 9 == 0) {
        count += 1
        sum += i
      }
    }
    printf("count=%d, sum = %d", count, sum)

    println("-------------------")
    /*
     输出的循环表达式
     */
    val num = 10
    for (i <- 0 to num) {
      printf("%d + %d =%d\n", i, (num - i), num)
    }
  }
}
