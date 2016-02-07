object caseclassTest {
 
   case class Test(name:String,age:Int)
   
   val t = Test("Bharat",29)                      //> t  : caseclassTest.Test = Test(Bharat,29)
   val t1 = Test("Jitu",29)                       //> t1  : caseclassTest.Test = Test(Jitu,29)
    
   t.equals(t1)                                   //> res0: Boolean = false
   //t.hashCode();
   //t1.hashCode();
}