package com.beingjavaguys.dao;

import com.beingjavaguys.domain.Post;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;

public class PostDaoImpl implements PostDao {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	@Transactional
	public int insertRow(Post post) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(post);
		tx.commit();
		Serializable id = session.getIdentifier(post);
		session.close();
		return (Integer) id;
	}

	@Override
	public List<Post> getList() {
		Session session = sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<Post> postList = session.createQuery("from Post")
				.list();
		session.close();
		return postList;
	}

	@Override
	public List<Post> getListApproval() {
		Session session = sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<Post> postList = session.createQuery("from Post where status = 'Approval'").list();
		session.close();
		return postList;
	}


	@Override
	public List<Post> getPostList(int id) {
		String sql = "FROM Post WHERE id = :id";

		Session session = sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		Query query = session.createQuery(sql);
		query.setParameter("id", id);
		List<Post> postList = query.list();
		session.close();
		return postList;
	}

	@Override
	public Post getRowById(int id) {
		Session session = sessionFactory.openSession();
		Post post = (Post) session.load(Post.class, id);
		return post;
	}

	@Override
	public int updateRow(Post post) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(post);
		tx.commit();
		Serializable id = session.getIdentifier(post);
		session.close();
		return (Integer) id;
	}

	@Override
	public int deleteRow(int id) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Post post = (Post) session.load(Post.class, id);
		session.delete(post);
		tx.commit();
		Serializable ids = session.getIdentifier(post);
		session.close();
		return (Integer) ids;
	}

}
