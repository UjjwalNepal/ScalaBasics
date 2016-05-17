import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object multidimensional{
	def main(args: Array[String]){

		var MultTable = Array.ofDim[Int](10,10)
		for(i <- 0 to 9){
			for(j <- 0 to 9){
				MultTable(i)(j) = i*j
				printf("%d*%d = %d \n",i,j,MultTable(i)(j))
			}
		}

		
	}
}