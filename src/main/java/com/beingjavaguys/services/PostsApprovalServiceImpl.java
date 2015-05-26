package com.beingjavaguys.services;

import com.beingjavaguys.dao.PostsApprovalDao;
import com.beingjavaguys.domain.PostsApproval;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PostsApprovalServiceImpl implements PostsApprovalService {
	
	@Autowired
	PostsApprovalDao postsApprovalDao;

	@Override
	public int insertRow(PostsApproval postsApproval) {
		return postsApprovalDao.insertRow(postsApproval);
	}

	@Override
	public List<PostsApproval> getList() {
		return postsApprovalDao.getList();
	}

	@Override
	public PostsApproval getRowById(int id) {
		return postsApprovalDao.getRowById(id);
	}

	@Override
	public int updateRow(PostsApproval postsApproval) {
		return postsApprovalDao.updateRow(postsApproval);
	}

	@Override
	public int deleteRow(int id) {
		return postsApprovalDao.deleteRow(id);
	}

}
