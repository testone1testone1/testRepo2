import org.scalatest.flatspec.AnyFlatSpec

class ExampleTest extends AnyFlatSpec {
  "Method isOddNumber" should "return True if number is odd" in {
    val num = 1
    assert(Example.isOddNumber(num))
  }
  it should "return False if number is even" in {
    val num = 2
    assert(!Example.isOddNumber(num))
  }

  "Method isEvenNumber" should "return True if number is even" in {
    val num = 2
    assert(Example.isEvenNumber(num))
  }
  it should "return False if number is odd" in {
    val num = 2
    assert(!Example.isEvenNumber(num))
  }
}