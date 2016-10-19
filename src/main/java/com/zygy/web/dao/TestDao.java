package com.zygy.web.dao;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import com.zygy.web.po.TestPo;

public interface TestDao {

	List<TestPo> getTestName(RowBounds rb);

}
