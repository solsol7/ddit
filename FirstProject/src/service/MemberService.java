package service;

import java.util.Map;
import java.util.Scanner;

import dao.MemberDAO;

public class MemberService {
	Scanner sc=new Scanner(System.in);
	MemberDAO dao=MemberDAO.getInstance();
	private static MemberService instance;

	private MemberService() {
	}

	public static MemberService getInstance() {
		if (instance == null)
			instance = new MemberService();
		return instance;
	}
	
	public int update() {	//��� ������Ʈ������ ������ �ȵǸ� �ٿ�Ŭ������ �Ѱ��� �� ���� -> ������Ʈ���� ����Ŭ�������� ���� ����
		int res=0;
		String mid ="";
		String flag ="";
		String pw="";
		String jumin="";
		int mileage =0;
		String updateSql="UPADTE tbl_memner \n";
		
		while (true) {
			System.out.print("ȸ�� ���̵� : ");
			mid = sc.next();
			LoginService loginService = LoginService.getInstance();
			Map<String, Object>map = loginService.isDuplicate(mid);
			if (map == null) {
				System.out.println("ȸ�������� �����ϴ�");
			}else {
				break;
			}
		}

		System.out.print("��й�ȣ�� �����ϰڽ��ϱ�?(Y/N) : ");
		flag = sc.next();
		if(flag.equalsIgnoreCase("y")) {			// while��� if�� �ᵵ��
			System.out.print("��й�ȣ : ");
			pw = sc.next();
			updateSql+="       MEM_PASS = '"+pw+"' , \n";
		}

		System.out.print("�ֹι�ȣ�� �����ϰڽ��ϱ�?(Y/N) : ");
		flag = sc.next();
		while(flag.equalsIgnoreCase("y")) {
			System.out.print("�ֹε�Ϲ�ȣ : ");
			jumin = sc.next();
			updateSql+="       MEM_JUMIN = '"+jumin+"' , \n";
			break;
		}
		
		System.out.print("���ϸ����� �����ϰڽ��ϱ�?(Y/N) : ");
		flag = sc.next();
		if(flag.equalsIgnoreCase("y")) {
			System.out.print("���ϸ��� : ");
			mileage = sc.nextInt();
			updateSql+="       MEM_MILEAGE = "+mileage+" , ";
		}		
		//updateSql+="*";
		//System.out.println(updateSql);					//�μ⸦ �ؼ� ������Ѻ��� ���ڸ��� �������� �� �� ����
		int len=updateSql.length();							//��ü ���̸� ����
		updateSql=updateSql.substring(0,len-4);				//��ü���̿��� -4�� ���� �غ��ϱ� �޸������� ->  �޸����� �κй��ڿ��� ������
		updateSql=updateSql+"\n WHERE MEM_ID = '"+mid+"'";
		
		return dao.update(updateSql);
	}
}
