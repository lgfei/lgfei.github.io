package com.lgfei.mysite.action;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.lgfei.mysite.message.ResultMessageVO;
import com.lgfei.mysite.service.IUserService;
import com.lgfei.mysite.service.impl.UserService;
import com.lgfei.mysite.vo.UserInfoVO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements RequestAware,SessionAware{

	private static final long serialVersionUID = -6422349743325802121L;
	
	private UserInfoVO userInfoVO;
	private IUserService userService;

	public UserInfoVO getUserInfoVO() {
		return userInfoVO;
	}

	public void setUserInfoVO(UserInfoVO userInfoVO) {
		this.userInfoVO = userInfoVO;
	}

	public IUserService getUserService() {
		return userService;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

	private Map session;
	private Map request;
	@Override
	public void setSession(Map session) {
		this.session = session;
	}

	@Override
	public void setRequest(Map request) {
		this.request = request;
	}
	
	@Override
	public String execute() throws Exception {
		request.remove("errorMsg");
		session.remove("currentUser");
		//userService = new UserService();
		ResultMessageVO remsgVO = userService.login(userInfoVO);
		if(remsgVO.isError()){
			request.put("errorMsg", remsgVO.getMessage());
			return ERROR;
		}
		
		userInfoVO = (UserInfoVO)remsgVO.getVoObj();
		session.put("currentUser", userInfoVO.getUserName());
		
		return SUCCESS;
	}
	
}
