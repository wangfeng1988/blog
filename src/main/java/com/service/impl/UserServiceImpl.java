package com.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.IUserDao;
import com.model.User;
import com.service.IUserService;
@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource(name="userDao")
	IUserDao userDao;

	@Override
	@Transactional( rollbackFor={Exception.class})
	public void saveUser(User user) throws Exception {
		userDao.saveUser(user);
		throw new Exception();
	}

}
