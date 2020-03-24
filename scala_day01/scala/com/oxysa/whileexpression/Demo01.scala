package com.oxysa.whileexpression

/**
 * @author Yummy
 * @Email 873387751@qq.com
 * @date 2020-3-24 15:01
 *       while循环入门
 *       1，while循环条件是返回一个布尔类型的表达式
 *       2，while循环是先判断在执行语句
 *       3，与if语句不同，while语句本身没有值，即整个while语句的结果是Unit类型的()
 *       4，因为while中没有返回值，所以当需要使用while语句来计算并且返回结果时，就不可避免的使用变量，而变量声明在while语句外部，
 *       那么就等同于循环的内部对外部变量造成了影响，所以不推荐使用，而是推荐使用for循环
 *
 */
object Demo01 {
  def main(args: Array[String]): Unit = {
    var i = 0
    while (i < 10) {
      println("hello,word" + i)
      i += 1
    }
    println("-------------------")


    //练习1 打印1-100之间所有能够被3整除的数
    var j = 1
    while (j < 100) {
      if (j % 3 == 0) {
        println(j)
      }
      j += 1
    }


    println("==============")
    //使用for循环
    for (i <- 1 to 100 if i % 3 == 0) {
      println(i)
    }

    println("==============")
    //使用for循环
    val res = for (i <- 1 to 100 if i % 3 == 0) yield i
    for (l <- res)
      println(l)
  }
}
