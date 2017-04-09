package fpin.sample.ch02

/**
  * Created by soo on 2017. 4. 2..
  */
object MainSample {

  def main(args: Array[String]): Unit = {
    val myModuleSample = new MyModuleSample()
    println(myModuleSample.factorial(3))
    //println(myModuleSample.formatResult("Fibonacci", 3, myModuleSample.fibonacci))
    println(myModuleSample.findFirst(Array("haha", "kaka", "nana", "lala"), (p: String) => p == "lala"))
    println(myModuleSample.isSorted(Array("haha", "kaka", "nana", "lala"), (p: String, p1: String) => p.compareTo(p1) > 0))

  }
}
