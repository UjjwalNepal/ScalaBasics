object Starting{
	def main(args: Array[String]){
		var i =0

		while(i<=10){
			 println(i)
			i += 1
		}
		i = 0
		do{
			println(i)
			i +=1
		}while(i<=10)

		for(i<-1 to 10){
			println(i)
		}
		var randLetters = "ABCDEFNKACLNLKCANLKCHANCLA"
		for(i <- 0 until randLetters.length){
			println(randLetters(i))
		}
	}
}