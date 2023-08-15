package 集合

object TestList {
  def main(args: Array[String]): Unit = {
    val list1:List[Int]=List(1,2,3,4,5,6,7)
    val list2:List[Int]=List(4,5,6,7,8,9,10)
//    打印头
    println(list1.head)
    println("------------")
//    集合最后一个元素
    println(list1.last)
//    集合的尾部
    println(list1.tail)
    println(list1.init)
//    前面的n个元素
    println(list1.take(3))
    println(list1.takeRight(3))
//    反转
    println(list1.reverse)
//    求并集
    println(list1.union(list2))
    println(list1.intersect(list2))
    println(list1.diff(list2))
//    List((1,4), (2,5), (3,6), (4,7), (5,8), (6,9), (7,10))
//    如果两个集合的元素个数不
    println(list1.zip(list2))
//    划窗
//      val list1:List[Int]=List(1,2,3,4,5,6,7)
//    序号为2到4的跳过  左闭右开
    list1.sliding(2,5).foreach(println)
  }

}
