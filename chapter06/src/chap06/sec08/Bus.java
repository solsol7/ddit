package chap06.sec08;

public class Bus extends Vehicle{
	int passenger;			//부모클래스로 버스클래스 객체가 생성되어 저장(upcasting)되어질 때 pessenger변수에 접근할 수 없음. 접근하려면 downcasting해야함
	
	Bus(int Passenger){
		this.passenger=Passenger;
	}
	
	@Override
	public void run() {
		System.out.println("승객 "+passenger+"명을 태운 버스가 운행중입니다.");
	}
}
