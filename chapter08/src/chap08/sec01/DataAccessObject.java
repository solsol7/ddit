package chap08.sec01;

public interface DataAccessObject {
	public void select();	//abstract가 생략될 수 있음  -> 안써줘도 자동으로 들어가기 때문에 보통 안씀
	public void insert();
	public void update();
	public void delete();
}
