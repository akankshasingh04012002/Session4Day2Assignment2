import scala.util.{Failure, Success}

object Driver extends App{
  val fibObject = new Fibonacci()
  val num = scala.io.StdIn.readInt()
  val result = fibObject.fibonacci(num)

  result match {
    case Success(number) => println(s"the $num fibonacci number is $number")
    case Failure(ex) => println(s"Error occurred: ${ex.getMessage}")
  }
}
