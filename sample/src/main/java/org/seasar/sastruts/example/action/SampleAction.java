package org.seasar.sastruts.example.action;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.seasar.framework.container.SingletonS2Container;
import org.seasar.sastruts.example.dto.UserDto;
import org.seasar.struts.util.RequestUtil;

public class SampleAction {
	@Resource
	protected HttpSession session;
	HttpServletRequest request = SingletonS2Container.getComponent(HttpServletRequest.class);
	HttpServletRequest request2 = RequestUtil.getRequest();
	
	public String index() {
		UserDto userDto = (UserDto)session.getAttribute("userDto");
		return "sample.jsp";
	}
}
