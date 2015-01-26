package main

import scala.collection.JavaConverters.asScalaBufferConverter

import factory.MyTwitterFactory
import twitter4j.ResponseList
import twitter4j.Status
import twitter4j.Twitter

object TwitterExtractorMain {
  def main(args: Array[String]): Unit = {
    val twitter: Twitter = MyTwitterFactory.twitter
    
    val timeline: ResponseList[Status] = twitter.getUserTimeline("ladygaga")
    println( timeline )
    
    val silvi = twitter.searchUsers("Silvio", 10).asScala
    
    println( "Found "+silvi.length+" silvi" )
    
    val silvio = silvi.head
    println( silvio )
    
    
  }
}