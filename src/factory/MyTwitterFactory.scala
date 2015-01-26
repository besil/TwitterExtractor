package factory

import twitter4j.conf.ConfigurationBuilder
import twitter4j.TwitterFactory
import auth.AuthKeys

object MyTwitterFactory {
	val twitter = {
			val cb: ConfigurationBuilder = new ConfigurationBuilder()
    	cb.setDebugEnabled(true)
    	.setOAuthConsumerKey( AuthKeys.consumerKey )
    	.setOAuthConsumerSecret( AuthKeys.consumerSecret )
    	.setOAuthAccessToken( AuthKeys.accessToken )
    	.setOAuthAccessTokenSecret( AuthKeys.tokenSecret )

	    new TwitterFactory(cb.build()).getInstance
	}
}