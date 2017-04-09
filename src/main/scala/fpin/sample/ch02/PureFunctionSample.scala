package fpin.sample.ch02

/**
  * Created by soo on 2017. 4. 2..
  */
object PureFunctionSample extends App {

  val x = new StringBuilder("Hello")
  val r1 = x.append("World").toString()
  val r2 = x.append("World").toString()

  println(r1)
  println(r2)
  println(r1 == r2)
}
