package com.zygy.web.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zygy.web.dao.UserDao;
import com.zygy.web.po.UserPo;
import com.zygy.web.service.UserService;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public UserPo findUserByUsername(String username) {
		// TODO Auto-generated method stub
		return userDao.findUserByUsername(username);
	}

}
