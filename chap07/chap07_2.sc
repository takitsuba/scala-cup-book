val filesHere = (new java.io.File(".")).listFiles

//for (file <- filesHere)
//  println(file)
//
//
//for (i <- 1 to 4)
//  println("Iteration" + i)
//
//for (i <- 1 until 4)
//  println(i)
//
//for (i <- 0 to filesHere.length - 1)
//  println(filesHere(i))
//
//
//for (file <- filesHere if file.getName.endsWith(".sh"))
//  println(file)
//
//for (file <- filesHere)
//  if (file.getName.endsWith(".sh"))
//    println(file)


def fileLines(file: java.io.File) =
  scala.io.Source.fromFile(file).getLines().toList

def grep(pattern: String) =
  for (
    file <- filesHere if file.getName.endsWith(".sh");
    line <- fileLines(file) if line.trim.matches(pattern)
  ) println(file+": " + line.trim)

grep(".*")

def shfiles =
  for {
    file <- filesHere
    if file.getName.endsWith(".sh")
  } yield file

shfiles




