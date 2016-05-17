object loops{
	def main(args: Array[String]){
		val aList = List(1,2,3,4,5)
		for(i <- aList){
			println("Hello from item"+i)
		}
	}
}