package chap06.sec08;

public class DriverExample {

	public static void main(String[] args) {
		new DriverExample().controller();		//���θ޼ҵ尡 static�̱� ������ �ڱ��ڽ��� ������Ŵ
	}
	
	public void controller() {					//�ڱ� �ڽ��� �����ϰ� ���� �ڽſ� ���Ե� �޼��带 �����ϱ� ������ ���� static���� �ʾƵ� ��
												//static�� ���� ���� �޼ҵ带 ȣ���ϴ� �� -> new�����ڿ� ���� �ڱ��ڽ��� ��ü ���� -> �޼ҵ� �θ���
		Driver driver=new Driver();
		Taxi taxi=new Taxi();
		driver.drive(taxi);			//�θ�Ŭ���� �̸����� taxiŬ���� ��ü�� �־��� -> ������
		driver.drive(new Bus(15));	//�ڽ�Ŭ���� ��ü�� ���� ���ڷ� �־��� -> �θ�Ŭ���� Ÿ���� �Ű������� �־��� -> ������
	}

}
