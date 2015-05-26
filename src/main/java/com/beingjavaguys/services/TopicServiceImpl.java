package com.beingjavaguys.services;

import com.beingjavaguys.dao.TopicDao;
import com.beingjavaguys.domain.Topic;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TopicServiceImpl implements TopicService {
	
	@Autowired
	TopicDao topicDao;

	@Override
	public int insertRow(Topic topic) {
		return topicDao.insertRow(topic);
	}

	@Override
	public List<Topic> getList() {
		return topicDao.getList();
	}

	@Override
	public Topic getRowById(int id) {
		return topicDao.getRowById(id);
	}

	@Override
	public int updateRow(Topic topic) {
		return topicDao.updateRow(topic);
	}

	@Override
	public int deleteRow(int id) {
		return topicDao.deleteRow(id);
	}

}
