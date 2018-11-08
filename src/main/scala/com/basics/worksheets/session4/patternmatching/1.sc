
val name = "Alice"

name match {
  case "Alice" => "Hi! This is Alice"
  case "Bob" => "Hiya! This is Bob"
  case "Charlie" => "Hello there! This is Charlie"
  case _ => "Hello to you!"
}

def whoseThere(name: String) = name match {
  case "Alice" => "Hi! This is Alice"
  case "Bob" => "Hiya! This is Bob"
  case "Charlie" => "Hello there! This is Charlie"
  case _ => "Hello to you!"
}

whoseThere("Bob")

// Constant pattern = use literal where all possible cases are known
val isAvailable = true

isAvailable match {
  case true => "Is available"
  case false => "Is NOT available"
}

// Variable pattern


//val urlEndPoint = ("localhost", 8080)
val urlEndPoint = ("google.com", 8080)

urlEndPoint match {
  case ("localhost", _) => s"Connecting to 127.0.0.1"
  case (host, port) => s"Connecting to $host at port $port"
}


// Sequence Pattern - to perform pattern matching on collection
val listCollection = List(2,3)

listCollection match {
  case List(1,2) => s"Trivial list expected"
  case List(1, _*) => s"List sum > 2"
  case 2::3::Nil => s"List sum = 5"
  case List(a, b) => s"List sum = $a + $b"
  case _ => s"100"
}


val any: Any = 4.5

any match {
  case value: Int => s"$value is of datatype Int"
  case value: Double => s"$value is of datatype Double"
  case _ => s"datatype Unknown"
}

