package collections

object immutableColl {
 
   Array(1,2,3) // companion Object               //> res0: Array[Int] = Array(1, 2, 3)
   List(1,2,'a')                                  //> res1: List[Int] = List(1, 2, 97)
   List(1,2,"aa")                                 //> res2: List[Any] = List(1, 2, aa)
   
   
   //indexing using ()
   var a = Array(1,2,3)                           //> a  : Array[Int] = Array(1, 2, 3)
   var b = List(1,2,'a')                          //> b  : List[Int] = List(1, 2, 97)
   a(0)                                           //> res3: Int = 1
   a(0).toString                                  //> res4: String = 1
     
   a(0) = 12
   // error for list
   //b(0)= 13

//d to list ( implemented as singly linked list)
  // so adding it at end takes a lot of time
  // if the value is big. prepending is ok
  // as its fast
  
  //(new list is created)
    1::b                                          //> res5: List[Int] = List(1, 1, 2, 97)


  //var arr2 = new Array[String](1000)
  // defaulting.// This is called
  // CURRYING
    var arr3 =  Array.fill(100)(10)               //> arr3  : Array[Int] = Array(10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 1
                                                  //| 0, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 1
                                                  //| 0, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 1
                                                  //| 0, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 1
                                                  //| 0, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 1
                                                  //| 0, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10)
      
    
  //Pass Functin to a Function
  //=> Pass a function itself
  def defArray(i: => Int) : Array[Int] =  Array(i,i,i)
                                                  //> defArray: (i: => Int)Array[Int]
  defArray(util.Random.nextInt(10)+10)            //> res6: Array[Int] = Array(15, 14, 11)
  

  //Pass Same Function By Name and same val
  def defArray1(i:Int) : Array[Int] =  Array(i,i,i)
                                                  //> defArray1: (i: Int)Array[Int]
  defArray1(util.Random.nextInt(10))              //> res7: Array[Int] = Array(2, 2, 2)
  
  
  Vector(1,2,3)                                   //> res8: scala.collection.immutable.Vector[Int] = Vector(1, 2, 3)

}