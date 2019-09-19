package com.yang

class ScalaTest(var name: String) {
  var age: Int = _;

  def this(name: String, age: Int) {
    this(name);
    this.age = age;
  }
}

object ScalaTest {
  def unapply(test: ScalaTest): Option[(String, Int)] = {
    if (test == null) {
      Some("2", 1);
    } else {
      Some(test.name, test.age);
    }
  }

  def apply(name: String, age: Int): ScalaTest = new ScalaTest(name, age);

  def apply(name: String): ScalaTest = new ScalaTest(name);


}
