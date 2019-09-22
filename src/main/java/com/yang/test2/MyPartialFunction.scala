package com.yang.test2

object MyPartialFunction {
  def main(args: Array[String]): Unit = {
    var fin = new PartialFunction[Any, String] {
      override def isDefinedAt(x: Any): Boolean = {
        x.isInstanceOf[String]
      }

      override def apply(v1: Any): String = {
        v1.asInstanceOf[String] + "1"
      }
    }
    var array = Array(1, 2, 3, "s", "d");
    //array.collect(fin).foreach(item=>println(item+"\t"))
    var m = for (item <- array; if (fin.isDefinedAt(item))) yield fin.apply(item)
    //m.foreach(i=>println(i+"\t"))

    //    var fun:PartialFunction[Any,Int]={case x:Int=>x+1}
    //    array.collect(fun).foreach(i=>println(i+"\t"))

    array.collect({ case x: Int => x + 1 }).foreach(i => println(i + "\t"))
  }
}
