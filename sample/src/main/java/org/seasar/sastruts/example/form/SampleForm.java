package org.seasar.sastruts.example.form;

import java.io.Serializable;

import org.seasar.framework.container.annotation.tiger.Component;
import org.seasar.framework.container.annotation.tiger.InstanceType;

@Component(instance=InstanceType.SESSION)
public class SampleForm implements Serializable {
	private static final long serialVersionUID = 1L;
	public boolean foo;
	public String[] bar;
	
	public void reset() {
		foo = false;
		bar = new String[0];
	}
	
}
