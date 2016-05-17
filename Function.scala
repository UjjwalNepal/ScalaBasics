object Function{
	def main(args: Array[String]){

		def getSum(args: Int*): Int={
			var sum: Int = 0
			for(num <- args){
				sum += num
			}
			sum	
		}
		println("Get Sum"+ getSum(1,2,3,4,5,5,6,7,7))

	}
}