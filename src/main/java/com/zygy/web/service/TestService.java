package com.zygy.web.service;

import java.util.List;

import com.zygy.web.po.TestPo;
import com.zygy.web.util.Page;
import com.zygy.web.util.PageForm;

public interface TestService {

	Page<TestPo> getTestName(PageForm pf);

}
