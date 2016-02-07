import scala.annotation.tailrec

object Test {

  @tailrec
  def factWithAcc(n1: Int, acc: Int): Int = {

    if (n1 == 1) return acc;
    else return factWithAcc(acc * n1, n1 - 1)

  }
     
  def main(args :Array[String]){
    println(factWithAcc(4,1));
  }
}