import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object Traitss{
	def main(args: Array[String]){

		val Superman = new Superhero("Superman")
		println(Superman.fly)
		println(Superman.hitByBullet)
		println(Superman.ricochet(2500))

	}
/*
	traits are like interfaces is java except that you can define
	methods inside the traits which is not liable in Java
*/
	trait Flyable{
		def fly: String
	}

	trait BulletProof{
		def hitByBullet : String

		def ricochet(startSpeed : Double) : String ={
			"The bullet is going to ricochet at a speed of %.1f ft/sec".format(startSpeed * .75)
		}
	}

	class Superhero(val name: String) extends Flyable with BulletProof{
		def fly = "%s files to the air".format(this.name)

		def hitByBullet = "The bullet bounces off of %s".format(this.name)
	}
}