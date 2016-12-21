package it.stanislas.scala.progfun1.week4

/**
  * Created by stanislas on 20/12/2016.
  */
trait Expr {
  def eval: Int = this match {
    case Number(n) => n
    case Sum(e1, e2) => e1.eval + e2.eval
  }
}
case class Number(n: Int) extends Expr
case class Sum(e1: Expr, e2: Expr) extends Expr
