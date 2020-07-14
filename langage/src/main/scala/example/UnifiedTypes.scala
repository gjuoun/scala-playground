package example

object UnifiedTypes {

  def main(args: Array[String]): Unit = {
    val list: List[Any] = List(
      "a string",
      732, // an integer
      'c', // a character
      true, // a boolean value
      () => "an anonymous function returning a string"
    )

    list.foreach(element => println(element))
  }
}
