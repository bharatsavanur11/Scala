object MyWorksheet {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val a=10                                        //> a  : Int = 10
  
  var c= a+15                                     //> c  : Int = 25
  
  if(a<9) "hi" else ()                            //> res0: Any = ()
  
  val result = a match {
  
    case 0 => "0 Switch"
    case 10 => "10 Switch"
    case _ => "Default"
  	
  }                                               //> result  : String = 10 Switch
  
  def square(x:Double) : Double = {
    return x*x;
  }                                               //> square: (x: Double)Double
  
  def greet(name:String,surname:String):Unit = {
     println(s"Hello, $name $surname");
    
  }                                               //> greet: (name: String, surname: String)Unit
  
  greet("Bharat","Savanur");                      //> Hello, Bharat Savanur
}