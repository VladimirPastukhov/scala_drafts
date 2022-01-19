package my



object ListTest {
  def main(args: Array[String]): Unit = {
    val list = 1 :: 2 :: List.empty
    val list2 = List(1, 2, 3, 4)

    val list3 = 1 to 10

//    for{i <- list3} println(i)
    val list5 = 5 to 7
    val list4 = for{i <- list; j <- list5; if j > 5} yield i + j

    println("list "+list)
    println("list2 "+list2)
    println("list4 "+list4)

    case class A(x: Int)
    implicit val orderingA: Ordering[A] = (a1, a2) => a1.x.compareTo(a2.x)

    val toSort = List(4, 2, 3, 1)
    val toSortA = List(A(4), A(2), A(3), A(1))

    println("toSort  " + toSort.sorted)
    println("toSortA " + toSortA.sorted)
  }
}
