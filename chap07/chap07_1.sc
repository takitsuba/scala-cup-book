//def gcdLoop(x: Long, y: Long): Long = {
//  var a = x
//  var b = y
//  while (a != 0){
//    val temp = a
//    a = b % a
//    b = temp
//  }
//  b
//}
//
//gcdLoop(12,18)

//
//var line = ""
//do {
//  line = readLine()
//  println("Read: " + line)
//} while (line != "")


def greet() = { println("hi") }

() = greet()


var line = ""
while((line = readLine()) != "")
  println("Read: " + line)

