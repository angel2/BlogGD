package com.beingjavaguys.services;

import com.beingjavaguys.domain.Post;

import java.util.List;

public interface PostService {
	public int insertRow(Post post);

	public List<Post> getList();

	public Post getRowById(int id);

	public int updateRow(Post post);

	public int deleteRow(int id);

}
