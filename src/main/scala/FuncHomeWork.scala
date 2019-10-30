object FuncHomeWork extends App {
    /*частичное применение*/
  def partApply(f: (Int,Int) => Int, x: Int): Int => Int = f(_,4) - x
  val partial = partApply(_ + _,2)
  val result = partial(3)
  println(result)
  /*композиции*/
  def f(x:Int): Double = x.toDouble
  def g(y:Double): String = y.toString
  def fg = g _ compose f
  println(fg(2))
  /*каррирование*/
  def curry(s:(Int,Double) => String):Int => Double => String = s.curried
  def s(s1: Int,s2: Double): String = s1.toString + " + " + s2.toString
  println(curry(s)(3)(3))
}
