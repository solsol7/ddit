package chap07.sec05;

public abstract class Unit {
	int x;
	int y;
	String nm;
	
	Unit(String nm){
		this.nm=nm;
	}
	
	public void stop(String nm, int x, int y) {
		System.out.println(nm+"이 ("+x+","+y+")에 멈춥니다");
	}

	public abstract void move(int x, int y);
}

class Marine extends Unit{
	
	Marine(){
		super("해병");
	}
	
	@Override
	public void move(int x, int y) { //x,y 지역변수
		System.out.println(nm+"이("+this.x+","+this.y+")에서 ("+x+","+y+") 위치로 이동합니다");
	}
	
	public void stimPack() {	//Marine 클래스의 고유 메소드
		System.out.println("공격모드 : 스팀팩 장전");
	}
}

class Tank extends Unit{
	Tank(){
		super("탱크");
	}

	@Override
	public void move(int x, int y) {
		System.out.println(nm+"이("+this.x+","+this.y+")에서 ("+x+","+y+") 위치로 이동합니다");
		
	}
	
	public void sizMode() {
		System.out.println("공격모드 : 시즈모드로 전환");
	}
}