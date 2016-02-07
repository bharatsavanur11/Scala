package types

/**
 * @author bsavan
 */

object ifTypes {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  var a = 10                                      //> a  : Int = 10
  
  var b =10.0                                     //> b  : Double = 10.0
  
  if(a >9) true else false                        //> res0: Boolean = true
  
  
  var value = if(a%3==0) a/2 else a/3             //> value  : Int = 3
  var value2 = if(b%4==0) b/2 else b/3            //> value2  : Double = 3.3333333333333335
  var value3 = if(b%4==0) b/2 else "asd"          //> value3  : Any = asd
  
}