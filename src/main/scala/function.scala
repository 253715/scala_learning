object function {
  def main(args: Array[String]): Unit = {
//    定义一个方法  f 表示方法名   参数名  参数类型   函数返回类型
    def f(arg:String):Unit={
      println(arg)
    }
//    调用函数
    f("hello,word")


    def test():Unit={
      println("无参数 无返回值")
    }

    def test1():String={
      return ("无参数，有返回值")
    }

    def test2(arg:String):Unit={
      println(arg)
    }
    test2("有参数无返回值")

    def test3(arg:String):String={
      return "有参数有返回值"
    }
    test3("有参数有返回值")



//    方法月简单越好

   def func0(x:Int,y:Int):Int={
     println("func0的调用")
     if (x<20){
       return x+y
     }
     2*x+3*y
   }
//    方法的调用
    print(func0(10,20))
//    （1 return可以不要
def func1(x: Int, y: Int): Int = {
  println("func1的调用")
    x + y
}
//    （2  方法只有一行代码  括号不要
def func2(x: Int, y: Int): Int = x + y

//    （3  返回值类型可以推断出来   返回值类型不要
def func3(x: Int, y: Int)= x + y
//


  }

}
