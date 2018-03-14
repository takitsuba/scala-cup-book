val greetStrings = new Array[String](3)

for (i <- 0 to 2)
  println(greetStrings(i))



var a: Int = 0
println(a)

0.+(2)

greetStrings(0) = "Hello"

greetStrings

greetStrings.update(1,"Yeah")

greetStrings

val numNames = Array("zero", "one", "two")

val numNames2 = Array("three","four", "five")


val oneTwoThree = List(1,2,3)

//oneTwoThree(0) = 4
//oneTwoThree

val oneTwo = List(1,2)
val threeFour = List(3,4)
val oneTwoThreeFour = oneTwo ::: threeFour

val twoThree = List(2,3)
val oneTwoThree2 = 1 :: twoThree

val oneTwoThree3 = 1 :: 2 :: 3 :: Nil
println(oneTwoThree3)


List()

Nil

List("Cool", "tools", "rule")

val thrill = "Will" :: "fill" :: "until" :: Nil

List("a","b") ::: List("c","d")

List("a","b") :: List("c","d")

thrill(2)

thrill.count(s => s.length == 4)

thrill.drop(2)

thrill.dropRight(2)

//thrill.exists(s => s == "until")
thrill.contains("until")

thrill.filter(s => s.length == 4)

thrill.forall(s => s.endsWith("l"))

thrill.foreach(s => println(s))

thrill.foreach(print)

thrill.head

thrill.init

thrill.isEmpty

0.to(2)

