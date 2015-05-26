package com.beingjavaguys.services;

import com.beingjavaguys.domain.User;

import java.util.List;

public interface UserService {
	public int insertRow(User user);

	public List<User> getList();

	public User getRowById(int id);

	public int updateRow(User user);

	public int deleteRow(int id);

}
