package example

import java.util.Date
import Array._

object Hello extends App {

  def log(date: Date, message: String) = {
    println(date + "----" + message)
  }

  val logBind = log(new Date(), _: String)

  logBind("hey 1")
  logBind("hey 2")
  logBind("hey 3")

  val add2 = (x: Int) => x + 1
  println(add2(5))

  val add3 = new Function2[Int, Int, Int] {
    def apply(x: Int, y: Int): Int = x + y
  }

  var myList1 = range(10, 20, 1)
  println(myList1.toList)

  var myList2 = apply((3, 4, 5, 6, 7))
  println(myList2.getClass())

  var someList = Array(2, 3, 4, 5, 6, 7)
  val diff = someList.diff(Array(4, 5, 6, 7, 8))

  println(diff.mkString(","))

  val site1: List[String] = List("Runoob", "Google", "Baidu")
  val site2 = "Runoob" :: ("Google" :: ("Baidu" :: Nil))

  println(List.concat(site1, site2))

  var map = Map[String, String]()
  map += ("key" -> "VALUE", "key2" -> "value2")
  println(map)

  val value1: Option[String] = map.get("key")
  val value3: Option[String] = map.get("key3")
  println(value1)
  println(value3)
  var mynil = Nil
  println(Array.getClass())

  var myEmptyList: List[String] = List[Nothing]()
  myEmptyList = myEmptyList.+:("Hey")
  println(myEmptyList)

  val withValue = "value" :: myEmptyList

  println(withValue)

  val days = List(
    "Sunday",
    "Monday",
    "Tuesday",
    "Wednesday",
    "Thursday",
    "Friday",
    "Saturday"
  )

// Pattern match
  days match {
    case firstDay :: secondDay :: otherDays =>
      println("The first day of the week is: " + secondDay)
    case Nil =>
      println("There don't seem to be any week days.")
  }
}
