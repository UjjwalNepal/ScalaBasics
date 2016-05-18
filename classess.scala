import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object classess{
	def main(args: Array[String]){

		var rover = new Animal
		rover.setName("Rover")
		rover.setSound("woof")
		printf("%s says %s \n", rover.getName, rover.getSound)
		var a = new Animal("9st")
		println(s"${a.getSound}")
		val Whiskers = new Animal("Whiskers")

		println(s"${Whiskers.getName} with id ${Whiskers.id} says ${Whiskers.sound}")
		
		println(Whiskers.toString)
	}
	class Animal(var name : String, var sound: String){

	this.setName(name)
	
	val id = Animal.newIdNum

	def getName() : String = name
	def getSound() : String = sound

	def setName(name : String){
		if(!(name.matches(".*\\d+.*")))
			this.name = name
		else
			this.name = "NoName"
	}
	def setSound(sound : String){
		this.sound = sound
	}	

	def this(name :String){
		this("No Name","No Sound")
		this.setName(name)

	}

	def this(){
		this("No Name","No Sound")
	}

	override def toString(): String ={
		return "%s with the id %d says %s".format(this.name,this.id,this.sound)
	}

	}
	object Animal{
		private var idNumber = 0
		private def newIdNum = {
			idNumber += 1;idNumber
		}
	}
}