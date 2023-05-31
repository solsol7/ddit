package chap11.sec02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TempDao {	//쿼리작성클래스 - DAO기능이 커지면 SERVICE클래스로
	private final String URL="jdbc:oracle:thin:@localhost:1521:xe";
	private final String USER="pc16";
	private final String PASSWD="java";
	
	//private TempVO TempVo=TempVO.getInstance();
	
	private Connection conn=null;
	private Statement stmt=null;
	private ResultSet rs=null;
	
	private static TempDao instance=null;
	private TempDao() {}
	
	public static TempDao getInstance() {
		if(instance==null) instance=new TempDao();
		return instance;
	}
	
	List<TempVO> list=new ArrayList<TempVO>();
	
	public List<TempVO> selectList(String sql){
		try {
			conn=DriverManager.getConnection(URL, USER, PASSWD);
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);		//이미 알려진 데이터를 가지고 쿼리를 사용할 경우 - stmt실행해도 됨, 사용자가 선택한 것들을 가지고 쿼리를 사용할 경우 pstmt
			while(rs.next()) {
				TempVO tempVO=new TempVO();
				tempVO.setEmpNo(rs.getString("EMPNO"));	//EMPNO에서 값을 꺼내와서(getter) TempVO 클래스의 멤버변수 empNo에 집어넣음(setEmpNo)
				tempVO.setEname(rs.getString("ENAME"));
				tempVO.setJob(rs.getString("JOB"));
				tempVO.setDeptNo(rs.getInt("DEPTNO"));
				list.add(tempVO);	//클래스변수만 사용되어지면 뒤에 .toString 생략된 것 -> 찍으면 toString에 있는게 찍힘 - 오버라이딩함
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			if(rs != null) try {rs.close();}catch(Exception e) {}
			if(stmt != null) try {stmt.close();}catch(Exception e) {}
			if(conn != null) try {conn.close();}catch(Exception e) {}
			
		}
		return list;
	}
	
}
