package lectures.part1basics

/**
  * Created by Daniel on 07-May-18.
  */
object Expressions extends App {

  val x = 1 + 2 // EXPRESSION . 1+2 is an expression
  println(x)

  println(2 + 3 * 4)
  // + - * / & | ^ << >> >>> (right shift with zero extension)
 // >>> is specific to Scala

  println(1 == x)
  // == != > >= < <=

  println(!(1 == x))
  // ! && ||

 // changing vars is called SIDE EFFECTS
  var aVariable = 2
  aVariable += 3 // also works with -= *= /= ..... side effects
  println(aVariable)

  // Instructions (DO) vs Expressions (VALUE)
 // In scala /functional language we will think in terms of expression unlike instructions in case of imperative language
 // like python or scala
  // IF expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3 // IF EXPRESSION
  println(aConditionedValue)
  println(if(aCondition) 5 else 3) //SUPER IMPORTANT !!!
  println(1 + 3)

  var i = 0
  val aWhile = while (i < 10) {
    println(i)
    i += 1
  }

  // NEVER WRITE LOOPS
 // Looping is specific to imperative languages like Python and java

  // EVERYTHING in Scala is an Expression!

  val aWeirdValue = (aVariable = 3) // Unit === void
  println(aWeirdValue)
 // () --> represents units

  // side effects: println(), whiles, reassigning

  // Code blocks

  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }
 // Code block is an expression. The value of the whole block is the last value of the code block
// The values inside code block is !!not visible!!
 outside
  // 1. difference between "hello world" vs println("hello world")? ANS -> String and Unit
  // 2.

  val someValue = {
    2 < 3
  }
  println(someValue) // true

  val someOtherValue = {
    if(someValue) 239 else 986
    42
  }
  println(someOtherValue)// 42


}
