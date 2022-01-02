package org.json.parser

/**
 * @author bsavan
 */

protected class ErrorPatternMatching {
  
  def checkForException(stringTok : String,searchString:String) :  Boolean={
    if(stringTok.contains(searchString))return true;
    else return false;
  } 
}  

object ErrorPatternMatching{
    def apply()={
      new ErrorPatternMatching();
    }
  }
