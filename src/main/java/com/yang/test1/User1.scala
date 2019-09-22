package com.yang.test1

class User1(name: String) {
  var age: Int = _;

  def this(name: String, age: Int) {
    this(name);
    this.age = age;
  }

  def seyHi(): Unit = {
    print(s"${name}~${age}");
  }
}
