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
	
	public int update() {	//어떤게 업데이트될지가 결정이 안되면 다오클래스에 넘겨줄 수 없음 -> 업데이트문은 서비스클래스에서 쿼리 만듦
		int res=0;
		String mid ="";
		String flag ="";
		String pw="";
		String jumin="";
		int mileage =0;
		String updateSql="UPADTE tbl_memner \n";
		
		while (true) {
			System.out.print("회원 아이디 : ");
			mid = sc.next();
			LoginService loginService = LoginService.getInstance();
			Map<String, Object>map = loginService.isDuplicate(mid);
			if (map == null) {
				System.out.println("회원정보가 없습니다");
			}else {
				break;
			}
		}

		System.out.print("비밀번호를 변경하겠습니까?(Y/N) : ");
		flag = sc.next();
		if(flag.equalsIgnoreCase("y")) {			// while대신 if문 써도됨
			System.out.print("비밀번호 : ");
			pw = sc.next();
			updateSql+="       MEM_PASS = '"+pw+"' , \n";
		}

		System.out.print("주민번호를 변경하겠습니까?(Y/N) : ");
		flag = sc.next();
		while(flag.equalsIgnoreCase("y")) {
			System.out.print("주민등록번호 : ");
			jumin = sc.next();
			updateSql+="       MEM_JUMIN = '"+jumin+"' , \n";
			break;
		}
		
		System.out.print("마일리지를 변경하겠습니까?(Y/N) : ");
		flag = sc.next();
		if(flag.equalsIgnoreCase("y")) {
			System.out.print("마일리지 : ");
			mileage = sc.nextInt();
			updateSql+="       MEM_MILEAGE = "+mileage+" , ";
		}		
		//updateSql+="*";
		//System.out.println(updateSql);					//인쇄를 해서 실행시켜보면 몇자리를 빼야할지 알 수 있음
		int len=updateSql.length();							//전체 길이를 따짐
		updateSql=updateSql.substring(0,len-4);				//전체길이에서 -4한 값을 해보니까 콤마없어짐 ->  콤마없이 부분문자열로 가져옴
		updateSql=updateSql+"\n WHERE MEM_ID = '"+mid+"'";
		
		return dao.update(updateSql);
	}
}
