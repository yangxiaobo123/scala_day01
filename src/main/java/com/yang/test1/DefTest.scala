package com.yang.test1

object DefTest {
  def main(args: Array[String]): Unit = {
    //    def sum(x:Int,y:Int):Int={
    //       x+y;
    //    }
    //    def sum01(x1:Int*)={
    //      var total=0;
    //      for(item<-x1){
    //        total+=item;
    //      }
    //      total
    //    }
    //    def m(sum:String,name:String): Unit ={
    //      print(s"${sum}~${name}");
    //    }
    //    def m1(sum:String="a",name:String="d"): Unit ={
    //      print(s"${sum}~${name}")
    //    }
    //    def m2(num:Int): Int ={
    //      def m3(num1:Int): Int ={
    //        if(num1>1){
    //          num1*m3(num1-1);
    //        }else{
    //          1
    //        }
    //      }
    //      m3(num);
    //    }
    //    //m(name="d",sum="a");
    //    //print(sum01(1,2,3,4));
    //    //m1();
    //    def m6(s:Int)(s1:Int):Int={
    //       s+s1;
    //    }
    //    var j1=m6 _;
    //    print(j1(1)(2));
    //    var j=m6(1)(_);
    //    print(j(2));
    //print(m2(5));
    def mm = (num: Int) => num + 1;
    def mm1 = (x: Int, y: Int) => x + y;
    def mm2(k: (Int, Int) => Int) = {
      k;
    }

    //print(mm2((x,y)=>x+y));
    def mm3(k: (Int, Int) => Int)(x: Int)(y: Int): Int = {
      //柯里化,函数做参数
      k(x, y);
    }

    def mm5 = (a: (Int, Int) => Int, b: Int, c: Int) => a(b, c);
    var result = mm3((x, y) => x + y) _;
    //print(result);
    //print(mm5((x,y)=>x+y,1,2));
    def mm4 = (x: Int, y: Int) => x * y

    var j = mm4(1, 2);
    //print(j);
    //print(mm1(2,1));
    //print(mm(2));

  }
}
