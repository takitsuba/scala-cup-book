val thrill = List("Will","fill","until")

thrill.last

thrill.length

thrill.map(s => s+"y")

thrill.mkString(",")

thrill.filterNot(s => s.length == 4)

thrill.reverse

thrill.sortWith((s,t) => s.charAt(0).toLower < t.charAt(0).toLower)

thrill.tail


val pair = (99, "Luftbaloons")
println(pair._1)
println(pair._2)

var jetSet = Set("Boeing", "Airbus")
jetSet += "Lear"
println(jetSet.contains("Cessana"))

jetSet(1)

