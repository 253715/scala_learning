object yusuanfu {
  def main(args: Array[String]): Unit = {
//    scala中其实没有运算符  所有的运算符都是方法
//    标准的加法运算
    val i:Int=1.+(1)
//    1. 当调用对象的方法的时候 .可以不要
    val i1:Int=1+(1)
//    2. 当函数参数只有一个的时候 括号可以不要
    val i2:Int=1+1
    println(i,i1,i2)
  }

}
