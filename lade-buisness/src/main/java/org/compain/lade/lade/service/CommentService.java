package org.compain.lade.lade.service;

import java.util.List;

import org.compain.lade.lade.dao.CommentDao;
import org.compain.lade.lade.entities.Comment;

public class CommentService {

	private static CommentService instance = new CommentService();

	private CommentDao commentDao = CommentDao.getInstance();

	private CommentService() {

	}

	public static CommentService getInstance() {
		return instance;
	}

	public List<Comment> findAll() {
		return commentDao.findAll();
	}
	public Comment getComment(Long idComment) {
		return commentDao.getComment(idComment);
	}

	public void addComment(Comment comment) {
		commentDao.saveOrUpdateComment(comment);
	}

}
