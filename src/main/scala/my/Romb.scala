package my

trait A{
  def some: Int
}
trait B extends A{
  override def some = 1;
}

trait C extends A{
  override def some = 2;
}

class D extends B with C

class E extends C with B

object Romb {
  def main(args: Array[String]): Unit = {
    println("D "+ new D().some);
    println("E "+ new E().some);
  }
}
