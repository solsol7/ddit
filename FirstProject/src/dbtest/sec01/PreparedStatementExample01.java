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

//���� query��ɾ� ��ü
//	-> �ڹ��� ����ð��� �ʿ��� �����͸� �Է¹޾� ���� ����
//	1) ������ �Ҵ�� �� ��� ? �� ����Ͽ� ���� ����
//	ex) tb1)member�� �ű�ȸ�����
//		sql=" insert into tbl_member values(?, ?, ?, ?, ?) "
//  2) query�� ?�� �����ϴ� ������mapping(setter �޼��� : 
//		��ɾü����.set������Ÿ��(?����, ��)
// 		ex) PreparedStatement ps=conn.preparedStawtement(sql)
//			ps.setString(1, "a002") -> mum_id
//			ps.setString(2, "09876") -> mum_pass
//			ps.setString(3, "������") -> mum_name
//			ps.setString(4, "951230-1234567") -> mum_jumin
//			ps.setInt(5, 1000) -> mum_mileage
//	3) ���� ����
//		.select �� : executeQuery()
//		. �� �̿��� query : executeUpdate()
//	4) ������
//		.select �� : ResultSet ��ü�� ����
//		ex) ResultSet rs=executQuery();
//			while(true){
//				String mid=rs.getString("MEM_ID");
//								:
//				int mileage=rs.getInt("MEM_MILEAGE");
//			}
//		. �� �̿��� query : Ŀ��(������ ������� ��(row)�� ���� )�� ���� ��(����)		//Ŀ�� -������Ʈ���� Ŀ�� : ������Ʈ�� ���� ����/ �μ�Ʈ���� Ŀ�� : �μ�Ʈ�� ���� ����...
public class PreparedStatementExample01 {
	private Scanner sc= new Scanner(System.in);	//<- staticŬ���������� ����Ϸ��� static�ٿ�����, �Ⱥ��̷��� �ڱ��ڽ��� ��ü �����
	
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
			System.out.println("�ڷᰡ ���������� ����Ǿ����ϴ�");
		}else {
			System.out.println("�ڷᰡ ������� �ʾҽ��ϴ�");
		}
		
		
	}

	public int insert(String sql) { //insert�Ǳ� ���� ������ �ʿ� -> �Ű����� String sql		//insert�� ���� �� ��ȯ
		List<Object> param=new ArrayList<Object>();				//�Է¹ް� �ߺ����ִ��� Ȯ���ؾ��� -> select�� �ް� Map�� �� null�ƴϸ� �ߺ����̵�
		System.out.print("ȸ�� ���̵� : ");		
		String mid=sc.nextLine();
		param.add(mid);							//
		LoginService loginService=LoginService.getInstance();
		Map<String, Object> map=loginService.login();
		
		if(map!=null)
		
		System.out.print("ȸ���� : ");
		String mname=sc.nextLine();
		
		System.out.print("��й�ȣ : ");
		String pw=sc.nextLine();
		
		System.out.print("�ֹε�Ϲ�ȣ : ");
		String jumin=sc.nextLine();
		
		System.out.print("���ϸ��� : ");
		int milege=Integer.parseInt(sc.nextLine());
		
		try {
			conn=DriverManager.getConnection(url, user, passwd);
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, mid);
			pstmt.setString(2, mname);
			pstmt.setString(3, pw);
			pstmt.setString(4, jumin);
			pstmt.setInt(5, milege);
			
			rowCount=pstmt.executeUpdate();	//executeUpdate() ->insert�Ǿ��� ���� ���� ����
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
