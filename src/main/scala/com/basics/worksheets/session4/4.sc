
case class Rational(n: Int, d: Int){

  def +(that: Rational) = {
   Rational(this.n * that.d + that.n * this.d, this.d * that.d)
  }

  def +(value: Int): Rational = Rational(value, 1) + this

  override def toString = s"$n/$d"
}

object Rational {
  implicit def intToRational(x: Int) =
    Rational(x, 1)

  implicit def RationalToDouble(r: Rational) =
    r.n.toDouble / r.d.toDouble
}

val half = Rational(1,2)
val twoHalf = Rational(2,2)


half + twoHalf
//half + 1
//1 + half

//val total: Double = 1 + half


//Map(1 -> "one")