object FuncHomeWork extends App {
    """частичное применение"""
  def partApply(f: (Int,Int) => Int, x: Int): Int => Int = f(100,_) + x
  def calc50(i:Int, j: Int):Int = {
    i + j
  }
  println(partApply(calc50,0)(1))
  """композиции"""
  def f(x:Int): Double = x.toDouble
  def g(y:Double): String = y.toString
  def fg = g _ compose f
  def gf = f _ andThen g
  println(fg(2),gf(2))
  """каррирование"""
  def curry(s:(Int,Double) => String):Int => Double => String = s.curried
  def s(s1: Int,s2: Double): String = s1.toString + " + " + s2.toString
  println(curry(s)(3)(3))
}
