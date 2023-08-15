package 集合

object 集合 {
  def main(args: Array[String]): Unit = {
    val list:List[Int]=List(1,2,3,4,5,6,7)
//    (1) 获取集合的长度
    println(list.length)
//    获取集合的大小
    println(list.size)
//    遍历集合
    list.foreach(println)
print("88888888888888888888")
    for (elem<-list.iterator){
      println(elem)
    }
//    生成字符串
    println(list.mkString(","))

//    是否包含
    println(list.contains(3))


  }

}
