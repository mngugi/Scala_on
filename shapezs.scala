trait Shape

case class Triangle(a: Int, b: Int, c: Int) extends Shape

case class Rectangle(h: Int, w: Int) extends Shape

case class Square(side: Int) extends Shape

object Main extends App {
  val triangle = Triangle(3, 4, 5)
  val rectangle = Rectangle(4, 6)
  val square = Square(5)

  println(s"Triangle: a = ${triangle.a}, b = ${triangle.b}, c = ${triangle.c}")
  println(s"Rectangle: h = ${rectangle.h}, w = ${rectangle.w}")
  println(s"Square: side = ${square.side}")
}
