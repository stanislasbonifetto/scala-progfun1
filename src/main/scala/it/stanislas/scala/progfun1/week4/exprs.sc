import it.stanislas.scala.progfun1.week4._

object exprs {
  def show(e: Expr):String = e match {
    case Number(x) => x.toString
    case Sum(l, r) => show(l) + " + " + show(r)
  }

  show(Sum(Number(1), Number(5)))
}