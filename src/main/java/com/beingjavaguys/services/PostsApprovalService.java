package com.beingjavaguys.services;

import com.beingjavaguys.domain.PostsApproval;

import java.util.List;

public interface PostsApprovalService {
	public int insertRow(PostsApproval postsApproval);

	public List<PostsApproval> getList();

	public PostsApproval getRowById(int id);

	public int updateRow(PostsApproval postsApproval);

	public int deleteRow(int id);

}
