package com.zygy.web.service;

import com.zygy.web.po.UserPo;

public interface UserService {

	UserPo findUserByUsername(String username);

}
