package cn.edu.bupt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.edu.bupt.dao.UserDaoI;
import cn.edu.bupt.model.User;

@Service("userService")
@Transactional
public class UserService {

	@Autowired
	private UserDaoI<User> userDao;
	
	public void addUser(User user){
		userDao.save(user);
	}
}
