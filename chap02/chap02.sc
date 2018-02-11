1 + 2

println("Hello world")

val msg = "Hello world"

val msg2: java.lang.String = "Hello again"

val msg3: String = "Hello Hello"

println(msg)

//msg = "Goodbye cruel"

var greeting = "Hello world yeah"

greeting = "Leave me alone"

val multiLine =
  "This is the Next Line"

//val oops =
//
//

def max(x: Int, y: Int): Int = {
  if (x>y) x
  else y
}

// 結果型は推論してくれる
def max2(x: Int, y: Int) = if (x>y) x else y

max(3,5)

max2(3,5)

//Unit型は関数が意味のある値を返してないことを示す
// 副作用のために実行される
def greet() = println("Hello world")

greet()

