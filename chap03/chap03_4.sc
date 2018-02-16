def printArgs(args: Array[String]): Unit = {
  var i = 0
  while (i < args.length){
    println(args(i))
    i += 1
  }
}

printArgs(Array("hoge","fuga"))


def printArgs2(args: Array[String]): Unit = {
  for(arg <- args)
    println(arg)
}

def printArgs3(args: Array[String]): Unit = {
  args.foreach(println)
}

printArgs3(Array("hoge","hoge"))

def formatArgs(args: Array[String]) = args.mkString("\n")

formatArgs(Array("hoho","gege"))

println(formatArgs(Array("hoho","gege")))