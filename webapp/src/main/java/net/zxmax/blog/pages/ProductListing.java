package net.zxmax.blog.pages;

import org.apache.tapestry5.annotations.InjectPage;


/*
 * http://tapestry.apache.org/page-navigation.html#PageNavigation-PageRenderRequests
 * */
public class ProductListing {
	@InjectPage
	private ProductDetails details;
	 
	Object onActionFromSelect(long productId)
	{
	  details.setProductId(productId);
	 
	  return details;
	}
	
}
