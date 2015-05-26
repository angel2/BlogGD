package com.beingjavaguys.dao;

import com.beingjavaguys.domain.PostsApproval;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;

public class PostsApprovalDabImpl implements PostsApprovalDao {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	@Transactional
	public int insertRow(PostsApproval postsApproval) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(postsApproval);
		tx.commit();
		Serializable id = session.getIdentifier(postsApproval);
		session.close();
		return (Integer) id;
	}

	@Override
	public List<PostsApproval> getList() {
		Session session = sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<PostsApproval> postsApprovalList = session.createQuery("from PostsApproval")
				.list();
		session.close();
		return postsApprovalList;
	}

	@Override
	public PostsApproval getRowById(int id) {
		Session session = sessionFactory.openSession();
		PostsApproval postsApproval = (PostsApproval) session.load(PostsApproval.class, id);
		return postsApproval;
	}

	@Override
	public int updateRow(PostsApproval postsApproval) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(postsApproval);
		tx.commit();
		Serializable id = session.getIdentifier(postsApproval);
		session.close();
		return (Integer) id;
	}

	@Override
	public int deleteRow(int id) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		PostsApproval postsApproval = (PostsApproval) session.load(PostsApproval.class, id);
		session.delete(postsApproval);
		tx.commit();
		Serializable ids = session.getIdentifier(postsApproval);
		session.close();
		return (Integer) ids;
	}

}
