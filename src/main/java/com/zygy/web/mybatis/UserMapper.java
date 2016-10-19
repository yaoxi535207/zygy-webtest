package com.zygy.web.mybatis;

import org.apache.ibatis.annotations.Param;

import com.zygy.web.po.UserPo;

public interface UserMapper {

	UserPo findUserByUsername(@Param("username")String username);

}
