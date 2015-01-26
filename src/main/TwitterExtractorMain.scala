package main

import extractor.TwitterExtractor

object TwitterExtractorMain {
  def main(args: Array[String]): Unit = {
    val names: List[Tuple2[String, String]] = List( ("Apache Spark", "Juice Reply") )
    
    val extractor = new TwitterExtractor()
    
    for( couple <- names ) {
      val first = couple._1
      val second = couple._2
      
      val firstUser = extractor.getBestMatch( first )
      val secondUser = extractor.getBestMatch( second )
      
      extractor.lookFor(firstUser, secondUser)
      
    }
    
//    val timeline: ResponseList[Status] = twitter.getUserTimeline("ladygaga")
//    println( timeline )
//    
//    val silvi = twitter.searchUsers("Silvio", 10).asScala
//    
//    println( "Found "+silvi.length+" silvi" )
//    
//    val silvio = silvi.head
//    println( silvio )
  }
  
}