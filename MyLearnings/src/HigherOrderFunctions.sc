object HigherOrderFunctions {
 
   val a = Array(1,2,3,4,5)                       //> a  : Array[Int] = Array(1, 2, 3, 4, 5)
   val b= List(9,2,3,4)                           //> b  : List[Int] = List(9, 2, 3, 4)
 //  val c = Vector.tablulate(10)(i => i*i)
 
   //a.foreach(println);
   a.map(i => i*2)                                //> res0: Array[Int] = Array(2, 4, 6, 8, 10)
   a.map(_*3)                                     //> res1: Array[Int] = Array(3, 6, 9, 12, 15)
   a.filter(_<2)                                  //> res2: Array[Int] = Array(1)
   a.map(i =>b.take(i)).flatten                   //> res3: Array[Int] = Array(9, 9, 2, 9, 2, 3, 9, 2, 3, 4, 9, 2, 3, 4)
   b.exists(_>3)                                  //> res4: Boolean = true
   
   a.reduceLeft((x,y) => x+y)                     //> res5: Int = 15
   a.reduceLeft(_+_)                              //> res6: Int = 15
   
   b.find(_%3==0).map(_/3)                        //> res7: Option[Int] = Some(3)
}