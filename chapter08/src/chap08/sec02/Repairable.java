package chap08.sec02;

public interface Repairable { }

class Unit{
	int hitpoint;
	final int MAX_HP;
	
	Unit(int hp){
		MAX_HP=hp;
	}
}

class GroundUnit extends Unit{
	GroundUnit(int hp){
		super(hp);
	}
}

class AirUnit extends Unit{
	AirUnit(int hp){
		super(hp);
	}
}

class Tank extends GroundUnit implements Repairable{
	Tank(){
		super(150);
	}
	
	@Override
	public String toString() {
		return "TANK";
	}
}

class SCV extends GroundUnit implements Repairable{
	SCV(){
		super(50);
	}
	
	@Override
	public String toString() {
		return "SCV";
	}
	
	public void repair(Repairable r) {		//Repairable이 인터페이스고
		if(r instanceof Unit) {				//r에 자식클래스가 오고, Unit이 부모클래스인데
			Unit u=(Unit)r;					//부모클래스 타입의 변수에 자식클래스타입을 넣는데 왜 강제형변환해야함?
			while(u.hitpoint != u.MAX_HP) {
				u.hitpoint++;
			}
			System.out.println(u.toString()+"의 수리가 끝났습니다");
		}
	}
}


class Marine extends GroundUnit{
	Marine(){
		super(100);
	}
	
	@Override
	public String toString() {
		return "MARINE";
	}
}

class DropShip extends AirUnit implements Repairable{
	DropShip(){
		super(200);
	}
	
	@Override
	public String toString() {
		return "DropShip";
	}
}