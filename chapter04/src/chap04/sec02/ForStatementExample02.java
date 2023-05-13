package chap04.sec02;

import java.util.Scanner;

public class ForStatementExample02 {

	public static void main(String[] args) {
		ForStatement02 ss = new ForStatement02();
		//ss.numberOfVowels();
		ss.numberOfVowels();
	}
}

class ForStatement02{//접근제어자 생략되면 default(클래스 내부, 자신이 속한 패키지에 있는 모든 클래스가 접근할 수 o)
	Scanner sc=new Scanner(System.in); //ForStatement02 - Scanner : 포함관계
										// ForStatemen02 클래스가 Scanner라는 클래스를 변수로 사용한다
	public void numberOfVowels() {
		int count=0;  //지역변수는 반드시 초기화시켜야 함
		
		System.out.println("단어입력 : ");
		String word=sc.nextLine();
		
		for(int i=0; i<word.length(); i++) //index -> 0부터 카운팅. i-> 인덱스이기 때문에 i<=word.length(); 하면 오류남
			if(word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'
				||word.charAt(i)=='o'||word.charAt(i)=='u'){ //글자 한글자씩 추출   persimmon->String,  p->char        
					count++;						         //charAt(인덱스) :인덱스위치에 있는 글자 하나를 떼어내서 캐릭터로 반환함,	문자(char)니까 charAt(인덱스)=='' (큰따옴표X)
					}								
			System.out.println(word+"에 포함된 모음의 수는 : "+count);
	}

	public void fibonacciNumber() {
		int ppNum=1;	//전전수
		int pNum=1; 	//전수
		int currNum=0;	//현재수
		System.out.printf("%3d%3d",1,1); //% : 형식 지정 문자열
		for(int i=1; i<=50; i++) {
			currNum=ppNum+pNum;
			if(currNum>50) {
				break;  //자신이 속한 반복문 또는 switch문 벗어남 ->if문 벗어남(X), for문 벗어남(O)
			}else {
				System.out.printf("%3d",currNum);
				ppNum=pNum;
				pNum=currNum;
			}
		}
	}
	
}




//is a : 상속관계
//has a : 포함관계

