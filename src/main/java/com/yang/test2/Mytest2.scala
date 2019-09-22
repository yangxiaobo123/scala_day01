package com.yang.test2

import java.util.Date

object Mytest2 {

  def main(args: Array[String]): Unit = {
    import com.yang.test2.MyImplicit1._
    var num = sum1(1)(2)
    //println(num)
    //tellTime("2019-9-22 17:31:49")
    //    var pig=new Pig();
    //    pig.fly();
    //    pig.eat();
    //    pig.sleep();
    //lazy val a=sum2(1,2);
    //print(a)
    //    var a1=Pig("a")
    //    var a2=Pig("a")
    //    print(a1==a2)
    //    var fun:PartialFunction[Any,Int]={case x:Int=>x+1}
    //    var array=Array(1,2,"d")
    //    array.collect(fun).foreach(i=>print(i+"\t"))
    var u = User(false)

  }

  def sum1(x: Int)(y: Int)(implicit fun: (Int, Int) => Int): Int = {
    fun(x, y)
  }

  def tellTime(date: Date) = {
    println(s"${date.toLocaleString}")
  }

  def sum2 = (x: Int, y: Int) => {
    print("========")
    x + y
  }

}
