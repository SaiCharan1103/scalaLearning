object test {
  def getPrintableString(p: Person): String = p match {
    case Student(name, year) =>
      s"$name is a student in Year $year."
    case Teacher(name, whatTheyTeach) =>
      s"$name teaches $whatTheyTeach."
  }
  val s = Student("sai",2017)
  val t = Teacher("Charan","Science")
  getPrintableString(s)
}
