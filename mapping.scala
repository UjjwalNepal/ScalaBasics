import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object mapping{
	def main(args :Array[String]){

		var employees = Map("Manager" -> "Bob Smith","secretery" -> "Sue Brown")

		if(employees.contains("Manager")){
			printf("Manager : %s \n",employees("Manager"))
		}

		var customers = collection.mutable.Map(1000 -> "Paul Smith", 101->"Henry Dockrel")
		printf("Cust 1: %s \n",customers(1000))
		customers(102) = "Tom Hardy"
		customers(103) = "Tom Cruise"
		for((k,v) <-customers){
			printf("%d::%s\n",k,v)
		}
	}
}
