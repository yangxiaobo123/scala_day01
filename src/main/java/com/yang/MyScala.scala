package com.yang

import java.util.{Date, Random}

object MyScala {
  def main(args: Array[String]): Unit = {
    var a = 10;
    //   var result= if(a<10){
    //      "a";
    //    }else if (a>=10){
    //      "b";
    //    }
    //    print(result);
    //    while (a>0){
    //      println(a);
    //      a-=1;
    //    }
    //    do {
    //      println(a);
    //      a-=1;
    //    }while(a>0);
    //    var break=new Breaks;
    //    break.breakable({
    //      while(a>0){
    //        println(a);
    //        a-=1;
    //        if(a==5){
    //          break.break();
    //        }
    //      }
    //    })
    var array = Array(1, 2, 3);
    //    for(item <- array ){
    //      println(item);
    //    }
    //    for (item<-0 until array.size){
    //      println(array(item));
    //    }
    //    for (item<- 0 to array.length-1){
    //      println(array(item));
    //    }
    //    for (i<-1 to 9;j<-1 to i){
    //      print(i+"*"+j+"="+i*j+"\t");
    //      if(i==j){
    //        println();
    //      }
    //    }
    //
    //    var result=for(item<-array) yield item+1;
    //    for(item<-result){
    //      println(item);
    //    }
    //    var t=new Scanner(System.in);
    //    var m=t.nextInt();
    //    var result=m match{
    //      case 1=>"a"
    //      case 2=>"b"
    //      case 3=>"c"
    //      case default=>"hh"
    //    }
    //    println(result);
    var array1 = Array(1, true, "aa", new Date());
    var b = array1(new Random().nextInt(array1.length));
    println(b);
    var result = b match {
      case x: Int => "a"
      case x: String => "b"
      case x: Boolean => "c"
      case _ => "jj"
    }
    println(result);

  }
}
