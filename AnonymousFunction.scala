object AnonymousFunction{
	def main(args: Array[String]){

		var call1 = doWithOneAndTwo((x:Int, y:Int) => x+y)

		var call2 = doWithOneAndTwo((x,y) => x + y)

		var call3 = doWithOneAndTwo(_+_)

		println(call1, call2, call3)
	}
	def doWithOneAndTwo(f: (Int,Int) => Int)={
		f(1,2)
	}
}