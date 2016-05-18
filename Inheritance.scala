import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object Inhertitance{
	def main(args: Array[String]){

		val spike = new Dog("spike","woof","Growl")
		spike.setName("Spike")
		println(spike.toString)
		val man = new Animal("Cow","dance")
		println(s"${man.getName}, ${man.getSound}")
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
	class Dog(name: String, sound: String, growl: String) extends Animal(name,sound){

		def this(name: String, sound :String){
			this("NoName","No Sound","No Growl")
			this.setName(name)
		}
		def this(name: String){
			this("no name","no sound","no growth")
			this.setName(name)

		}
		def this(){
			this("No Name","No Sound","No Growth")
		}
		override def toString():String ={
			return ("%s with the id %d say %s".format(this.name,this.id,this.sound))
		}
	}
}