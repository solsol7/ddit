import java.util.Scanner; // package�� ���� ������ import�� ���߿� ���;� ��

public class TrinomialOperator {
		static Scanner sc= new Scanner(System.in);    // static�� �ҷ��� ������ �ҷ��� ������ �͵� static�̾�� ��
													//  static --��ü �������ص���
													//Ŭ�������� �������� ����ؾ� �� �������� static���� ��
		public static void main(String[] args) {
		// ���׿����� : (���ǽ�)? ��ɹ�1 : ��ɹ�2
		// - ���ǽ��� �� ��� ���̸� ��ɹ�1�� �����ϰ�, 
		//	 �����̸� ��ɹ�2�� ������
		// - ��ɹ�1,2���� ���̳� ������� ���
		method2();
	}
	public static void method1() {
		// ���̸� �Է� �޾� �������� �̼��������� �Ǻ��ϴ� ���α׷�

		System.out.print("�����Է� : ");
		int age=sc.nextInt();   //���ڿ� �Է¹޾� ������ ����ȯ / <ó������ ������ �Է¹ޱ�>
		String str=(age>=18)? "�������Դϴ�" : "�̼������Դϴ�";
		System.out.println("���� : "+age+"==>"+str);
	}
	
	public static void method2() {
		//Ű����� ������ �Է¹޾� 
		// 100~90 : A, 89~80 : B, 79~70 : C
		// 69~60 : D, �� �����̸� F���
		System.out.print("���� �Է� : ");
		int score=Integer.parseInt(sc.nextLine());  //(nextLine)���� Ű ġ�� ������ �Է¹��� ���� �ԷµǾ���
													//   - (Integer.parseInt(���ڿ��� ���������� �ٲ�))�Է¹��� ���� Integer�� �ٲ���
													//ex) ���ڿ� -> �Ǽ��� (Double.parseDouble())
		String grade=(score>=90)? "A" : (score>=80)? "B" : (score>=70) ? "C" : (score>=60) ? "D" : "F";
		//String grade=(score>=90? "A" : (score>=80? "B" : (score>=70 ? "C" : (score>=60 ? "D" : "F"))) );
		System.out.println(score+"=>"+grade+"����");
	}
	
}

//static : ���α׷��� ����� �� �������, ����� �� �ʱ�ȭ��, �޼ҵ念���� �� �ϳ��� �������, 


//��������(�޼ҵ� �ȿ��� ����Ǿ����� ����), ��������(static), �������(Ŭ������ ��ü�� ������ ������ �ʱ�ȭ)
//�ʱ�ȭ���  : =0, �����ڸ޼ҵ� �̿�(������� �ʱ�ȭ), �ʱ�ȭ�� ���

