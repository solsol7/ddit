package chap04.sec02;

public class ForStatementExample03 {

	public static void main(String[] args) {
		ForStatement03 fs03=new ForStatement03();
		fs03.shape05();
	}

}

class ForStatement03{
	
	public void shape01() {
		for(int i=0; i<5; i++) {	//�� ����ϴ� for��
			for(int j=0; j<=i; j++) { //*��� ����ϴ� for��
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("[1�� ����]");
	}

	public void shape02() {
		for(int i=0; i<5; i++) {	//�� ����ϴ� for��
			for(int j=0; j<i; j++) {//���� ����ϴ� for��
				System.out.print(" ");
			}
			for(int j=0; j<(5-i); j++) { //*��� ����ϴ� for��
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("[2�� ����]");
	}

	public void shape03() {
		for(int i=0; i<5; i++) {	//�� ����ϴ� for��
			for(int j=0; j<(5-i); j++) {//���� ����ϴ� for��
				System.out.print(" ");
			}
			for(int j=0; j<(i*2)+1; j++) { //*��� ����ϴ� for��
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("[3�� ����]");
	}
	
	public void shape04() {
		for(int i=0; i<5; i++) {	//�� ����ϴ� for��
			for(int j=0; j<(5-i); j++) {//���� ����ϴ� for��
				System.out.print(" ");
			}
			for(int j=0; j<i+1; j++) { //*��� ����ϴ� for��
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("[4�� ����]");
	}
	
	public void shape05() {
		for(int i=0; i<5; i++) {	//�� ����ϴ� for��
			for(int j=0; j<5-i; j++) { //*��� ����ϴ� for��
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("[5�� ����]");
	}
}

