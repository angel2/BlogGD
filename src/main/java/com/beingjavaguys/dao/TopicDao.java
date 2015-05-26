package com.beingjavaguys.dao;

import com.beingjavaguys.domain.Topic;

import java.util.List;

public interface TopicDao {
	public int insertRow(Topic topic);

	public List<Topic> getList();

	public Topic getRowById(int id);

	public int updateRow(Topic topic);

	public int deleteRow(int id);

}
