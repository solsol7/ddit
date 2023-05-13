package chap05.sec02;

import java.util.Scanner;

public class ArrayHomework {

	public static void main(String[] args) {
		Homework hm=new Homework();
		hm.method03();

	}

}

class Homework{
	Scanner sc=new Scanner(System.in);
	public void method01() {
		/*[문제1] 키보드로 거스름돈을 입력받아 화폐단위별로 맷수를 구하시오.
		 		화폐단위 : 10000,5000,1000,500,100,50,10*/
		System.out.print("거스름돈을 입력하세요.");
		int change=Integer.parseInt(sc.nextLine());			 			//거스름돈
		int[] money= {10000, 5000, 1000, 500, 100, 50, 10}; 			//화폐단위를 저장
		int[] count= new int[7]; 							 			//맷수 저장  
		for(int i=0; i<money.length; i++) {					 			//화폐단위별로 맷수 구하기
				for(int j=1; j<=change/money[i]; j++) {					//맷수 카운팅
					count[i]+=1;
				}
			change=change-(change/money[i]*money[i]);
		}
				for(int i=0; i<count.length; i++) {
		System.out.println(money[i]+"원의 갯수는"+count[i]+"개");
		}
		}
	
	public void method02() {
		/* 문제2] 주사위를 50번던져 나온 각각의 눈의 횟수를 구하고 이를 히스토그램으로 출력하시오
	    ex)
	    1 : ********(8)
	    2 : *********(9)
	    3 : **********(10)
	    4 : ********(8)
	    5 : *********(9)
	    6 : *******(7) */
		
		int result;
		int[] count= new int[6];		//각각의 눈의 횟수
		for(int i=0; i<50; i++) {
			result=(int)(Math.random()*6+1);  //주사위 눈의 값
			for(int j=1; j<=count.length; j++) {
				if(result==j) {
				count[j-1]+=1;
			}
			}
		}
		for(int i=1; i<=count.length; i++) {
			System.out.println(i+" : ");
			for(int j=0; j<count[i-1]; j++) {
			System.out.print("*");
			}
			System.out.println("("+count[i-1]+")");
		}
		}

	
	public void method03() {
		//문제3] 정수 10개를 배열에 저장 한 후 최대값과 최소값을 구하시오.
		Scanner sc=new Scanner(System.in);
		int[] array=new int[10];
		System.out.print("숫자 10개를 입력하시오. : ");
		for(int i=0; i<10; i++) {
			int num=sc.nextInt();
			array[i]=num;
		}
		int max=array[0];
		int min=array[0];
		for(int i=0; i<array.length; i++) {
			if(max<=array[i]) {
				max=array[i];
			}
			if(min>=array[i]) {
				min=array[i];
			}
		}
		System.out.printf("최댓값 : %d, 최솟값 : %d",max,min);
	}
}
