package com.yang

class Dog(name: String) extends User3(name: String) {
  override def eat(): Unit = {
    println(s"${name}~eat");
  }
}
