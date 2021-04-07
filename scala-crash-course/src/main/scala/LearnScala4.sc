// Data Structure

// Tuples
// Immutable lists
val captainStuff = ("Picard", "Enterprise-D", "NCC-1781-D")
println(captainStuff)

// Refer to the individual fields with a ONE-BASED index
println(captainStuff._1)
println(captainStuff._2)
println(captainStuff._3)

val picardShip = "Picard" -> "Enterprise-D"
println(picardShip._2)

val aBunchOfStuff = ("Kirk", 1964, true)
println(aBunchOfStuff)

// List
// Like a tuple, but more functionality
// Must be of some type
val shipList = List("Enterprise", "Defiant", "Voyager","Deep Space Nine")
println(shipList)
println(shipList(1)) //zero based
println(shipList.head)
println(shipList.tail)

for (ship <- shipList) { println(ship) }

// Map would apply a function to every single element in the list
val backwardShip = shipList.map( (ship: String) => { ship.reverse})
for (ship <- backwardShip) { println(ship)}

// reduce() to combine together all the items in a collection using some function
val numberList = List(1, 2, 3, 4, 5)
// reduce is going to through every element in the list and run some function on it, and accumulate the result of it
val sum = numberList.reduce( (x: Int, y:Int) => x + y)
println(sum)

// filter() removed stuff
val iHateFives = numberList.filter(( x:Int) => x != 5)
val iHateThrees = numberList.filter( _ !=3 )

// concatenate Lists
val moreNumbers = List(6,7,8)
val lotsOfNumbers = numberList ++ moreNumbers

// reverse a list
val reversed = numberList.reverse

// sorted
val sorted = reversed.sorted

// duplicates
val lotsOfDuplicate = numberList ++ numberList

//distinct
val distinctValues = lotsOfDuplicate.distinct

val maxValue = numberList.max
val sumValue = numberList.sum
val hasThree = iHateThrees.contains(3)

// MAPS
val shipMap = Map("Kirk" -> "Enterprise", "Picard" -> "Enterprise-D", "Janeway" -> "Voyager", "Sisko" -> "Deep Sea Nine")
println(shipMap("Janeway"))
println(shipMap.contains("Archer"))
val archersShip = util.Try(shipMap("Archer")) getOrElse "Unknown"
println(archersShip)