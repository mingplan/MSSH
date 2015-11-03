package cn.edu.bupt.dao.impl;

import java.io.Serializable;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.edu.bupt.dao.UserDaoI;

@Repository("userDao")
public class UserDaoImpl<T> implements UserDaoI<T> {

	@Autowired
	private SessionFactory sessionFactory;
	
	public Serializable save(T o) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().save(o);
	}

	
}
