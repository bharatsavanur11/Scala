package types

object newMatchExp {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val aa=10                                       //> aa  : Int = 10
  var i=10                                        //> i  : Int = 10
  val b=2                                         //> b  : Int = 2
   
  aa * b match {
   	case 0 => "Its zero"
   	case 1 => " Its one"
   	case b => " what is tis"
    case i => " None of tis"
  }                                               //> res0: String = " what is tis"
  
  aa match {
   	case 0 => "Its zero"
   	case 1 => " Its one"
    case i => " None of tis"
  }                                               //> res1: String = " None of tis"
  aa match {
   	case 0 => "Its zero"
   	case 1 => " Its one"
    case i => " None of tis"
  }                                               //> res2: String = " None of tis"
 
  aa match {
   	case 0 => "Its zero"
   	case 1 => " Its one"
    case _ => " None of tis"
  }                                               //> res3: String = " None of tis"
 
  aa match {
 	  case 0 => "Its zero"
 	  case 1 => " Its one"
 
  }                                               //> scala.MatchError: 10 (of class java.lang.Integer)
                                                  //| 	at types.newMatchExp$$anonfun$main$1.apply$mcV$sp(types.newMatchExp.scal
                                                  //| a:34)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at types.newMatchExp$.main(types.newMatchExp.scala:3)
                                                  //| 	at types.newMatchExp.main(types.newMatchExp.scala)



}