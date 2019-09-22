package com.yang.test1

trait Fly {
  this: User3 =>
  def fly(): Unit;

  def flyWhere(): Unit = {
    println("阿尔卑斯");
  }
}
