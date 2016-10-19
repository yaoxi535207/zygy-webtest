package com.zygy.web.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zygy.web.form.LoginForm;
import com.zygy.web.po.TestPo;
import com.zygy.web.po.UserPo;
import com.zygy.web.service.TestService;
import com.zygy.web.util.Page;
import com.zygy.web.util.PageForm;


@Controller
public class TestAction {
	@Autowired
	private TestService testService;
	
	@RequestMapping(value = "/login.xhtml", method = { RequestMethod.GET, RequestMethod.POST })
	public String gotoPWDGetBack(HttpServletRequest request, ModelMap model){
		
		PageForm pf = new PageForm();
		pf.setPage(1);
		pf.setRows(5);
		Page<TestPo> page = testService.getTestName(pf);
		model.put("ctx", request.getContextPath());
		return "/test";
	}
	
	@RequestMapping(value = "/userlogin.xhtml", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public String login(HttpServletRequest request, HttpServletResponse response,LoginForm loginForm){
		Subject currentUser = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken(
				loginForm.getUsername(), loginForm.getPassword());
		currentUser.login(token);
		return "dd";
	}
}
