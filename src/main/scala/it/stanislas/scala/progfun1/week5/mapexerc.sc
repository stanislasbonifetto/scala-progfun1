object mapexerc {
  def scaleList(xs: List[Double], factor: Double) =
    xs map (x => x * factor)

  def squareList(xs: List[Int]): List[Int] = xs match {
    case Nil => Nil
    case y :: ys => y * y :: squareList(ys)
  }

  def squareListMap(xs: List[Int]): List[Int] =
    xs map (y => y * y)

}