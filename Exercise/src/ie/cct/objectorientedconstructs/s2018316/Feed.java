package ie.cct.objectorientedconstructs.s2018316;

import java.util.ArrayList;
import java.util.Collection;


import ie.cct.objectorientedconstructs.FeedInterface;
import ie.cct.objectorientedconstructs.FeedItem;


/**
 * 
 * @author 2018316 KyuTae Han
 *
 */
public class Feed implements FeedInterface {

	//private level attributes
	private Collection<String> titles = new ArrayList<String>();
	private FeedItem[] feedItem;
	private int numItems;
	
    /**
     * specified constructor
     * @param feedItem
     * @param numItems
     */
	public Feed(FeedItem[] feedItem, int numItems) {
		
		this.feedItem = feedItem;
		this.numItems = numItems;
	}
	
	@Override
	public Collection<String> listTitles() {
		
		 
		titles.add(feedItem[0].getTitle());
		titles.add(feedItem[1].getTitle());
		titles.add(feedItem[2].getTitle());
		
		return titles;
	}

	@Override
	public FeedItem getItem(String title) {
		// TODO Auto-generated method stub
		return null ;
	}

	@Override
	public int numItems() {
		return this.numItems;
	}

	@Override
	public Collection<FeedItem> findItems(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

}
