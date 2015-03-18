package org.seasar.sastruts.example.form;

import org.apache.poi.hssf.record.formula.functions.False;
import org.seasar.struts.annotation.Msg;
import org.seasar.struts.annotation.Required;
import org.seasar.struts.annotation.Validwhen;

public class EchoForm {
	
	public String name1 = "test";
	
	@Required
	@Validwhen(test = "(name1 == name2)", 
	msg = @Msg(key = "differnt", resource = false))
	public String name2;
	

	
}
