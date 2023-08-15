object 高阶函数 {
  def main(args: Array[String]): Unit = {
//    函数作为参数 就是高阶函数   operater:(Int,Int)=>Int  这个函数作为参数
    def calculator(a:Int,b:Int,operater:(Int,Int)=>Int):Int={
      operater(a,b)
    }
//    函数求和
    def plus(x:Int,y:Int):Int= x+y
    def multiply(x:Int,y:Int):Int=x*y
//    函数作为参数
    println(calculator(2,3,plus))
    println(calculator(2,3,multiply))
  }
}
