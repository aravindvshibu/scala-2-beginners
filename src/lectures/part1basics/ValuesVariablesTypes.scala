package lectures.part1basics

/**
  * Created by Daniel on 07-May-18.
  */
object ValuesVariablesTypes extends App {

  val x: Int = 42
  println(x)

  // VALS ARE IMMUTABLE. Dont think of it as constants

  // COMPILER can infer types

  val aString: String = "hello"
  val anotherString = "goodbye" //type of val can be optionally specified. If we specify , 
                                //we have to make sure that its correct. Else compiler will complain

 //Semi colons are not mandatory
  val aBoolean: Boolean = false
  val aChar: Char = 'a' //Single characters are between single quotes
  val anInt: Int = x
  val aShort: Short = 4613 // 2 bytes
  val aLong: Long = 5273985273895237L // L is required. 8 bytes
  val aFloat: Float = 2.0f // f is required
  val aDouble: Double = 3.14 // IMPORTANT . the default is Double when you use decimals

  // variables
  var aVariable: Int = 4

  aVariable = 5 // side effects. 
}
