object fun {
  def main(args: Array[String]): Unit = {
//    函数
//  函数名   参数名  参数类型  函数标识符
    val add=(x:Int,y:Int)=>{x+y}
//    函数调用

//    区别
//    方法定义在类中可以实现重载
//    ，函数不可以重载
//    2
//    ）方法是保存在方法区
//    ，函数是保存在堆中
//    3
//    ）定义在方法中的方法可以称之为函数
//    ，不可以重载
//    4
//    ）方法可以转成函数
//    , 转换语法: 方法名
//    _
    val result=add(12,23)
    println(result)
  }

}
