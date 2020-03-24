package com.oxysa.forexpression

/**
  * @author Yummy
  * @mail 873387751@qq.com
  * @date 2020-3-23 16:04
  *       循环返回值
  */
object Demo05 {
  def main(args: Array[String]): Unit = {
    /*
      说明：for (i <- 1 to 10) yield i * 3
        1，对1 to 10进行遍历
        2，yilid i*3 将每次循环得到 i*3的结果放入到Vector集合中，并返回给res
        3, i 这里是一个代码块，我们可以对i进行数据处理
     */
    val res = for (i <- 1 to 10) yield i * 3
    println(res)
  }
}
