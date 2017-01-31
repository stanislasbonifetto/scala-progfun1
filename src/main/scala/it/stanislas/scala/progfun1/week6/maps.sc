object maps {
  val romanNumerals = Map("I" -> 1, "V" -> 5, "X" -> 10)
  val capitalOfCountry = Map("US" -> "Washington", "Switzerland" -> "Bern")

  capitalOfCountry get "Andorra"
  capitalOfCountry get "US"

  def showCapital(country: String):String = capitalOfCountry get country match {
    case None => "missing data"
    case Some(capital) => capital
  }

  showCapital("US")
  showCapital("Andorra")

  val fruit = List("apple", "pear", "orange", "pineapple")
  fruit sortWith(_.length < _.length)
  fruit sorted

  fruit groupBy(_.head)
}