package chap06.sec08;

public class Bus extends Vehicle{
	int passenger;			//�θ�Ŭ������ ����Ŭ���� ��ü�� �����Ǿ� ����(upcasting)�Ǿ��� �� pessenger������ ������ �� ����. �����Ϸ��� downcasting�ؾ���
	
	Bus(int Passenger){
		this.passenger=Passenger;
	}
	
	@Override
	public void run() {
		System.out.println("�°� "+passenger+"���� �¿� ������ �������Դϴ�.");
	}
}
