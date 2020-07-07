package example

class Marker private (color: String) {

  println("create:" + this)

  override def toString(): String = " color:" + color

}

object Marker {

  private val markers: Map[String, Marker] = Map(
    "red" -> new Marker("red"),
    "blue" -> new Marker("blue"),
    "green" -> new Marker("green")
  )

  def apply(color: String) = {
    if (markers.contains(color)) markers(color) else null
  }

  def getMarker(color: String) = {
    if (markers.contains(color)) markers(color) else null
  }
  def main(args: Array[String]) {

    // call the object itself
    println(Marker("red"))

    println(Marker.getMarker("blue"))

    val jun: Option[(String, String)] = Some("2", "123")
    println(jun.get)
  }

}
