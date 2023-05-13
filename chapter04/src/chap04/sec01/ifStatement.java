package chap04.sec01;

import java.util.Scanner;

public class ifStatement {
	static Scanner sc=new Scanner(System.in); //����ʵ�(�������)
	public static void main(String[] args) {
		method09();
	}

	public static void method01() {
		//����� �̸��� ������ �Է� �޾� 60�� �̻��̸� 
		// "�̸� �հ��Դϴ�" �޽��� ���
		String message="";
		System.out.print("�̸� �Է� : ");
		String name=sc.nextLine();
		System.out.print("���� �Է� : ");
		int score=sc.nextInt();
		
		if(score>=60) {
			message=name+"��(��) �հ��Դϴ�";
			System.out.println(message);
		}
	}
	
	public static void method02() {
		//����� �̸��� ������ �Է� �޾� 60�� �̻��̸� 
		// "�̸� �հ��Դϴ�" �޽��� ���
		// 60�� �����̸� "�̸� ���հ��Դϴ�" �޽��� ���
		String message="";
		System.out.print("�̸� �Է� : ");
		String name=sc.nextLine();
		System.out.print("���� �Է� : ");
		int score=sc.nextInt();
		
		if(score>=60) {
			message=name+"��(��) �հ��Դϴ�";
		}else {
			message=name+"��(��) ���հ��Դϴ�";
		}
		System.out.println(message);
}
	
	public static void method03() {
		/* [����] ���� �Է¹޾�
	3~5�� : "���Դϴ�", 
	6~8�� : "�����Դϴ�",
	9~11�� : "�����Դϴ�",
	12~2�� : "�ܿ��Դϴ�"�� ����ϴ� ���α׷� �ۼ� */
		System.out.print("�� �Է� : ");
		int month=sc.nextInt();
		if(3<=month && month<=5) {
			System.out.println("���Դϴ�");
		} else if(6<=month && month<=8) {
			System.out.println("�����Դϴ�");
		} else if(9<=month && month<=11) {
			System.out.println("�����Դϴ�");
		} else if(12<=month && month<=2) {
			System.out.println("�ܿ��Դϴ�");
		}
	}
	
	public static void method04() {
		/*  [����] ü�߰� Ű�� �Է��Ͽ� BMI������ ���ϰ� BMI������ ���� �򰡸� ����ϴ� ���α׷� �ۼ�
		BMI���� = ü��(kg)/(Ű(cm)*Ű(cm))
		BMI����			����
		-------------------
		0.0 ~ 18.4		��ü��
		18.5 ~ 22.9		����
		23.0 ~ 24.9		������
		25.0 ~ 29.9		��
		30.0 �� �̻� 		����        */
		System.out.print("ü�� �Է�(kg) : ");
		double kg = sc.nextDouble();
		System.out.print("Ű �Է�(cm) : ");
		double cm = sc.nextDouble();
		double m = cm*0.01;
		double BMI = kg/(m*m);
		if(0.0<=BMI && BMI<=18.4) {
			System.out.println("��ü��");
		} else if(18.5<=BMI && BMI<=22.9) {
			System.out.println("����");
		} else if(23.0<=BMI && BMI<=24.9) {
			System.out.println("������");
		} else if(25.0<=BMI && BMI<=29.9) {
			System.out.println("��");
		} else if(30.0<=BMI) {
			System.out.println("����");
		}
	}
	
	public static void method05() {
		/* [����] �����Ϸ��� �Ѵ�. ������ ������ ���̰� 18�� �̻��̸�, �����԰� 50kg�̻��̾�� �Ѵ�.
		 		�̸� ��ø if���� ����Ͽ� �����Ͻÿ�.
		 		���̿� �����Դ� ������.  */
		System.out.print("���� �Է� : ");
		int age=sc.nextInt();
		System.out.print("ü�� �Է� : ");
		double kg=sc.nextDouble();
		if(age>=18) {
			if(kg>=50) {
				System.out.println("����");
			}else {
				System.out.println("�Ұ���");
			}
		}else {
			System.out.println("�Ұ���");
		}
	}
	
	public static void method06() {
		// [����] ������ ���� �Է� �޾� Ȧ���� ¦���� �Ǻ��Ͻÿ�.
		System.out.print("���� �Է� : ");
		int number = sc.nextInt();
		if(number%2==0) {
			System.out.println("¦��");
		}
		else {
			System.out.println("Ȧ��");
		}
		
	}
	
	public static void method07() {
		/* [����] ������ �Է� �޾� �� ����  99-97:A+ / 96-93:A0 / 92-90:A-
		  						89-87:B+ / 86-83:B0 / 82-80:B-
		  						79-77:C+ / 76-73:C / 72-70:C-
		  						�� ���ϴ� F, ��ø if ���  */
		System.out.print("���� �Է� : ");
		int score = sc.nextInt();
		String grade="";
		if(score>=90) {
			grade="A";
			if(90<=score && score<= 92) {
				grade=grade+"-";
			}else if (93<=score && score<=96) {
				grade=grade+"0";
			} else {
				grade=grade+"+";
			}
		}else if(80<=score && score<=89) {
			grade="B";
			if(80<=score && score<= 82) {
				grade=grade+"-";
			}else if (83<=score && score<=86) {
				grade=grade+"0";
			} else {
				grade=grade+"+";
			}
		}else if(70<=score && score<=79) {
			grade="C";
			if(70<=score && score<= 72) {
				grade=grade+"-";
			}else if (73<=score && score<=76) {
				grade=grade+"0";
			} else {
				grade=grade+"+";
			}
		}else {
			grade="F";
		}
		System.out.println(grade);
}
	

	public static void method08() {
		// [����] ������ ���� �Է� �޾� Ȧ���� ¦���� �Ǻ��Ͻÿ�. (���׿�����)
		String s="";
		System.out.print("���� �Է�  : ");
		int i = sc.nextInt();
		s= i%2==0?"¦��":"Ȧ��";
		System.out.println(s);
		
	}
	
	public static void method09() {
		System.out.print("���� �Է��Ͻÿ�.");
		String me=sc.nextLine();
		int a=(int)(Math.random()*2+1);
		String sys="";
		if(a==0) {
			sys="�ý��� : ����";
		}else if(a==1) {
			sys="�ý��� : ����";
		}else {
			sys="�ý��� : ��";
		}
		System.out.println(sys);
		String result="";
		if(me.equals("����")) {
			if(a==0) {
				result="�й�";
			}else if(a==1) {
				result="���º�";
			}else {
				result="�¸�";
			}
		}else if(me.equals("����")) {
			if(a==0) {
				result="���º�";
			}else if(a==1) {
				result="�¸�";
			}else {
				result="�й�";
			}
		}else {
			if(a==0) {
				result="�¸�";
			}else if(a==1) {
				result="�й�";
			}else {
				result="���º�";
			}
		}
			System.out.println(result);
		
	}
}

//		if(me=="����") {
//			if(a==0) {
//				result="�й�";
//			}else if(a==1) {
//				result="���º�";
//			}else {
//				result="�¸�";
//			}
//		}else if(me=="����") {
//			if(a==0) {
//				result="���º�";
//			}else if(a==1) {
//				result="�¸�";
//			}else {
//				result="�й�";
//			}
//		}else {
//			if(a==0) {
//				result="�¸�";
//			}else if(a==1) {
//				result="�й�";
//			}else {
//				result="���º�";
//			}
//		}



