package org.seasar.sastruts.example.form;

public class TableForm {
	public Row[] rows = new Row[] {new Row(), new Row(), new Row() };
	
	public static class Row {
		public String name;
		public String mail;
	}
}