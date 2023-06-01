package user03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBConnectionPractice {

	
	public static void main(String[] args) {
		Db01 db=new Db01();
		//db.selectAll();
		db.searchJob();
		db.searchCC();
	}

}

class Db01{
	Scanner sc=new Scanner(System.in);
	private String url="jdbc:oracle:thin:@localhost:1521:xe";
	private String user="pc16_test01";
	private String passwd="java";
	Connection conn=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;

	public void selectAll() {
		try {
			conn=DriverManager.getConnection(url, user, passwd);
			System.out.println("DB 연결 성공");
			System.out.println("---------------------------------------");
			String sql="select * from emp";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {{
				System.out.printf("%d\t%s\t%s\t%5d\t%3d\n",rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getInt(5));
				System.out.println("---------------------------------------");
			}
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally{
			if(rs!=null)try {rs.close();}catch(Exception e) {}
			if(pstmt!=null)try {pstmt.close();}catch(Exception e) {}
			if(conn!=null)try {conn.close();}catch(Exception e) {}
		}
	}

	public void searchJob() {
		try {
			conn=DriverManager.getConnection(url, user, passwd);
			System.out.println("DB 연결 성공");
			System.out.println("---------------------------------------");
			String sql=" select distinct job from emp where job like ?";
			pstmt=conn.prepareStatement(sql);
			System.out.print("업무 검색 : ");
			String searchJob=sc.nextLine();
			pstmt.setString(1, "%"+searchJob+"%");
			rs=pstmt.executeQuery();
			while(rs.next()) {
				System.out.printf("%s",rs.getString(1));
				System.out.println();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally{
			if(rs!=null)try {rs.close();}catch(Exception e) {}
			if(pstmt!=null)try {pstmt.close();}catch(Exception e) {}
			if(conn!=null)try {conn.close();}catch(Exception e) {}
		}
	}

	public void searchCC() {
		try {
			conn=DriverManager.getConnection(url, user, passwd);
			System.out.println("DB 연결 성공");
			System.out.println("---------------------------------------");
			String sql=" select * from emp where job=? ";
			pstmt=conn.prepareStatement(sql);
			System.out.print("업무 입력 : ");
			String searchCC=sc.nextLine();
			pstmt.setString(1, searchCC);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				System.out.println("---------------------------------------");
				System.out.printf("%d\t%s\t%s\t%5d\t%3d\n",rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getInt(5));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally{
			if(rs!=null)try {rs.close();}catch(Exception e) {}
			if(pstmt!=null)try {pstmt.close();}catch(Exception e) {}
			if(conn!=null)try {conn.close();}catch(Exception e) {}
		}
	}
	
}