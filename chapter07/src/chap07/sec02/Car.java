package chap07.sec02;

public class Car { //������

	public static void main(String[] args) {
		Car01 c1=new FireEngine();  //upcasting
		
		System.out.println("c1.color="+c1.color);  //����-> �θ�Ŭ������ ������ ȣ����
		c1.drive(); //Car Ŭ������ �ִ� drive �޼ҵ�
		c1.stop();	//FireEngine Ŭ������ �ִ� stop�޼ҵ�(�������̵��� ��)
		//c1.water(); //->���� : water�޼ҵ�� �ڽ�Ŭ������ FireEngine�̶�� Ŭ�������� �����ϰ� ���ǵ� �� �̱� ������ Car01Ŭ�������� ȣ�� �� �� ����
						//�ڽ�Ŭ�������� �����ϰ� ���� �� �޼ҵ�� �θ�Ŭ������ �ҷ��� ����� �� ����
		FireEngine fe=null;
		if(c1 instanceof FireEngine) {	//downcasting --�ڽ�Ŭ���� ������ �޼ҵ带 �������������  c1 Ŭ���� ��ü�� FireEngineŸ������ �Ǻ��������
			fe=(FireEngine)c1; 	//ĳ��Ʈ������ ������ �� ����
		}
		fe.water();
		System.out.println("fe.color="+fe.color);
	}
}

class Car01{
	String color="blue";
	int door;
	
	public void drive() {
		System.out.println("���� ���� ���Դϴ�");
	}
	public void stop() {
		 System.out.println("���� ���߾����ϴ�");
	}
	
}
