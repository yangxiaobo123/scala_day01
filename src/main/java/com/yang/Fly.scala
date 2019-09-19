package com.yang

trait Fly {
  this: User3 =>
  def fly(): Unit;

  def flyWhere(): Unit = {
    println("阿尔卑斯");
  }
}
