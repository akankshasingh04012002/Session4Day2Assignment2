import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import scala.util.{Success, Failure}

class FibonacciTest extends AnyFlatSpec with Matchers {

  "The Fibonacci function" should "return the correct value for number = 1" in {
    val fibObject = new Fibonacci()
    val result = fibObject.fibonacci(1)
    result should be (Success(1))
  }

  it should "return the correct value for number = 10" in {
    val fibObject = new Fibonacci()
    val result = fibObject.fibonacci(10)
    result should be (Success(55))
  }

  it should "return the correct value for number = 20" in {
    val fibObject = new Fibonacci()
    val result = fibObject.fibonacci(20)
    result should be (Success(6765))
  }
}
