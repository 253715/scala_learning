object str {
  def main(args: Array[String]): Unit = {
//    字符通过加号
    println("hello"+"world")
//    相同的字符拼接
    println("hello"*3)

    printf("name: %s age: %d\n", "linhai", 8)

    val name="zhangrongkai"
    val age=18
    val s1=s"name: $name,age: ${age+1}"
    println(s1)
//    zhangrongkai1  这个1就是字符串
    val s2=s"name: ${name+1},age:${age+2}"
    println(s2)

//    scala中不要写return
  }
}
