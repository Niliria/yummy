package com.oxysa.forexpression

/**
  * @author Yummy
  * @mail 873387751@qq.com
  * @date 2020-3-23 12:56
  *       for循环控制
  */
object Demo01 {
  def main(args: Array[String]): Unit = {

    //方式一：
    val start: Int = 1
    val end: Int = 10
    /*
       1，start 表示从那个数开始 这里表示1
       2，end 表示从那个数结束 这里表示10
       3，to 是关键字
       4，start to end 表示前后闭合
     */
    for (i <- start to end) {
      println("for循环入门" + i)
    }

    //也可以用来遍历集合
    val list = List("hello",1,2,3,4,7,'z')
    for (lite <- list){
      println(lite)
    }


    //方式二:
    /*
      区别在于 i是从start开始到end-1
      until 关键字
      start until end表示 前闭合后开放(end -1)
     */
    for (i<- start until end){
      println(i)
    }




  }
}
