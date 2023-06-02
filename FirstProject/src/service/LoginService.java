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
	
	public static int loginCount=0;	//�α���Ƚ�� -> ���� ��� �����ؾ��ϱ� ������ static
	
	public Map<String, Object> login() {
		System.out.println("[[�α���]]");
		while(true) {
		System.out.print("id �Է� : ");
		String id=sc.nextLine();
		
		System.out.print("��й�ȣ �Է� : ");
		String pw=sc.nextLine();
		result=dao.login(id, pw);	//5���� �� �������, String�� �ش�Ǵ°� key:�÷����� �������,  Object�� �ش�Ǵ°� value:���� �������(mem_name�̶�� Ű���� "�ſ�ȯ"�̶�� ���� �������
		loginCount++;
		if(loginCount>2) break;
		
		if(result!=null) {
			System.out.println(result.get("MEM_NAME")+"�� �ݰ����ϴ�");
			break;
		}else {
			System.out.println("�ٽ� �α����ϼ���");
		}
		
	}
		return result;
	}
}
