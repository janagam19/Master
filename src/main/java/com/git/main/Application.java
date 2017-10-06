package com.git.main;

public class Application {
	
	public String method() {
		String str = "this is master branch";
		System.out.println(str);
		return str;
	}
	
	public static void main(String[] args) {
		Application a = new Application();
		a.method();
	}

}
