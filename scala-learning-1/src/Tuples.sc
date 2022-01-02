import scala.annotation.tailrec

object Tuples {
  println("Welcome to the Scala worksheet")
  
  var (c,d) = (3,4)
  c+1

  @tailrec
  def factWithAcc(n1: Int, acc: Int): Int = {

    if (n1 == 1) return acc;
    else return factWithAcc(acc * n1, n1 - 1)

  }
     
  def main(args :Array[String]){
    println(factWithAcc(4,1));
  }
  
   
   
  }