package PreparedStatement;

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
//  ->�ڹ��� ����ð��� �ʿ��� �����͸� �Է¹޾� ���� ����
// 1)������ �Ҵ�� �� ��� ?�� ����Ͽ� ���� ����
// ex) tbl_member�� �ű�ȸ�����
//   sql="insert into tbl_member values(?, ?, ?, ?, ?)"
// 2)query�� ?�� �����ϴ� ������ mapping(setter�޼���:
//   ��ɾü����.set������Ÿ��(?����, ��) 
//  ex) PreparedStatement ps=conn.preparedStatement(sql);
//      ps.setString(1, "a002") ->mem_id
//      ps.setString(2, "09876") ->mem_pass
//      ps.setString(3, "������") ->mem_name
//      ps.setString(4, "951230-1234567") ->mem_jumin
//      ps.setInt(5, 1000) ->mem_mileage
//  3)���� ����
//    . select �� : executeQuery()
//    . �� �̿��� query : executeUpdate() 
//  4)������ 
//    . select �� : ResultSet ��ü�� ����
//    ex) ResultSet rs=executeQuery();
//        while(rs.next()){
//              String mid=rs.getString("MEM_ID");
//                              :
//              int mileage=rs.getInt("MEM_MILEAGE");
//        }
//    . �� �̿��� query : Ŀ��(������ ������� ��(row)�� ����)�� ���� ��(����)
public class PreparedStatementExample01 {
	private Scanner sc = new Scanner(System.in);

	private String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private String user = "SEM";
	private String passwd = "java";

	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	private int rowCount = 0;

	public static void main(String[] args) {
		PreparedStatementExample01 ps01=new PreparedStatementExample01();
		/*
		String sql = " INSERT INTO tbl_member VALUES(?, ?, ?, ?, ?) ";
		PreparedStatmentExample01 ps01=new PreparedStatmentExample01();
		int result = ps01.insert(sql);
		if (result != 0) {
			System.out.println("�ڷᰡ ���������� ����Ǿ����ϴ�. ");
		} else {
			System.out.println("�ڷᰡ ������� �ʾҽ��ϴ�. ");
		}
		*/
		ps01.update();
	}

	public int insert(String sql) {
		String mid ="";
		while (true) {
			System.out.print("ȸ�� ���̵� : ");
			mid = sc.next();
			LoginService loginService = LoginService.getInstance();
			Map<String, Object>map = loginService.isDuplicate(mid);
			if (map != null) {
				System.out.println("���̵� �ߺ��Ǿ����ϴ�...");
			}else {
				break;
			}
		}
		System.out.print("ȸ���� : ");
		String mname = sc.next();

		System.out.print("��й�ȣ : ");
		String pw = sc.next();

		System.out.print("�ֹε�Ϲ�ȣ : ");
		String jumin = sc.next();

		System.out.print("���ϸ��� : ");
		int mileage = sc.nextInt();

		try {
			conn = DriverManager.getConnection(url, user, passwd);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mid);
			pstmt.setString(2, pw);
			pstmt.setString(3, mname);
			pstmt.setString(4, jumin);
			pstmt.setInt(5, mileage);

			rowCount = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {if(rs!=null)try{rs.close();}catch(Exception e) {}
		           if(pstmt!=null)try{pstmt.close();}catch(Exception e) {}
		           if(conn!=null)try{conn.close();}catch(Exception e) {}
		}
		return rowCount;
	}
	
	public void update() {
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
		while(flag.equalsIgnoreCase("y")) {
			System.out.print("��й�ȣ : ");
			pw = sc.next();
			updateSql+="       MEM_PASS = '"+pw+"' , \n";
			break;
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
		while(flag.equalsIgnoreCase("y")) {
			System.out.print("���ϸ��� : ");
			mileage = sc.nextInt();
			updateSql+="       MEM_MILEAGE = "+mileage+" , \n";
			break;
		}		
		int len=updateSql.length();
		updateSql=updateSql.substring(0,len-4);
		updateSql=updateSql+"\n WHERE MEM_ID = '"+mid+"'";
		System.out.println(updateSql);
	}
}
