package com.beingjavaguys.dao;

import com.beingjavaguys.domain.Topic;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;

public class TopicDaoImpl implements TopicDao {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	@Transactional
	public int insertRow(Topic topic) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(topic);
		tx.commit();
		Serializable id = session.getIdentifier(topic);
		session.close();
		return (Integer) id;
	}

	@Override
	public List<Topic> getList() {
		Session session = sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<Topic> topicList = session.createQuery("from Topic")
				.list();
		session.close();
		return topicList;
	}

	@Override
	public Topic getRowById(int id) {
		Session session = sessionFactory.openSession();
		Topic topic = (Topic) session.load(Topic.class, id);
		return topic;
	}

	@Override
	public int updateRow(Topic topic) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(topic);
		tx.commit();
		Serializable id = session.getIdentifier(topic);
		session.close();
		return (Integer) id;
	}

	@Override
	public int deleteRow(int id) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Topic topic = (Topic) session.load(Topic.class, id);
		session.delete(topic);
		tx.commit();
		Serializable ids = session.getIdentifier(topic);
		session.close();
		return (Integer) ids;
	}

}
