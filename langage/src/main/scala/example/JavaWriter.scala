package example

import java.io._
import scala.io.Source

object Test {
  def main(args: Array[String]) {
    val writer = new PrintWriter(new File("test.txt"))

    writer.write("cai ji -- \n hao cai")
    writer.close()

    Source.fromFile("test.txt").getLines().foreach((line)=>{
      println(line)
    })
  }
}
