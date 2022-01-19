package my

object Implicid {
  def main(args: Array[String]): Unit = {
    def sqr(implicit i: Int) = i * i
    implicit val x = 123
    val res = sqr
    println("res "+res)
  }
}
