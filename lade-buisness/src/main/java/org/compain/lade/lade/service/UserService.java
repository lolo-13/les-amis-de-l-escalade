package org.compain.lade.lade.service;

import java.util.List;

import org.compain.lade.lade.dao.UserDao;
import org.compain.lade.lade.entities.User;


public class UserService {
	
	private static UserService instance = new UserService();

	private UserDao userDao = UserDao.getInstance();

	private UserService() {

	}

	public static UserService getInstance() {
		return instance;
	}

	public List<User> findAll() {
		return userDao.findAll();
	}
	
	public User getUser(Integer idUser) {
		return userDao.getUser(idUser);
	}
	public User login (String login, String password) {
		 User currentUser = userDao.getUser(login);		 
		 if(currentUser==null) {throw new RuntimeException();}
		 String passwordUser = currentUser.getPassword();
		 password = EncriptionTools.encrypt(password);
		 if (passwordUser.equals(password)) {
			 return currentUser;
		 }
		 throw new RuntimeException(); 
	}
	
	public void addUser(User user) {
		String password = user.getPassword();
		password= EncriptionTools.encrypt(password);			
		user.setPassword(password);
		userDao.saveOrUpdateUser(user);
	}
	
	public void  updateUser(User newUser, Integer idUser ) {
		
		User old = userDao.getUser(idUser);
		
		old.setName(newUser.getName());
		old.setLastName(newUser.getLastName());		
		old.setEmail(newUser.getEmail());
		old.setPassword(EncriptionTools.encrypt(newUser.getPassword()));

		userDao.saveOrUpdateUser(old);
		
	}

}
