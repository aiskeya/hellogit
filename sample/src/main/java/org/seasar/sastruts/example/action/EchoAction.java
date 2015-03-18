package org.seasar.sastruts.example.action;

import javax.annotation.Resource;

import org.seasar.framework.container.annotation.tiger.Component;
import org.seasar.sastruts.example.form.EchoForm;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

public class EchoAction {
	@Resource
	@ActionForm
	protected EchoForm echoForm;
	
	@Execute(validator=true, input="input.jsp")
	public String index() {
		return "input.jsp";
	}
	
	@Execute(validator=true, input="input.jsp")
	public String complete() {
		return "complete.jsp";
	}
}
