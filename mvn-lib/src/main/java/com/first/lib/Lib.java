package com.first.lib;

public class Lib {
	private String name = "";
	private String msg = "";

	public Lib(String name, String msg) {
		this.name = name;
		this.msg = msg;
	}

	public String getMessage(){
		return "/n===========================/n" +
				"Hello," + this.name +
				"./n" + this.msg +
				"/n===========================/n";
	}

	@Override
	public String toString() {
		return " NAME: " + this.name + "/n" +
				" MSG: " + this.msg;
	}

}
