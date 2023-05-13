package chap04.sec01;

import java.util.Scanner;

public class SwitchStatementExample {  

	public static void main(String[] args) {
		SwitchStatement sw=new SwitchStatement(); //��ü ���� / ���� ������ �޸� �ּҸ� sw���� ��, sw����ϸ� �ּҰ� ����
		//sw.method1();
		//sw.method2();
		//sw.method3();
		sw.method5();

}
}

class SwitchStatement {//���θ޼ҵ尡 ���Ե� Ŭ������ public�� �پ�� ��, �ٸ� ���Ϸ� ���鶧�� �پ O
	//���������� �ʱ�ȭ���Ѿ���, ��������� �ʱ�ȭ �Ƚ��ѵ� �ڹٿ��� �ʱ�ȭ������
	Scanner sc=new Scanner(System.in);   // ���θ޼ҵ忡�� ����(static�� ���� �޼ҵ�) Scanner �տ� static�� �����
										//										static - ��������, ���� Ŭ������ ����ϴ� ����
	public void method1() {//�޼ҵ� ���� �� ���������� �����(public- ��𿡼���(�ٸ� Ŭ����, �ٸ� �޼ҵ�) �ҷ��� �� �� O)
			//					 protected ��Ű�� �ȿ� �ִ� ��� ���Ͽ��� ����� �� O
			// 					default ���� ��Ű�� �ȿ����� ���� ����
			//					private �ϳ��� Ŭ���� �ȿ����� ���� ���� (��κ��� �������)
			// void - ��ȯŸ�� ����. �ǵ����ִ� ���� ����
			System.out.println("ȸ������Է�(1-3) : ");
			int grade = Integer.parseInt(sc.nextLine());
			
			switch(grade) {
			case 1 : 
				System.out.println("VIPȸ�� �Դϴ�");
				break;
			case 2 : 
				System.out.println("��� ȸ���Դϴ�");
				break;
			case 3 :
				System.out.println("�Ϲ� ȸ���Դϴ�");
				break;
			default : 
				System.out.println(grade+"�� �߸��� ��� �ڵ� �Դϴ�.");
			}
	}
	
	public void method2() {
		System.out.print("�� �Է�(1-12) : ");
		int month = sc.nextInt();//->������� ���� /  int month=Integer.parseInt(sc.nextLine());-->���ͱ��� ����
		
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: // or�� ����� �� �� �����ؼ� �ᵵ o
			 System.out.println(month+"���� ������ ��¥�� 31�ϱ��� �ִ� ���Դϴ�");
			 break;
		case 4: case 6: case 9: case 11:
			System.out.println(month+"���� ������ ��¥�� 30�ϱ��� �ִ� ���Դϴ�");
		default : 
			System.out.println(month+"���� ������ ��¥�� 28���� 2���Դϴ�.");
		}
	}
	
	public void method3() {
		System.out.println("������ ���� �ڵ� �Է�(kr, jp, ch) : ");
		String code=sc.nextLine();
		switch (code) {
		case "kr" :
			System.out.println("���ѹα�");
			break;
		case "jp" : 
			System.out.println("�Ϻ�");
			break;
		case "ch" : 
			System.out.println("�߱�");
			break;
		}
	}
	
	public void method4() {
		System.out.println("���� �Է� : ");
		int score=sc.nextInt();
		String grade = "";
		switch (score/10) {
		case 10 :
			grade = "A";
			break;
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		default :
			grade = "fail";
		}
			switch(score%10) {
			case 0: case 1: case 2:
				grade=grade+"-";
				break;
			case 3: case 4: case 5:
				grade=grade+"0";
				break;
			case 7: case 8: case 9:
				grade=grade+"+";
		}
		System.out.println("����"+score+"�� "+grade+" �����Դϴ�.");
	}
	
	public void method5() {
		double i = 0.2422;
		double a = i*24;
		int c = 52;
		System.out.println(a);
		System.out.println(a%1); // 5.8128�� 1�� ���� �������� ���ߴ��� 0.8128�� ����
		System.out.println(a%2);
		System.out.println(c%10); // 52/10=5.2 -->  5.2�ε� �� �������� 0.2�� �ƴ϶� 2�� ����?
	}
}

