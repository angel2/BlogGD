package com.beingjavaguys.dao;

import com.beingjavaguys.domain.Post;

import java.util.List;

public interface PostDao {
	public int insertRow(Post post);

	public List<Post> getList();

	public List<Post> getListApproval();

	public Post getRowById(int id);

	public int updateRow(Post post);

	public int deleteRow(int id);

	public List<Post> getPostList(int id);

}
