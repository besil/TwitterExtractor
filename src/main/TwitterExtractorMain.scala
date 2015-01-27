package main

import extractor.TwitterExtractor
import scala.collection.JavaConverters._
import twitter4j.User
import twitter4j.IDs

object TwitterExtractorMain {
  def main(args: Array[String]): Unit = {
    val names: List[Tuple2[String, String]] = List( ("Apache Spark", "Reply Juice") )
    
    val extractor = new TwitterExtractor()
    
//    for( couple <- names ) {
//      val first = couple._1
//      val second = couple._2
//      
//      val firstUser = extractor.getBestMatch( first )
//      val secondUser = extractor.getBestMatch( second )
//      
//      println( extractor.areFriends(firstUser, secondUser) )
//      
//    }
    
    val pontifex = extractor.getBestMatch("pontifex")
    println( pontifex )
    
    
//    val pontifex = extractor.getBestMatch("Pontifex")
//    val matches = extractor.getMatches("Pontifex")
//    for( user <- matches ) {
//      println(user.getName+" -> "+user.getLang)
//    }
//    
//    println( "*** Followers ***") 
//    
//    var cursor = -1
//    var ids: IDs = null
//    
//    ids = extractor.twitter.getFollowersIDs(pontifex.getId)
//    
//    for( id <- ids.getIDs ) {
//      println( id )
//      val user: User = extractor.twitter.showUser(id)
//      println( user )
//    }
//    
    
    
//    var followers = List[User]()
//    val response = extractor.twitter.getFollowersList(pontifex.getId, 1)
//    while( response.hasNext() ) {
//      
//    }
////    var followers = extractor.twitter.getFollowersList(pontifex.getId, 1, 200).asScala.toList
//    followers = followers ::: ( List(pontifex) )
//    println( followers.length )
    
    
    
    
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