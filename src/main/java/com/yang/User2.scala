package com.yang

class User2(var name: String) {
  self =>
  var age: Int = _;

  def this(name: String, age: Int) {
    this(name);
    this.age = age;
  }

  def k = (x: Int, y: Int) => {
    println(s"${name}~${age}");
    x + y;
  };
}

object User2 {
  def unapply(user: User2): Option[(String, Int)] = {
    Some(user.name, user.age);
  }

  def apply(name: String): User2 = new User2(name);

  def apply(name: String, age: Int): User2 = new User2(name, age);

}