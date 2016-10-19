package com.zygy.web.dao;

import com.zygy.web.po.UserPo;

public interface UserDao {

	UserPo findUserByUsername(String username);

}
