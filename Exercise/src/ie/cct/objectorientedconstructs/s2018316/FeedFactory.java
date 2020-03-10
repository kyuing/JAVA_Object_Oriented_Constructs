package ie.cct.objectorientedconstructs.s2018316;

import java.io.BufferedReader;

import java.io.IOException;

import ie.cct.objectorientedconstructs.FeedFactoryInterface;
import ie.cct.objectorientedconstructs.FeedInterface;
import ie.cct.objectorientedconstructs.FeedItem;

/**
 * 
 * @author 2018316 KyuTae Han
 *
 */
public class FeedFactory implements FeedFactoryInterface {

	//private-level attributes
	private Feed feed;
	private FeedItem[] feedItem;
	
	@Override
	public FeedInterface createFeed(BufferedReader in) throws IOException {

		try {
			String line1, line2, line3, line4, line5, line6; //temp strings
			line1 = in.readLine(); //item
			line2 = in.readLine(); //content
			line3 = in.readLine(); //item
			line4 = in.readLine();//content
			line5 = in.readLine();//item
			line6 = in.readLine();//content
			
			feedItem = new FeedItem[3]; //init the array size

			//init the indexes
			feedItem[0] = new FeedItem(line1, line2); 
			feedItem[1] = new FeedItem(line3, line4);
			feedItem[2] = new FeedItem(line5, line6);
			
			//init feed with the feedItem and 3 as parameters
			feed = new Feed(feedItem, 3);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return feed; //return feed.
	}

}
