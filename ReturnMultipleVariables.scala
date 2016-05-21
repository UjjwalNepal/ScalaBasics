object ReturnMultipleVariables{
	def main(args: Array[String]){

	}

	def swap(x:String, y:String) = (y,x)
	val a = "Hello"
	val b = "World"
	println(a,b)
	printf("After swapping")
	
	println(swap(a,b))
}