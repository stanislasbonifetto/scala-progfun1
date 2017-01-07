object listmethods {
  def last[T](xs: List[T]): T = xs match {
    case List() => throw new Error("last of a empty list")
    case List(x) => x
    case y :: ys => last(ys)
  }

  def init[T](xs: List[T]): List[T] = xs match {
    case List() => throw new Error("last of a empty list")
    case List(x) => List()
    case y :: ys => y :: init(ys)
  }

  def concat[T](xs: List[T], ys: List[T]): List[T] = xs match {
    case List() => ys
    case z :: zs => z :: concat(zs, ys)
  }

  def reverse[T](xs: List[T]): List[T] = xs match {
    case List() => List()
    case y :: ys => reverse(ys) ++ y
  }

  def removeAt[T](n: Int, xs: List[T]): List[T]= (xs take n) ::: (xs drop n+1)
}