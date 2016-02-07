package org.json.parser

/**
 * @author bsavan
 */
protected class FileOps {
  
  def readSchemaFile(fileName : String): Array[String] = {
    return io.Source.fromFile(fileName).mkString.split(System.getProperty("line.separator"));
  } 
  
  def returnStringToke(token:String,delimiter:String) : Array[String]={
    return token.split(delimiter);
  }
}

object FileOpsCreator {
     def apply() = {
     val s =new FileOps();
     s;
   }

}
 


