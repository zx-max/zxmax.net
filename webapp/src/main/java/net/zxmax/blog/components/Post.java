package net.zxmax.blog.components;

import net.zxmax.blog.services.PostService;

public class Post {

	public String getPostContent() {
		
		PostService postService = new PostService();
		
		net.zxmax.blog.datamodel.Post post = postService.getPost();
		
		String postContent = "post.getContent()___ " + post.getContent() + "  ___post.getContent()";


		return postContent;
	}
}
