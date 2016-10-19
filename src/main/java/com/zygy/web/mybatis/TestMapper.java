package com.zygy.web.mybatis;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import com.zygy.web.po.TestPo;

public interface TestMapper {

	List<TestPo> getTestName(RowBounds rb);

}
