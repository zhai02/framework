package com.ssm.util.user.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssm.util.user.IDao.IUserDao;
import com.ssm.util.user.data.User;
import com.ssm.util.user.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService{
	@Resource
	private IUserDao userDao;
	
	@Override
	public User getUserById(int userId) {
		return this.userDao.selectByPrimaryKey(userId);
	}
}
