import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source
object IO{
	def main(args: Array[String]){

		val name = "Derek"
		val age = 39
		val weight = 175.5

		println(s"Hello $name")
		printf(f"I am ${age + 1} & weight $weight%2f \n")
		printf("%5d \n",5)

		var randSet = "I saw a dragon fly by"

		println("String length: "+randSet.length)

		println(randSet.concat(" and explode"))

		println("Dragon starts at index" + randSet.indexOf("dragon"))

		val randSetArray = randSet.toArray 
		for(v <- randSetArray){
			println(v)
		}
	}
}