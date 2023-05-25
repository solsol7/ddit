package chap08.sec01;

public class DaoExample {

	public static void main(String[] args) {
		OracleDao od=new OracleDao();
		MySqlDao msd=new MySqlDao();
		
		od.insert();
		
		DataAccessObject dao=new OracleDao();	//다형성, 추상메소드가 하나라도 존재하면 객체가 될 수 없음
		dao.insert();
		
	}

}
