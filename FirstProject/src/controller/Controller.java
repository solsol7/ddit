package controller;

import service.LoginService;

public class Controller {

	public static void main(String[] args) {
		new Controller().init();
	}
	
	public void init() {
		LoginService loginService=LoginService.getInstance();
		loginService.login();
	}
}


