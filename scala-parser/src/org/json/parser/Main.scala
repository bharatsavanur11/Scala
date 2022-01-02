package org.json.parser


/**
 * @author bsavan
 */
object Main {
  
  def main(args:Array[String]): Unit = {
    var patternMatcher = ErrorPatternMatching();
    var tokens =FileOpsCreator().readSchemaFile("src/Error.log");
    for(token <- tokens){
        if(patternMatcher.checkForException(token,"Exception")){
          println(token);  
        }
        
        
    }
       
  }
}