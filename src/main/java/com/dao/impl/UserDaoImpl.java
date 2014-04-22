package com.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.dao.IUserDao;
import com.model.User;

@Repository("userDao")
public class UserDaoImpl extends HibernateDaoSupport implements IUserDao{
	
	@Override
	public void saveUser(User user) {
		getHibernateTemplate().save(user);
	}

}
