package chap06.sec06;

import java.util.Scanner;

public class MemberService {	//�α���, �α׾ƿ� ����
	Member member=new Member("ȫ�浿","a001","1234",30);
	public boolean login(String id, String passwd) {
		Scanner sc=new Scanner(System.in);
		System.out.print("id : ");
		String pid=sc.nextLine();
		
		System.out.print("password : ");
		String pwd=sc.nextLine();
		
		if(pid.equals(id) && pwd.equals(passwd)) {
			return true;
		}else {
			return false;
		}
	}
	
	public void logout(String id) {
		System.out.println(id+"���� �α׾ƿ� �Ǿ����ϴ�");
	}
}
