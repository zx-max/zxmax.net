package net.zxmax.blog.services;

import net.zxmax.blog.datamodel.Post;

public class PostService {

	public Post getPost(){
		Post post = new Post();
		post.setContent(null);
		return post;
		
	}
}
