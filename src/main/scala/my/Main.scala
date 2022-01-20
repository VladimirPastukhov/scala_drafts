package my
import myKotlin.MainKt
import myKotlin.ExtensionKt

object Main {
  def main(ags: Array[String]): Unit ={
    println("Hello World")

    def intVal = "ANTILOPA" match {
      case "POPA" => 1
      case "GOPA" => 2
      case "ANTILOPA" => "adsf"
    }

    println("val "+intVal)

    def map = Map.empty +
      (2001 -> "bla bla") +
      (2002 -> "the second bla bla") ++
      (2003 to 2006).map(_ -> "repeats")

    println("map "+map)

    println("string add " + ExtensionKt.addA("test"))
  }
}
