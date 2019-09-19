package com.yang

object ScalaTest1 {
  def main(args: Array[String]): Unit = {
    var u = ScalaTest("a", 1);
    var u1 = ScalaTest("a");
    var ScalaTest(name: String, age: Int) = u
    print(s"${name}-${age}");
  }
}
