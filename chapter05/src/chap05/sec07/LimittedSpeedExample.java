package chap05.sec07;

import java.util.Scanner;

public class LimittedSpeedExample {

	public static void main(String[] args) {
		String str="";
		Scanner sc=new Scanner(System.in);
		System.out.println("1. ������");
		System.out.println("2. �ó� ����");
		System.out.println("3. �ÿ� ����");
		System.out.println("-------------------");
		System.out.print("��ȣ �Է� : ");
		int num=sc.nextInt();
		LimitedSpeed[] str1=LimitedSpeed.values();
		if(num==1) {
			str="SchoolZone";
		}else if(num==2) {
			str="Downtown";
		}else if(num==3) {
			str="ContrySide";
		}else {
			System.out.println("�۾���ȣ �Է� ����");
			System.exit(0);
		}

		LimitedSpeed limitSpeed=LimitedSpeed.valueOf(str);	
		switch(limitSpeed) {	//limitSpeed -> ������ �����
		case SchoolZone : 
			System.out.println(limitSpeed.getValues()+"������  �ӵ��� �����ؾ� �մϴ�");
			System.out.println(limitSpeed.ordinal());	//ordinal ����� ��� ° �������� �˷���
			break;
		case Downtown : 
			System.out.println(limitSpeed.getValues()+"������  �ӵ��� �����ؾ� �մϴ�");
			break;
		case ContrySide : 
			System.out.println(limitSpeed.getValues()+"������  �ӵ��� �����ؾ� �մϴ�");
			break;
		}
	}

}

