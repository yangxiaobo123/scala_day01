package com.yang

class User4(name: String) extends User3(name: String) {
  override def eat(): Unit = {
    print(s"${name}~eat");
  }
}

object User4 {
  def apply(name: String): User4 = new User4(name)
}
