fun linearSearch(list:List<Any>, key:Any):Int?{
	for ((index, value) in list.withIndex()) {
		if (value == key){
			return index
		}
	}
	return null
}
fun main(args: Array<String>) {
    println("\nOrdered list:")
    val someList = listOf(0,1,2,8,13,17,19,32,42)
    println(someList)
    val find = 8
    val position = linearSearch(someList, find)
    println("${find} is in the position ${position} in the ordered List.\n")

    val find2 = 32
    val position2 = linearSearch(someList, find2)
    println("${find2} is in the position ${position2} in the ordered List.\n")
}