package org.seasar.sastruts.example.form;

public class NestedForm {
	public User user;
	
	public static class User {
		public String name;
		public String password;
	}
}
