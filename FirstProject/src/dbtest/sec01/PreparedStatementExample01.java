package dbtest.sec01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import service.LoginService;

//동적 query명령어 객체
//	-> 자바의 실행시간에 필요한 데이터를 입력받아 쿼리 실행
//	1) 변수에 할당될 값 대신 ? 를 기술하여 쿼리 구성
//	ex) tb1)member에 신규회원등록
//		sql=" insert into tbl_member values(?, ?, ?, ?, ?) "
//  2) query의 ?에 대응하는 데이터mapping(setter 메서드 : 
//		명령어객체변수.set데이터타입(?순번, 값)
// 		ex) PreparedStatement ps=conn.preparedStawtement(sql)
//			ps.setString(1, "a002") -> mum_id
//			ps.setString(2, "09876") -> mum_pass
//			ps.setString(3, "정몽주") -> mum_name
//			ps.setString(4, "951230-1234567") -> mum_jumin
//			ps.setInt(5, 1000) -> mum_mileage
//	3) 쿼리 실행
//		.select 문 : executeQuery()
//		. 그 이외의 query : executeUpdate()
//	4) 실행결과
//		.select 문 : ResultSet 객체에 저장
//		ex) ResultSet rs=executQuery();
//			while(true){
//				String mid=rs.getString("MEM_ID");
//								:
//				int mileage=rs.getInt("MEM_MILEAGE");
//			}
//		. 그 이외의 query : 커서(쿼리로 영향받은 행(row)의 집합 )의 행의 수(정수)		//커서 -업데이트문의 커서 : 업데이트된 행의 집합/ 인서트문의 커서 : 인서트된 행의 집합...
public class PreparedStatementExample01 {
	private Scanner sc= new Scanner(System.in);	//<- static클래스에서도 사용하려면 static붙여야함, 안붙이려면 자기자신의 객체 만들기
	
	private String url="jdbc:oracle:thin:@localhost:1521:xe";// =jdbc:oracle:thin:@127.0.0.1:1521:xe
	private String user="pc16";
	private String passwd="java";
	
	private Connection conn=null;
	private PreparedStatement pstmt=null;
	private ResultSet rs=null;
	private int rowCount=0;
	
	public static void main(String[] args) {
		String sql=" INSERT INTO tbl_member values(?, ?, ?, ?, ?) ";
		PreparedStatementExample01 ps01=new PreparedStatementExample01();
		int result=ps01.insert(sql);
		if(result!=0) {
			System.out.println("자료가 성공적으로 저장되었습니다");
		}else {
			System.out.println("자료가 저장되지 않았습니다");
		}
		
		
	}

	public int insert(String sql) { //insert되기 위해 쿼리가 필요 -> 매개변수 String sql		//insert된 행의 수 반환
		List<Object> param=new ArrayList<Object>();				//입력받고 중복값있는지 확인해야함 -> select문 받고 Map에 값 null아니면 중복아이디
		System.out.print("회원 아이디 : ");		
		String mid=sc.nextLine();
		param.add(mid);							//
		LoginService loginService=LoginService.getInstance();
		Map<String, Object> map=loginService.login();
		
		if(map!=null)
		
		System.out.print("회원명 : ");
		String mname=sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String pw=sc.nextLine();
		
		System.out.print("주민등록번호 : ");
		String jumin=sc.nextLine();
		
		System.out.print("마일리지 : ");
		int milege=Integer.parseInt(sc.nextLine());
		
		try {
			conn=DriverManager.getConnection(url, user, passwd);
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, mid);
			pstmt.setString(2, mname);
			pstmt.setString(3, pw);
			pstmt.setString(4, jumin);
			pstmt.setInt(5, milege);
			
			rowCount=pstmt.executeUpdate();	//executeUpdate() ->insert되어진 행의 수가 나옴
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			if(rs!=null) try {rs.close();}catch(Exception e) {}
			if(pstmt!=null) try {pstmt.close();}catch(Exception e) {}
			if(conn!=null) try {conn.close();}catch(Exception e) {}
		}
		return rowCount;
	}
	
}
