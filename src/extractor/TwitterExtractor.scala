package extractor

import scala.collection.JavaConverters._

import factory.MyTwitterFactory
import twitter4j.Twitter
import twitter4j.User

class TwitterExtractor {
  val twitter: Twitter = MyTwitterFactory.twitter
  
  def lookFor( fu: User, su: User ): Boolean = {
    
    for( user <- List(fu, su) ) {
      val id = user.getScreenName()
      val followers = twitter.getFollowersList( id, 10, 5 ).asScala
      val friends = twitter.getFriendsList( id, 10, 5 ).asScala
      
      // val followers = twitter.getFriendsIDs(fu.getScreenName, 10).getIDs()
      
      println( "Follower count: "+user.getFollowersCount)
      println( "Friends count: "+user.getFriendsCount )
      println( "Followers: " + followers.length )
      println( "Friends: "+ friends.length )
    }
    false
  }
  
  def getBestMatch( username: String ): User = {
    val t = twitter.searchUsers(username, 10).asScala
    t.head
  }
}