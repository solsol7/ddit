package chap07.sec04;

public abstract class Shape { //추상클래스 -> 객체가 될 수 없음
	String kind;
	
	Shape(String kind){
		this.kind=kind;
	}
	
	public abstract void draw();
	
	@Override
	public String toString() {
		return kind;
	}
}
