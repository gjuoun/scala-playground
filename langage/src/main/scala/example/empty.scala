package example

import play.api.libs.json

object empty extends App {

  object Foo {
    def unapply(x : Int) : Option[String] =
      if(x == 0) Some("Hello, World") else None
  }

  val myInt = 0

  val result = myInt match {
    case Foo(str) => println(str)
  }

  println(result)
}
