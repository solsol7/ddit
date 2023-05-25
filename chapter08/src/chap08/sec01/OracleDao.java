package chap08.sec01;

public class OracleDao implements DataAccessObject{
	@Override
	public void select() {
		System.out.println("Oracle DB에서 데이터 검색");
	}
	
	@Override
	public void insert() {
		System.out.println("Oracle DB에서 자료 삽입");
	}
	
	@Override
	public void update() {
		System.out.println("Oracle DB에서 자료 갱신");
	}
	
	@Override
	public void delete() {
		System.out.println("Oracle DB에서 자료 삭제");
	}
}
