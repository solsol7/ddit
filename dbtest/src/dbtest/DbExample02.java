package dbtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DbExample02 {
	String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
	String user = "pc16";
	String passwd = "java";
	Connection conn = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public static void main(String[] args) {
		new DbExample01().dbConnection();	// static �ҷ��������� �ڱ��ڽ��� ��ü ����
		int res=new DbExample01().dbInsert();
		if(res>0) {
			System.out.println("�ڷ� �Է� ����");
		}
	}

	public void dbConnection() {
		try {
			conn = DriverManager.getConnection(url, user, passwd); // getConnection : ����Ŭ�� �ڹ� �������ִ� �޼��� ,���� ����
			System.out.println("DB ���� ����");
			stmt = conn.createStatement(); // Ŀ�ؼǰ�ü �̿��� ���� try �� �ȿ� �������
			String sql = "select empno, ename, job from temp"; // ""�ȿ� �ִ� ���� ����Ŭ �ڵ� ->sql�� �����
			rs = stmt.executeQuery(sql); // select���� �����ų �� ���Ǵ� �޼ҵ� insert, update, delete ->executeUpdate
			while (rs.next()) { // ������ �������µ� next() -> ������ true, ������ false
				String eid = rs.getNString("empno"); // ����Ŭ�� �ִ� �÷���, �÷� Ÿ�� �� �˾ƾ���
				String eName = rs.getNString("ename");
				String job = rs.getNString(3); // ����Ŭ�� �ε����� 1���� ����

				System.out.printf("%5s %7s %10s\n", eid, eName, job);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null)
				try {
					stmt.close();
				} catch (Exception e) {
				}
			if (conn != null)
				try {
					conn.close();
				} catch (Exception e) {
				}
		}
	}

	public int dbInsert() {
		Scanner sc=new Scanner(System.in);
		System.out.println("[������� �Է�]");
		System.out.print("�����ȣ : ");
		String eid=sc.nextLine();
		
		System.out.print("����̸� : ");
		String name=sc.nextLine();
		
		System.out.print("�����ڵ�: ");
		String jid=sc.nextLine();
		
		System.out.print("�μ���ȣ : ");
		int deptid=Integer.parseInt(sc.nextLine());
		int res=0;		//�ԷµǾ��� ����(�� ���� �ԷµǾ���)  --�ϳ��� �Է������ϱ� 1
		
		
		try {
			conn = DriverManager.getConnection(url, user, passwd);
			String sql = "insert into TEMP values(?,?,?,?)"; //?->�� ���� ������ //temp���̺��� �÷� ������ -> temp�� ��� �÷��� ������ �� ����ִ´� ->�׷��� ����ǥ 4��
			
			pstmt =conn.prepareStatement(sql);
			pstmt.setString(1, eid);	//ù��° ����ǥ�� eid
			pstmt.setString(2, name);
			pstmt.setString(3, jid);
			pstmt.setInt(4, deptid);
			
			res=pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (Exception e) {
				}
			if (stmt != null)
				try {
					stmt.close();
				} catch (Exception e) {
				}
			if (conn != null)
				try {
					conn.close();
				} catch (Exception e) {
				}
		}
		return res;
	}
}
