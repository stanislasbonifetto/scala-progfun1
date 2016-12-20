package it.stanislas.scala.progfun1.week4

/**
  * Created by stanislas on 19/12/2016.
  */
trait List[T] {
  def isEmpty: Boolean
  def head: T
  def tail: List[T]

}
class Cons[T](val head: T, val tail: List[T]) extends List[T] {
  def isEmpty = false
}
class Nil[T] extends List[T]{
  def isEmpty = true
  def head = throw new NoSuchElementException("Nil.head")
  def tail = throw new NoSuchElementException("Nil.tail")
}