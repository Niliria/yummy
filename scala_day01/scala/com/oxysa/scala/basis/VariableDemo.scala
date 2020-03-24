package com.oxysa.scala.basis

/**
  * @author Yummy
  * @mail 873387751@qq.com
  * @date 2020-3-22 4:42
  *       scala中定义变量：声明类型不可以修改 说明Scala也是一门强类型语言
  *       val修饰的变量不能更改，在编译后等同于加上final
  *
  *       为什么设计val与var
  *       在实际编程中，我们更多的是获取/创建一个对象后，读取/修改该对象的属性值但是却很少去改变这个对象本身
  *       1，这时我们就可以使用val 因为val没有线程安全问题，因此效率会高一些
  *       2，如果对象需要改变就可以使用var
  *
  */
object VariableDemo {
  def main(args: Array[String]): Unit = {
    //数据的基本类型
    //1，String类型字符串
    val name: String = "yummy"
    //2,Int整数类型(默认)
    val age: Int = 23
    //3，Long类型
    val id: Long = 1234556l
    //4,short类型
    val s1: Short = 121
    //5,byte类型
    val b1: Byte = 12
    //6,浮点数类型 double(默认)
    val souce: Double = 66.6
    //7,浮点数类型 flout
    val f1: Float = 23.23F
    //8,boolen类型(true or false)
    val toOrFalse: Boolean = false
    //9,char类型
    val letter: Char = 'A'
    println(s"$name,$age,$id,$souce,$f1")

    var num = 1.2  //默认为Double
    var num2 = 1.7f  //这是float
    num = num2  //Double类型转换为float没有问题
    //num2 = num 报错float类型转换为Double类型报错
    num2=num.toFloat  //强制类型转换


    //测试val与var
    val dog = new Dog
    //dog = new Dog 报错 val修饰无法重新分配
    dog.age = 20
    dog.name = "咖啡"
    //dog.height=30  报错 val修饰无法重新分配
    //dog.weight=40  报错 val修饰无法重新分配
    println(dog)


  }

  class Dog {
    var age = 0
    var name = "小西"

    //使用val修饰
    val weight = 10
    val height = 70

  }


}
