import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object Arr{
	def main(args: Array[String]){

		val favNum = new Array[Int](20)

		val friends = Array("Bob","Tom")
		friends(0) = "Sue"

		println("Best Faily"+ friends(0))

		val friends2 = ArrayBuffer[String]()
		friends2.insert(0,"Phil")
		friends2 += "mark"
		friends2 ++= Array("Susy","Paul")
		friends2.insert(1,"Mike","Sally","sam","Mary","Sue")

		var friend : String = " "

		for(friend <- friends2){
			println(friend)
		}

		for(j <-0 to (favNum.length - 1)){
			favNum(j) = j
			println(favNum(j))
		}

	}
}