package chap05.sec02;

import java.util.Scanner;

public class OneDimArrayExample03 {

	public static void main(String[] args) {
		OneDimArray03 od3=new OneDimArray03();
		od3.getLottoNumber();
	}

}

class OneDimArray03{
	int[] lotto = new int[45];
	
	OneDimArray03(){//생성자메소드 , 클래스객체가 생성될때 호출되어짐 (위에 main 메소드에 new OneDimArray03(); <-)
		for(int i=0; i<lotto.length;i++) {
			lotto[i]=i+1;
		}
		
	}
	public void suffle() { //배열에 차례대로 들어간 숫자 섞기
		for(int i=0; i<10000000; i++) {
			int rnd=(int)(Math.random()*45); //바꿀 위치값
			int temp=lotto[0];
			lotto[0]=lotto[rnd];
			lotto[rnd]=temp;
		}
	}
	
	public void getLottoNumber() {
		Scanner sc=new Scanner(System.in);
		System.out.print("구입금액을 1000원 단위로 입력 : ");
		int money=Integer.parseInt(sc.nextLine());
		for(int i=1; i<=money/1000; i++) {
			suffle();
			System.out.printf("%2c ",(char)(i+64));
			for(int j=0; j<6; j++) {
				System.out.printf("%5d", lotto[j]);
				
			}
			System.out.println();
		}
	}
	
}


