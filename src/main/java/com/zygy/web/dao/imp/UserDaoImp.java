package com.zygy.web.dao.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.zygy.web.dao.UserDao;
import com.zygy.web.mybatis.UserMapper;
import com.zygy.web.po.UserPo;

@Repository
public class UserDaoImp implements UserDao {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public UserPo findUserByUsername(String username) {
		// TODO Auto-generated method stub
		return userMapper.findUserByUsername(username);
	}

}
