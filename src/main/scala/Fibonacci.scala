import scala.annotation.tailrec
import scala.util.Try

class Fibonacci {
  def fibonacci(number: Int): Try[Int] = Try {
    require(number > 0, "n must be a positive integer.")

    @tailrec
    def fiboTailRecursion(current: Int, last: Int, nextToLast: Int): Int = {
      if (current >= number) last
      else fiboTailRecursion(current + 1, last + nextToLast, last)
    }

    if (number <= 2) 1
    else fiboTailRecursion(2, 1, 1)
  }

}

