object evenList{
	def main(args: Array[String]){
		var even = for{i<- 1 to 20
			if(i%2) == 0
			}yield i

		for(i <- even){
			println(i)
		}
	}
}