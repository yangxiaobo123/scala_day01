package com.yang

abstract class User3(name: String) {
  def sleep(): Unit = {
    print(s"${name}~sleep");
  }

  def eat(): Unit;
}
