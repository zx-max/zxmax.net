package net.zxmax.blog.pages;

import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.ioc.annotations.Inject;

import net.zxmax.blog.dao.ProductDAO;
import net.zxmax.blog.datamodel.Product;

class ProductDetails {
	@Inject
	private ProductDAO dao;
	 
	private Product product;
	 
	@Persist
	private long productId;
	 
	public void setProductId(long productId) { this.productId = productId; }
	 
	void onActivate()
	{
	  product = dao.getById(productId);
	}
}