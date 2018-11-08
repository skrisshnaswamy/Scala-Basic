
//def product(x: Int)(implicit y: Int): Int = x * y
def product(implicit x: Int, y: Double): Double = x * y

//implicit val multiplicand: Int = 1
//implicit val multiplier: Int = 2
implicit val multiplicand: Int = 1
implicit val multiplier: Double = 2.0

//product(3)(4)
//product(2)

product(3, 4)
product