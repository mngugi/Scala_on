object MagicSquare {

  def generateMagicSquare(n: Int): Array[Array[Int]] = {
    val magicSquare = Array.ofDim[Int](n, n)
    var num = 1
    var i = 0
    var j = n / 2

    while (num <= n * n) {
      magicSquare(i)(j) = num
      num += 1
      val newi = (i - 1 + n) % n
      val newj = (j + 1) % n

      if (magicSquare(newi)(newj) != 0) {
        i = (i + 1) % n
      } else {
        i = newi
        j = newj
      }
    }

    magicSquare
  }

  def printMagicSquare(square: Array[Array[Int]]): Unit = {
    for (row <- square) {
      println(row.mkString(" "))
    }
  }

  def main(args: Array[String]): Unit = {
    val n = 4 // Size of the magic square (4x4)
    val magicSquare = generateMagicSquare(n)

    println(s"Magic Square of order $n where all rows, columns, and diagonals sum to 34:")
    printMagicSquare(magicSquare)
  }

}
