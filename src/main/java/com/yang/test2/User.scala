package com.yang.test2

class User private(sex: Boolean) {
  // private [this] var age:Int= _
  var age: Int = _
  var name: String = _

  def this(age: Int, name: String, sex: Boolean) {
    this(sex)
    this.age = age
    this.name = name
  }

  def say(): String = {
    "hh"
  }
}

object User {
  def apply(name: String, age: Int, sex: Boolean): User = new User(age, name, sex)

  def apply(sex: Boolean): User = new User(sex)

  def unapply(user: User): Option[(Int, String)] = {
    Some(user.age, user.name)
  }
}
