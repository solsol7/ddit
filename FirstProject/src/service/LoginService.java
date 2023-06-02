package service;

import java.util.Map;
import java.util.Scanner;

import dao.LoginDAO;

public class LoginService {
	private static LoginService instance;
	private LoginService() {}
	
	public static LoginService getInstance() {
		if(instance==null) instance=new LoginService();
		return instance;
	}
	
	Scanner sc=new Scanner(System.in);
	LoginDAO dao=LoginDAO.getInstance();
	Map<String, Object> result=null;
	
	public static int loginCount=0;	//로그인횟수 -> 값을 계속 유지해야하기 때문에 static
	
	public Map<String, Object> login() {
		System.out.println("[[로그인]]");
		while(true) {
		System.out.print("id 입력 : ");
		String id=sc.nextLine();
		
		System.out.print("비밀번호 입력 : ");
		String pw=sc.nextLine();
		result=dao.login(id, pw);	//5개가 다 들어있음, String에 해당되는건 key:컬럼명이 들어있음,  Object에 해당되는건 value:값이 들어있음(mem_name이라는 키에는 "신용환"이라는 값이 들어있음
		loginCount++;
		if(loginCount>2) break;
		
		if(result!=null) {
			System.out.println(result.get("MEM_NAME")+"님 반갑습니다");
			break;
		}else {
			System.out.println("다시 로그인하세요");
		}
		
	}
		return result;
	}
}
