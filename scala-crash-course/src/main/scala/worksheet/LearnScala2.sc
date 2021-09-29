// Flow control

// if / else
if (1 > 3) println("Impossible") else println("The world make sense")
if (1 > 3) {
  println("Impossible")
  println("Really?")
}else {
  println("The world makes senses.")
  println("stil.")
}


// Matching
val number = 30
number match {
  case 1 => println("one")
  case 2 => println("two")
  case 3 => println("three")
  case _ => println("Something else")
}

/**
 * Scala Control
 */

//for loop
for (x <- 1 to 4) {
  val squared = x * x
  println(squared)
}

//while
var x = 10
while (x >= 0) {
  println(x)
  x -= 1
}

//do while
x=0
do { println(x); x+= 1} while (x<=10)


/**
 * Expression
 */
{ val x = 10; x + 20}
println({ val x= 10; x+ 20} )

// EXERCISE
// Write some code that prints out the first 10 values of the Fibonacci sequence
// This is the sequence where very number is the sum of the two numbers before it
// So, the result should be 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
