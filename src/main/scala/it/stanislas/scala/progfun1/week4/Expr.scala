package it.stanislas.scala.progfun1.week4

/**
  * Created by stanislas on 20/12/2016.
  */
trait Expr {
  def eval: Int = this match {
    case Number(n) => n
    case Sum(l, r) => l.eval + r.eval
  }

  def show: String = {
    def parenthesis(e: Expr):String = e match {
      case Sum(_, _) => "("+ e.show + ")"
      case _ => e.show
    }

    this match {
      case Number(x) => x.toString
      case Sum(l, r) => l.show + " + " + r.show
      case Var(v) => v
      case Prod(l ,r) => parenthesis(l) + " * " + parenthesis(r)
    }
  }
}
case class Number(n: Int) extends Expr
case class Sum(l: Expr, r: Expr) extends Expr
case class Var(v: String) extends Expr
case class Prod(l: Expr, r: Expr) extends Expr
