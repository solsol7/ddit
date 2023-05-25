package chap08.sec01;

public class MySqlDao implements DataAccessObject{
	@Override
	public void select() {} 	//접근지정자는 원래의 추상메소드보다 좁혀서 사용할 수 없음
	public void insert() {}
	public void update() {}
	public void delete() {}
	
}
