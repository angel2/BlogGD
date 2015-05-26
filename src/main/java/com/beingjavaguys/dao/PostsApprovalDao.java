package com.beingjavaguys.dao;

import com.beingjavaguys.domain.PostsApproval;

import java.util.List;

public interface PostsApprovalDao {
	public int insertRow(PostsApproval postsApproval);

	public List<PostsApproval> getList();

	public PostsApproval getRowById(int id);

	public int updateRow(PostsApproval postsApproval);

	public int deleteRow(int id);

}
