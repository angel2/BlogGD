package com.beingjavaguys.services;

import com.beingjavaguys.dao.UserDao;
import com.beingjavaguys.domain.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDao userDao;

	@Override
	public int insertRow(User user) {
		return userDao.insertRow(user);
	}

	@Override
	public List<User> getList() {
		return userDao.getList();
	}

	@Override
	public User getRowById(int id) {
		return userDao.getRowById(id);
	}

	@Override
	public int updateRow(User user) {
		return userDao.updateRow(user);
	}

	@Override
	public int deleteRow(int id) {
		return userDao.deleteRow(id);
	}

}
