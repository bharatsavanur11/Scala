object Iterator {
 
   new java.io.File(".").getAbsolutePath();       //> res0: String = E:\softwares\scala-SDK-4.1.1-vfinal-2.11-win32.win32.x86_64\ec
                                                  //| lipse\.
                                        
  val source = io.Source.fromFile("TX417945_3591.csv")
                                                  //> source  : scala.io.BufferedSource = non-empty iterator
 // val totalLines  = source.length
  
  //println(source)
  
  case class TempData(stateId:String,year:Int,month:Int,prep:Double,precip:Double)
  
  def parseLines(line:String) : TempData = {
     
	       val p = line.split(",").map(_.trim)
	       TempData(p(0),p(1).toInt,p(2).toInt,if(p(3)==".") 0.0 else p(3).toDouble,if(p(4)=="." ) 0.0 else p(4).toDouble)
  }                                               //> parseLines: (line: String)Iterator.TempData
  
  
  val lines = source.getLines                     //> lines  : Iterator[String] = non-empty iterator
  
  lines.next                                      //> res1: String = Source: MJ Menne CN Williams Jr. RS Vose NOAA National Climat
                                                  //| ic Data Center Asheville NC
  lines.next                                      //> res2: String = "State_id  ,YEAR  ,Month  ,CPRECIP (in),PRECIP (in) "
  
  val  data = lines.map(parseLines).toArray       //> data  : Array[Iterator.TempData] = Array(TempData('417945',1849,1,0.0,0.0), 
                                                  //| TempData('417945',1849,2,0.0,0.0), TempData('417945',1849,3,0.0,0.0), TempDa
                                                  //| ta('417945',1849,4,0.0,0.0), TempData('417945',1849,5,0.0,0.0), TempData('41
                                                  //| 7945',1849,6,0.0,0.0), TempData('417945',1849,7,0.0,0.0), TempData('417945',
                                                  //| 1849,8,0.0,0.0), TempData('417945',1849,9,0.0,6.12), TempData('417945',1849,
                                                  //| 10,0.0,0.3), TempData('417945',1849,11,0.0,5.53), TempData('417945',1849,12,
                                                  //| 0.0,1.22), TempData('417945',1850,1,0.64,0.64), TempData('417945',1850,2,2.7
                                                  //| 1,2.07), TempData('417945',1850,3,4.08,1.37), TempData('417945',1850,4,7.42,
                                                  //| 3.34), TempData('417945',1850,5,10.64,3.22), TempData('417945',1850,6,20.27,
                                                  //| 9.63), TempData('417945',1850,7,23.37,3.1), TempData('417945',1850,8,23.54,0
                                                  //| .17), TempData('417945',1850,9,23.93,0.39), TempData('417945',1850,10,24.74,
                                                  //| 0.81), TempData('417945',1850,11,27.08,2.34), TempData('417945',1850,12,29.9
                                                  //| 8,2.9), TempData('417945
                                                  //| Output exceeds cutoff limit.
  
  println(data)
  
 
  
  
  source.close
  

                                          
}