object packexerc {

  def pack[T](xs: List[T]): List[List[T]] = xs match {
    case Nil => Nil
    case x :: xsl =>
      val(pre, rest) = xs span(y => y==x)
      pre :: pack(rest)
  }

  def encode[T](xs: List[T]): List[(T, Int)] =
    pack(xs) map (ys => (ys.head, ys.length))

  val data = List("a","a","a","b","c","c","a")
  pack(data)
  encode(data)
}