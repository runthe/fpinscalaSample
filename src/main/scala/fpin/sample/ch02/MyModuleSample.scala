package fpin.sample.ch02

class MyModuleSample {


  def factorial(n: Int): Int = {
    @annotation.tailrec
    def go(n: Int, acc: Int): Int =
      if (n <= 0) acc
      else go(n - 1, n * acc)

    go(n, 1)
  }

  def fibonacci(n: Int): Int = {
    @annotation.tailrec
    def loop(n: Int, prev: Int, cur: Int): Int =
      if (n == 0) prev
      else loop(n - 1, cur, prev + cur)

    loop(n, 0, 1)
  }

  def formatResult(name: String, n: Int, f: Int => Int): String = {
    val msg = "The $s of %d is %d."
    msg.format(name, n, f(n))
  }

  def findFirst[A](as: Array[A], p: A => Boolean): Int = {
    @annotation.tailrec
    def loop(n: Int): Int =
      if (n >= as.length) -1
      // If the function `p` matches the current element,
      // we've found a match and we return its index in the array.
      else if (p(as(n))) n
      else loop(n + 1)

    loop(0)
  }

  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
    @annotation.tailrec
    def loop(n: Int): Boolean = {
      if (n >= as.length - 1) true
      else if (ordered(as(n), as(n + 1))) false
      else loop(n + 1)
    }

    loop(0)
  }
}
