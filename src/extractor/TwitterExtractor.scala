package extractor

import scala.collection.JavaConverters.asScalaBufferConverter

import factory.MyTwitterFactory
import twitter4j.Twitter
import twitter4j.User

class TwitterExtractor {
  val twitter: Twitter = MyTwitterFactory.twitter
  
  def areFriends( fu: User, su: User ): Boolean = {
    
    for( user <- List(fu, su) ) {
      val id = user.getScreenName()
      val followers = twitter.getFollowersList( id, 1 ).asScala
      val friends = twitter.getFriendsList( id, 1 ).asScala
      
      println( "Follower count: "+user.getFollowersCount)
      println( "Friends count: "+user.getFriendsCount )
      println( "Followers: " + followers.length )
      println( "Friends: "+ friends.length )
    }
    false
  }
  
  def lookFor( user: User ): Unit = {
    val id = user.getScreenName
    val followers = twitter.getFollowersList( id, 1).asScala
    val friends = twitter.getFriendsList( id, 1).asScala
    
    // val followers = twitter.getFriendsIDs(fu.getScreenName, 10).getIDs()
    
    println( "Follower count: "+user.getFollowersCount)
    println( "Friends count: "+user.getFriendsCount )
    println( "Followers: " + followers.length )
    println( "Friends: "+ friends.length )
  }
  
  def getMatches( username: String ) = {
    twitter.searchUsers(username, 1).asScala
  }
  
  def getBestMatch( username: String ): User = {
    getMatches( username ).head
  }
}