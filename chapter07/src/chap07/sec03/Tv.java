package chap07.sec03;

public class Tv extends Product{//Product상속받음
	Tv(){
		super(1000);	//1000을 가지고 Product클래스의 생성자메소드 호출
	}
	
	@Override
	public String toString() {
		return "TV";
	}
}
