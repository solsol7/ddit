package controller;

import service.LoginService;
import service.MemberService;

public class Controller {

	public static void main(String[] args) {
		new Controller().init();
	}
	
	public void init() {
		//LoginService loginService=LoginService.getInstance();
		//loginService.login();
		
		MemberService memberService=MemberService.getInstance();
		memberService.update();
	}
}


