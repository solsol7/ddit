package controller;

import service.LoginService;

public class Controller {

	public static void main(String[] args) {
		new Controller().init();
		
	}
	
	public void init() { //주메뉴만 다룰 수 있는 메소드
		LoginService loginService=LoginService.getInstance();
		loginService.login();
	}

}

