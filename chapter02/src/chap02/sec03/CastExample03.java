package chap02.sec03;

public class CastExample03 {

	public static void main(String[] args) {
		/* 문제 : 1년은 365.2422일이다. 이 자료로 
		 "1년은 365일 xx시간 xx분 xx초 이다."를 출력하도록 프로그램 하시오.*/
		double i;
		double hour, min, sec;
		i=0.2422;
		
		hour=i*24;       //0.2422일을 시간으로 바꾸기
		double re1;    
		re1=hour%1;        //시간으로 바꾼 후 나머지 구하기
		hour=hour-re1;       //시간-나머지
		
		min=re1*60;
		double re2=min%1;
		min=min-re2;		
		
		
		sec=re2*60;
		double re3=sec%1;
		sec=sec-re3;
		
		System.out.printf("1년은 365일 %d시간 %d분 %d초 이다.",(int)hour, (int)min, (int)sec);
	}

}

