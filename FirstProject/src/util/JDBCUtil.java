package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//JDBC를 사용하여 CRUD를 효율적으로 사용할 수 있는 메서드를 포함한 class
//싱글톤패턴 적용
public class JDBCUtil {	//crud쿼리를 실행할 수 있는 코드로 구성
						//커넥션, 데이터베이스 연동, 연동된 데이터베이스에서 셀렉트문. 인서트문. 없데이트분 , 딜리트 커밋 롤백 명령을 실행할 수 있는 코드로 구성
	private static JDBCUtil instance=null;
	private JDBCUtil() {}
	
	public static JDBCUtil getInstance() {
		if(instance==null) instance=new JDBCUtil();
		return instance;
	}
	
	private String url="jdbc:oracle:thin:@localhost:1521:xe";
	private String user="pc16";
	private String passwd="java";
	
	private Connection conn=null;
	private PreparedStatement pstmt=null;						//명령어객체 Statement - where절이 없거나 where절에서 사용되는 조건을 미리 알고있는 경우 사용
	private Statement stmt=null;								//		 PrepareStatement//실행시간동안 입력받은 데이터를 가지고 사용할 때
	private ResultSet rs=null;									// 		  callStatement-프로시저(반환값이 없는 메서드), 펑션(반환값이 있는 메서드-select절에 사용가능), 트리거, 커서
	

	public Map<String, Object> selectOne(String sql){
		//정적쿼리사용한 경우
		//ex) sql="SELECT * FROM TBL_MEMBER WHERE MEM_ID='a001' AND MEM_PASS='1234'"
		//고정적으로 특정한 데이터를 이미 
		Map<String, Object>	row=null;		//한사람의 데이터가 저장될 기억장소
		try {
			conn=DriverManager.getConnection(url, user, passwd);
			pstmt=conn.prepareStatement(sql);		//sql -> 매개변수
			rs=pstmt.executeQuery();
			
			ResultSetMetaData rsmd	=rs.getMetaData();		//컬럼의수, 컬럼명을 알기 위해 사용
															//metadata -> 데이터의 데이터 : 기본키가 뭐고 컬럼이 몇개고 외래키가 뭐고 테이블명이 뭐고....
															//뷰 핸들링 - 이름이부여된뷰, 커서
			int columnCount=rsmd.getColumnCount();
			while(rs.next()) {								//한사람분의 데이터를 처리할 수 있는 selectOne
				row=new HashMap<>();						
				for(int i=0; i<columnCount; i++) {
					String key=rsmd.getColumnLabel(i);
				// or String key=rsmd.getColumnName(i);
					Object value=rs.getObject(i);
					row.put(key, value);
				}
			}
				
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			if(rs!=null) try {rs.close();} catch(Exception e) {}
			if(pstmt!=null) try {pstmt.close();} catch(Exception e) {}
			if(conn!=null) try {conn.close();} catch(Exception e) {}
			
		}
		return row;
	}
	
	public Map<String, Object> selectOne(String sql, List<Object>param){	// ?,?에 들어갈 자료가 List(Object>param 을 통해 들어감
																			//몇개가 될지 모르니까 배열형태인 List로 받음 - 데이터타입도 object로 받음(?에 대응되는 매개변수가 어떤 타입일지 모름)
		//sql="SELECT * FROM tbl_member WHERE mem_id = ? AND mem_pass = ?"
		Map<String, Object> row=null;
		try {
			conn=DriverManager.getConnection(url, user, passwd);
			pstmt=conn.prepareStatement(sql);
			for(int i=0; i<param.size(); i++) {			//사용되는 데이터와 입력받은 데이터를 mapping시켜야함 -sql에 존재하는 ?에 대응되는 데이터 mapping => pstmt.set타입명(?순번,데이터)
				pstmt.setObject(i+1, param.get(i));		// ? -> 쿼리문에 사용됨 -> 오라클이기때문에 인덱스 1부터사용
														//List의 데이터타입이 Object이기때문에 setObject로 설정
														// param.get(i)는 자바문장이기때문에 인덱스 0부터 시작
			}
			rs=pstmt.executeQuery(); // 한사람분의 자료가 들어옴  -> 그거러 Map에다 집어넣어서 반환해줘야함(key,value)
			
			ResultSetMetaData rsmd=rs.getMetaData();
			int columnCount=rsmd.getColumnCount();
			while(rs.next()) {	//자료가 존재하면 Map에 저장해서 반환
				row=new HashMap<>();
				for(int i=0; i<columnCount; i++) {
					String key=rsmd.getColumnLabel(i);
					Object value=rs.getObject(i);
					row.put(key, value);
				}
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			if(rs!=null) try {rs.close();} catch(Exception e) {}
			if(pstmt!=null) try {pstmt.close();} catch(Exception e) {}
			if(conn!=null) try {conn.close();} catch(Exception e) {}
		}
		
		return row;
	}
}
