package it.stanislas.scala.progfun1.week3

/**
  * Created by stanislas on 19/12/2016.
  */
class Rational(x: Int, y: Int){
  require(y != 0, "denominator must be nonzero")

  def this(x: Int) = this(x, 1)

  private def gcd(a: Int, b: Int): Int = if(b==0) a else gcd(b, a % b)

  def numer = x
  def denom = y

  def < (that: Rational) = this.numer * that.denom < that.numer * this. denom

  def max(that: Rational) = if(this < that) that else this


  def + (that: Rational) =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )

  def unary_- : Rational = new Rational(-numer, denom)

  def - (that: Rational) = this + -that

  override def toString = {
    val g = gcd(numer, denom)
    numer/g + "/" + denom/g
  }

}
