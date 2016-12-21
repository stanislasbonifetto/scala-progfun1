import it.stanislas.scala.progfun1.week4._

object exprs {




  Sum(Number(1), Number(5)).show

  Sum(Prod(Number(2), Var("x")), Var("y")).show

  Prod(Sum(Number(2), Var("x")), Var("y")).show
}