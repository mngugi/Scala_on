object StudentDetails {
  def main(args: Array[String]): Unit = {
    // Define some sample student data
    val students = List(
      ("Alice", 20, "A"),
      ("Bob", 21, "B"),
      ("Charlie", 22, "C"),
      ("David", 19, "A")
    )

    // Print headers
    println("Name\tAge\tGrade")
    println("=====================")

    // Iterate through the list and print each student's details
    for ((name, age, grade) <- students) {
      println(s"$name\t$age\t$grade")
    }
  }
}
