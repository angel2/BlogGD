package com.beingjavaguys.services;

import com.beingjavaguys.dao.PostDao;
import com.beingjavaguys.domain.Post;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PostServiceImpl implements PostService {
	
	@Autowired
	PostDao postDao;

	@Override
	public int insertRow(Post post) {
		return postDao.insertRow(post);
	}

	@Override
	public List<Post> getList() {
		return postDao.getList();
	}

	@Override
	public Post getRowById(int id) {
		return postDao.getRowById(id);
	}

	@Override
	public int updateRow(Post post) {
		return postDao.updateRow(post);
	}

	@Override
	public int deleteRow(int id) {
		return postDao.deleteRow(id);
	}

}
