package org.compain.lade.lade.dao;

import java.util.ArrayList;
import java.util.List;

import org.compain.lade.lade.entities.Comment;
import org.hibernate.Session;
import org.hibernate.query.Query;

public class CommentDao extends AbstractDao {
	
private static CommentDao instance = new CommentDao();
	
	private CommentDao(){
		
	}
	
	public static CommentDao getInstance() {
	return instance;	
	}

	public List<Comment> findAll() {

		Session session = this.session();
		List<Comment> listPath = new ArrayList<Comment>();

		try {
			session.getTransaction().begin();
			String sql = "SELECT s FROM " + Comment.class.getName() + " s";
			Query<Comment> query = session.createQuery(sql, Comment.class);
			listPath = query.getResultList();	
			session.getTransaction().commit();
   
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}

		return listPath;
	}

	public Comment getComment(Long idComment) {

		Session session = this.session();
		Comment infoComment = new Comment();

		try {
			session.getTransaction().begin();
			String sql = "SELECT s FROM " + Comment.class.getName() + " s"//
					+ " WHERE s.idComment= :idComment ";
			
			Query<Comment> query = session.createQuery(sql, Comment.class);
			query.setParameter("idComment", idComment);
			infoComment = query.getSingleResult();    
			session.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		return infoComment;
	}	
	
	public void saveOrUpdateComment(Comment comment) {

		Session session = this.session();

		try {
			session.getTransaction().begin();
			session.saveOrUpdate(comment);
			session.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
	}


}
