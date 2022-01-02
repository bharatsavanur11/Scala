object SecondWorksheet {

  def factorial(n:Int):Int = {
    if(n<2) 1
    else n * factorial(n-1)
  }                                               //> factorial: (n: Int)Int

  factorial(5)                                    //> res0: Int = 120

  def estimatePi(n: Int): Double = {

    def helper(n: Int): Double = {

      if (n < 1) 0 else {

        val x = math.random
        val y = math.random
        (if (x * x + y * y < 1) 1 else 0) + helper(n - 1)
      }

    }

    helper(n) / n * 4
  }                                               //> estimatePi: (n: Int)Double

   estimatePi(10344)                              //> java.lang.StackOverflowError
                                                  //| 	at java.util.Random.nextDouble(Unknown Source)
                                                  //| 	at java.lang.Math.random(Unknown Source)
                                                  //| 	at scala.math.package$.random(package.scala:29)
                                                  //| 	at SecondWorksheet$$anonfun$main$1.helper$1(SecondWorksheet.scala:16)
                                                  //| 	at SecondWorksheet$$anonfun$main$1.helper$1(SecondWorksheet.scala:18)
                                                  //| 	at SecondWorksheet$$anonfun$main$1.helper$1(SecondWorksheet.scala:18)
                                                  //| 	at SecondWorksheet$$anonfun$main$1.helper$1(SecondWorksheet.scala:18)
                                                  //| 	at SecondWorksheet$$anonfun$main$1.helper$1(SecondWorksheet.scala:18)
                                                  //| 	at SecondWorksheet$$anonfun$main$1.helper$1(SecondWorksheet.scala:18)
                                                  //| 	at SecondWorksheet$$anonfun$main$1.helper$1(SecondWorksheet.scala:18)
                                                  //| 	at SecondWorksheet$$anonfun$main$1.helper$1(SecondWorksheet.scala:18)
                                                  //| 	at SecondWorksheet$$anonfun$main$1.helper$1(SecondWorksheet.scala:18)
                                                  //| 	at SecondWorksheet$$anonfun$main$1.helper$1(SecondWorksheet.scala:18)
                                                  //| 	at SecondWorksheet$$anonfun$main$1.helper$1(Sec
                                                  //| Output exceeds cutoff limit.
 }