object MatchAsSwitch{
	def main(args: Array[String]){
		val selection = ""
		selection match{
			case "One" => println("You selected option one!")
			case "Two" => println("You selected option two!")
			case _ => println("You Selected Something else:")
		}
	}	
}
