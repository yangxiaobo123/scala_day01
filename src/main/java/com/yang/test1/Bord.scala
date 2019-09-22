package com.yang.test1

class Bord(name: String) extends User3(name: String) with Fly {
  override def eat(): Unit = {
    println(s"${name}eat any");
  }

  override def fly(): Unit = {
    println(s"${name} fly all");
  }

  override def flyWhere(): Unit = {
    println(s"${name} fly where");
  }

  override def sleep(): Unit = {
    println(s"${name} sleep where");
  }
}

object Bord {
  def apply(name: String): Bord = new Bord(name)
}
