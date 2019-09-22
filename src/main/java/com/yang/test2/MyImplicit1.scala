package com.yang.test2

import java.text.SimpleDateFormat
import java.util.Date

object MyImplicit1 {
  implicit var i = 100

  implicit def sum = (x: Int, y: Int) => x + y

  implicit def strDate(str: String): Date = {
    var format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    format.parse(str)
  }

  implicit class NewPig(pig: Pig) {
    def fly() = {
      print("飞")
    }
  }

}
