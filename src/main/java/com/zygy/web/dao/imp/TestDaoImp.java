package com.zygy.web.dao.imp;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.zygy.web.dao.TestDao;
import com.zygy.web.mybatis.TestMapper;
import com.zygy.web.po.TestPo;

@Repository
public class TestDaoImp implements TestDao {
	@Autowired
	private TestMapper testMybatis;
	
	@Override
	public List<TestPo> getTestName(RowBounds rb) {
		// TODO Auto-generated method stub
		return testMybatis.getTestName(rb);
	}

}
