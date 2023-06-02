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
public class JDBCUtil {
//싱글톤패턴 적용
	private static JDBCUtil instance=null;
	private JDBCUtil() {}
	public static JDBCUtil getInstance() {
		if(instance==null) instance=new JDBCUtil();
		return instance;
	}
	
	private String url="jdbc:oracle:thin:@localhost:1521:xe";
	private String user="SEM";
	private String passwd="java";
	
	private Connection conn;
	private PreparedStatement pstmt=null;
	private Statement stmt=null;
	private ResultSet rs=null;
	
	public Map<String, Object> selectOne(String sql){
		//정적쿼리 사용한경우
		//sql="SELECT * FROM TBL_MEMBER WHERE MEM_ID='a001' AND 
		//      MEM_PASS='1234'"
	    Map<String, Object> row=null;
	    try {
	    	conn=DriverManager.getConnection(url,user,passwd);
	    	pstmt=conn.prepareStatement(sql);
	    	rs=pstmt.executeQuery();
	    	//컬럼의 수, 컬럼명
	    	ResultSetMetaData rsmd=rs.getMetaData();
	    	int columnCount=rsmd.getColumnCount();
	    	while(rs.next()) {
	    		row=new HashMap<>();
	    		for(int i=0; i<columnCount; i++) {
	    			String key=rsmd.getColumnLabel(i);
	    	//or	String key=rsmd.getColumnName(i);
	    			Object value=rs.getObject(i);
	    			row.put(key, value);
	    		}
	    	}
	    }catch(SQLException e) {
	    	e.printStackTrace();
	    }finally {
	    	if(rs!=null) try{rs.close();}catch(Exception e) {}
	    	if(pstmt!=null) try{pstmt.close();}catch(Exception e) {}
	    	if(conn!=null) try{conn.close();}catch(Exception e) {}    	
	    }
	    return row;
	}
	
	public Map<String, Object> selectOne(String sql, List<Object>param){
		//sql="SELECT * FROM tbl_member WHERE mem_id = ? and
		//  mem_pass = ? " 
		Map<String, Object> row=null;
		try {
			conn=DriverManager.getConnection(url,user,passwd);
			pstmt=conn.prepareStatement(sql);
			//sql에 존재하는  ?에 대응되는 데이터 mapping=>
			//    pstmt.set타입명(?순번,데이터) 
			for(int i=0; i<param.size(); i++) {
				pstmt.setObject(i+1, param.get(i));
			}
			rs=pstmt.executeQuery();
			
			ResultSetMetaData rsmd=rs.getMetaData();
			int columnCount=rsmd.getColumnCount();
			while(rs.next()) {
				row=new HashMap<>();
				for(int i=0; i<columnCount; i++) {
					String key=rsmd.getColumnLabel(i+1);
					Object value=rs.getObject(i+1);
					row.put(key, value);
				}
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
	    	if(rs!=null) try{rs.close();}catch(Exception e) {}
	    	if(pstmt!=null) try{pstmt.close();}catch(Exception e) {}
	    	if(conn!=null) try{conn.close();}catch(Exception e) {}    				
		}

		return row;
	}
}
