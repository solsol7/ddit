package controller;

import service.LoginService;

public class Controller {

	public static void main(String[] args) {
		new Controller().init();
		
	}
	
	public void init() { //�ָ޴��� �ٷ� �� �ִ� �޼ҵ�
		LoginService loginService=LoginService.getInstance();
		loginService.login();
	}

}

