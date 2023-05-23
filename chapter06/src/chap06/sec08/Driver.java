package chap06.sec08;

public class Driver {

	public void drive(Vehicle vehicle) {	//매개변수로 자식클래스 객체 받음 -> 다형성
		vehicle.run();
	}

}

