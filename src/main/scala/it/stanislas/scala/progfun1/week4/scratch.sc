object scratch {
  import it.stanislas.scala.progfun1.week3.Rational

  new Rational(1,2)

  def error(msg: String) = throw new Error(msg)

  val x = null

  val y: String = x

  if(true) 1 else false
}
