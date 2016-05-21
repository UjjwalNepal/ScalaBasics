object AnonymousFunction{
	def main(args :Array[String]){

		println(add1(43,11))
		println(add2(42,33))
		println(add3(22,44))
		println(add4(30,10))
	}

	def add1(x:Int, y:Int) = x+ y  //method
	val add2 = (x:Int, y:Int) => x+y //anonymous function
	val add3 :(Int,Int)=>Int = _+_ //alternate way
	val add4 = (_+_):(Int,Int) => Int //alternate way, rare


}