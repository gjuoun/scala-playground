package example

object Hello extends App {
  var a = 0;
  val numList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

  // for 循环
  var loopVals = for { a <- numList if a != 3; if a < 8 } yield a

  println(loopVals)
}
