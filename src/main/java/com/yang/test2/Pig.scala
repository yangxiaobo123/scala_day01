package com.yang.test2

class Pig(name: String) {
  def eat() = {
    print("吃")
  }

  def sleep() = {
    print("睡")
  }

}

object Pig {
  def apply(name: String): Pig = new Pig(name)
}