package com.zygy.web.service.imp;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zygy.web.dao.TestDao;
import com.zygy.web.po.TestPo;
import com.zygy.web.service.TestService;
import com.zygy.web.util.Page;
import com.zygy.web.util.PageForm;

@Service
public class TestServiceImp implements TestService {

	@Autowired
	private TestDao testDao;
	@Override
	public Page<TestPo> getTestName(PageForm pf) {
		// TODO Auto-generated method stub
		Page<TestPo> page = new Page<TestPo>();
		page.setTotalRows(12);//数据总大小
		page.setCurPage(pf.getPage());
		page.setPageSize(pf.getRows());
		RowBounds rb = new RowBounds((int)page.getBeginIndex(),(int)page.getPageSize());
		List<TestPo> list = testDao.getTestName(rb);
		page.setRecords(list);
		return page;
	}

}
