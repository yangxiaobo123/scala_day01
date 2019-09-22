package com.yang.test2

sealed class MySealed(name: String)

case class MySealed1(name: String, age: Int) extends MySealed(name: String)

case class MySealed2(name: String, age: Int, sex: Boolean) extends MySealed(name: String)
