package chap05.sec07;

import java.util.Scanner;

public class LimittedSpeedExample {

	public static void main(String[] args) {
		String str="";
		Scanner sc=new Scanner(System.in);
		System.out.println("1. 스쿨존");
		System.out.println("2. 시내 주행");
		System.out.println("3. 시외 주행");
		System.out.println("-------------------");
		System.out.print("번호 입력 : ");
		int num=sc.nextInt();
		LimitedSpeed[] str1=LimitedSpeed.values();
		if(num==1) {
			str="SchoolZone";
		}else if(num==2) {
			str="Downtown";
		}else if(num==3) {
			str="ContrySide";
		}else {
			System.out.println("작업번호 입력 오류");
			System.exit(0);
		}

		LimitedSpeed limitSpeed=LimitedSpeed.valueOf(str);	
		switch(limitSpeed) {	//limitSpeed -> 열거형 상수값
		case SchoolZone : 
			System.out.println(limitSpeed.getValues()+"이하의  속도를 유지해야 합니다");
			System.out.println(limitSpeed.ordinal());	//ordinal 상수가 몇번 째 순서인지 알려줌
			break;
		case Downtown : 
			System.out.println(limitSpeed.getValues()+"이하의  속도를 유지해야 합니다");
			break;
		case ContrySide : 
			System.out.println(limitSpeed.getValues()+"이하의  속도를 유지해야 합니다");
			break;
		}
	}

}

