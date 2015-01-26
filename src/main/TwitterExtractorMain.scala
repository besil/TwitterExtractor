package main

import scala.collection.JavaConverters._
import twitter4j.ResponseList
import twitter4j.Status
import twitter4j.TwitterFactory
import twitter4j.conf.ConfigurationBuilder
import auth.AuthKeys

object TwitterExtractorMain {
  def main(args: Array[String]): Unit = {
    val cb: ConfigurationBuilder = new ConfigurationBuilder()
    cb.setDebugEnabled(true)
      .setOAuthConsumerKey( AuthKeys.consumerKey )
      .setOAuthConsumerSecret( AuthKeys.consumerSecret )
      .setOAuthAccessToken( AuthKeys.accessToken )
      .setOAuthAccessTokenSecret( AuthKeys.tokenSecret )
     
    val twitter = new TwitterFactory(cb.build()).getInstance
    
    val timeline: ResponseList[Status] = twitter.getUserTimeline("ladygaga")
    println( timeline )
    
    val silvi = twitter.searchUsers("Silvio", 10).asScala
    
    println( "Found "+silvi.length+" silvi" )
    
    val silvio = silvi.head
    println( silvio )
    
    
  }
}