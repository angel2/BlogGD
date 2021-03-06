package com.beingjavaguys.dao;

import com.beingjavaguys.domain.User;

import java.util.List;

public interface UserDao {
	public int insertRow(User user);

	public List<User> getList();

    List<User> getUser(String email, String pass);

    public User getRowById(int id);

	public int updateRow(User user);

	public int deleteRow(int id);

}
