import collection.mutable
object Lists{
	def main(args: Array[String]){

		val list1 = List(1,2,3)
		val list2 = List("a",2,true)
		val mlist = mutable.ArrayBuffer("a","b","c")

		val firstItem = list1(0)

		mlist(0) = "d"
		mlist
// Concatenation using the ++ operator
		list1 ++ list2
		list1 ::: list2
//prepending an item using either :: (lists only) or +:

		0::list1
		0 +: list1
		//appending an item using :+(not effiecient for immutable list)

		list1 :+ 4

		//Removing elements from mutable list

		mlist -= "c"
		mlist

		//removes e and f from the list itself
		mlist -- List("e","f")

		mlist

		//Adding elements to mutable list only

		mlist += "e"
		mlist ++= List("e","f")

		mlist

		val diffList = List(1,2,3,4,5) diff List(2,3)

		val personList = List(("Alice",1), ("Bob",2),("Carrol",3))

	}
}