//throw new IllegalArgumentException

val n = 2

val half =
  if (n % 2 == 0)
    n / 2
  else
    throw new RuntimeException("n must be even")

import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

try {
  val f = new FileReader("/Users/takizawa/dev/scala/book/cup/chap07/input2.txt")
} catch {
  case ex: FileNotFoundException => println("oooo")
  case ex: IOException => println("wwwwww")
}


val file = new FileReader("/Users/takizawa/dev/scala/book/cup/chap07/input.txt")
try {

} finally {
  file.close()
}

