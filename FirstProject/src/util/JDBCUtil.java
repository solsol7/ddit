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

//JDBC�� ����Ͽ� CRUD�� ȿ�������� ����� �� �ִ� �޼��带 ������ class
//�̱������� ����
public class JDBCUtil {	//crud������ ������ �� �ִ� �ڵ�� ����
						//Ŀ�ؼ�, �����ͺ��̽� ����, ������ �����ͺ��̽����� ����Ʈ��. �μ�Ʈ��. ������Ʈ�� , ����Ʈ Ŀ�� �ѹ� ����� ������ �� �ִ� �ڵ�� ����
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
	private PreparedStatement pstmt=null;						//��ɾü Statement - where���� ���ų� where������ ���Ǵ� ������ �̸� �˰��ִ� ��� ���
	private Statement stmt=null;								//		 PrepareStatement//����ð����� �Է¹��� �����͸� ������ ����� ��
	private ResultSet rs=null;									// 		  callStatement-���ν���(��ȯ���� ���� �޼���), ���(��ȯ���� �ִ� �޼���-select���� ��밡��), Ʈ����, Ŀ��
	

	public Map<String, Object> selectOne(String sql){
		//������������� ���
		//ex) sql="SELECT * FROM TBL_MEMBER WHERE MEM_ID='a001' AND MEM_PASS='1234'"
		//���������� Ư���� �����͸� �̹� 
		Map<String, Object>	row=null;		//�ѻ���� �����Ͱ� ����� ������
		try {
			conn=DriverManager.getConnection(url, user, passwd);
			pstmt=conn.prepareStatement(sql);		//sql -> �Ű�����
			rs=pstmt.executeQuery();
			
			ResultSetMetaData rsmd	=rs.getMetaData();		//�÷��Ǽ�, �÷����� �˱� ���� ���
															//metadata -> �������� ������ : �⺻Ű�� ���� �÷��� ��� �ܷ�Ű�� ���� ���̺���� ����....
															//�� �ڵ鸵 - �̸��̺ο��Ⱥ�, Ŀ��
			int columnCount=rsmd.getColumnCount();
			while(rs.next()) {								//�ѻ������ �����͸� ó���� �� �ִ� selectOne
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
	
	public Map<String, Object> selectOne(String sql, List<Object>param){	// ?,?�� �� �ڷᰡ List(Object>param �� ���� ��
																			//��� ���� �𸣴ϱ� �迭������ List�� ���� - ������Ÿ�Ե� object�� ����(?�� �����Ǵ� �Ű������� � Ÿ������ ��)
		//sql="SELECT * FROM tbl_member WHERE mem_id = ? AND mem_pass = ?"
		Map<String, Object> row=null;
		try {
			conn=DriverManager.getConnection(url, user, passwd);
			pstmt=conn.prepareStatement(sql);
			for(int i=0; i<param.size(); i++) {			//���Ǵ� �����Ϳ� �Է¹��� �����͸� mapping���Ѿ��� -sql�� �����ϴ� ?�� �����Ǵ� ������ mapping => pstmt.setŸ�Ը�(?����,������)
				pstmt.setObject(i+1, param.get(i));		// ? -> �������� ���� -> ����Ŭ�̱⶧���� �ε��� 1���ͻ��
														//List�� ������Ÿ���� Object�̱⶧���� setObject�� ����
														// param.get(i)�� �ڹٹ����̱⶧���� �ε��� 0���� ����
			}
			rs=pstmt.executeQuery(); // �ѻ������ �ڷᰡ ����  -> �װŷ� Map���� ����־ ��ȯ�������(key,value)
			
			ResultSetMetaData rsmd=rs.getMetaData();
			int columnCount=rsmd.getColumnCount();
			while(rs.next()) {	//�ڷᰡ �����ϸ� Map�� �����ؼ� ��ȯ
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
