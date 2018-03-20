package net.zxmax.blog.dao;

import net.zxmax.blog.datamodel.Product;

public class ProductDAO {

	public Product getById(long productId) {
		Product product = new Product(productId);
		return product;
	}

}
