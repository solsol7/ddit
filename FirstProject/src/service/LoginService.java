package service;

import java.util.Map;
import java.util.Scanner;

import controller.Controller;
import dao.LoginDAO;

public class LoginService {
	private static LoginService instance;

	private LoginService() {
	}

	public static LoginService getInstance() {
		if (instance == null)
			instance = new LoginService();
		return instance;
	}

	Scanner sc = new Scanner(System.in);

	public static int loginCount = 0;
	LoginDAO dao = LoginDAO.getInstance();
	Map<String, Object> result=null;
	
	
	public void login() {
		System.out.println("[[ �α��� ]]");
		while (true) {
			System.out.print("id �Է� : ");
			String id = sc.nextLine();

			System.out.print("��й�ȣ �Է� : ");
			String pw = sc.nextLine();
			result = dao.login(id, pw);
			loginCount++;
			if(loginCount>2) break;
			if (result != null) {
				Controller.sessionStorage.put("MEM_ID", id);
				System.out.println(result.get("MEM_NAME") + "�� �ݰ����ϴ�.");
				break;
			} else {
				System.out.println("�ٽ÷α��� �ϼ���...");
			}
		}				
	}
	
	public Map<String, Object> isDuplicate(String id) {
		result=dao.select(id);
		return result;
	}
}
