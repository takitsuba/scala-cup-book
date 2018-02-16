class Rational(n: Int, d: Int){
  require(d != 0)
  //  println("Created" + n + "/" + d

  private val g = gcd(n.abs, d.abs)

  val numer: Int = n / g
  val denom: Int = d / g

  def this(n: Int) = this(n, 1)

  def +(that: Rational): Rational = {
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )
  }
  def +(i: Int): Rational =
    new Rational(numer + i * denom, denom)

  def *(that: Rational): Rational = {
    new Rational(
      numer * that.numer, denom * that.denom
    )
  }

  def *(i: Int): Rational = {
    new Rational(
      numer * i, denom
    )
  }

  override def toString: String = numer + "/" + denom

  def lessThan(that: Rational) =
    this.numer * that.denom < that.numer * this.denom

//  def add(that: Rational): Rational = {
//    new Rational(n * that.d + that.n * d, d * that.d)
//  }

  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)

}

val a = new Rational(2, 3)

val  b = new Rational(5, 6)

a + b

a * b

a + 1

a * 2



//a.add(b)
//
//a add b

a.denom

a.numer

a lessThan b

new Rational(3)


new Rational(24,38)

val r = new Rational(2,3)

//2 * r

implicit def intToRatonal(x: Int) = new Rational(x)

2 * r