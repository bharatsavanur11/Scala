object Collections {
  
  val arr = Array(1,2,3)                          //> arr  : Array[Int] = Array(1, 2, 3)
  
  arr(2) =112
  
  var arr2 = Array(5,6,8)                         //> arr2  : Array[Int] = Array(5, 6, 8)
  
  arr++arr2                                       //> res0: Array[Int] = Array(1, 2, 112, 5, 6, 8)
  
  arr:+4                                          //> res1: Array[Int] = Array(1, 2, 112, 4)
  
  val lst = List(1,1,2)                           //> lst  : List[Int] = List(1, 1, 2)
  
  1::lst                                          //> res2: List[Int] = List(1, 1, 1, 2)
  
  
  val st1 = "Bha"                                 //> st1  : String = Bha
  val st2 = "rat"                                 //> st2  : String = rat
  
  (st1).++(st2)                                   //> res3: String = Bharat
  
  (st1).++:(st2)                                  //> res4: String = ratBha
  Vector(1,2,3)                                   //> res5: scala.collection.immutable.Vector[Int] = Vector(1, 2, 3)
  
  import collection.mutable
  
  mutable.Buffer(1,2,3)                           //> res6: scala.collection.mutable.Buffer[Int] = ArrayBuffer(1, 2, 3)
  
  1 to 10 by 3                                    //> res7: scala.collection.immutable.Range = Range(1, 4, 7, 10)
  
  (1).+(2)                                        //> res8: Int(3) = 3
  
  arr.view                                        //> res9: scala.collection.mutable.IndexedSeqView[Int,Array[Int]] = SeqView(...)
                                                  //| 
  
  
  //val ar1r= new Array[String](1000)
  
  val a1rr2 = List.fill(10)("bharat")             //> a1rr2  : List[String] = List(bharat, bharat, bharat, bharat, bharat, bharat,
                                                  //|  bharat, bharat, bharat, bharat)
  
  def littleArray( i : Int) : Array[Int] = Array(i,i,i)
                                                  //> littleArray: (i: Int)Array[Int]
    
  littleArray(util.Random.nextInt(11))            //> res10: Array[Int] = Array(8, 8, 8)
  
  
  val as = Array.tabulate(10)(i => i*i)           //> as  : Array[Int] = Array(0, 1, 4, 9, 16, 25, 36, 49, 64, 81)
  
  mutable.Buffer(1 to 10 by 2)                    //> res11: scala.collection.mutable.Buffer[scala.collection.immutable.Range] = A
                                                  //| rrayBuffer(Range(1, 3, 5, 7, 9))
  
 }