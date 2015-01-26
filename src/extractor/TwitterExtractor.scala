package extractor

import scala.collection.JavaConverters._

import factory.MyTwitterFactory
import twitter4j.Twitter
import twitter4j.User

class TwitterExtractor {
  val twitter: Twitter = MyTwitterFactory.twitter
  
  def lookFor( fu: User, su: User ): Boolean = {
    println(fu)
    println(su)
    
    val followers = twitter.getFriendsIDs(fu.getId).getIDs()
    
    println( followers.length )
    
    false
  }
  
  def getBestMatch( username: String ): User = {
    val t = twitter.searchUsers(username, 10).asScala
    t.head
  }
}