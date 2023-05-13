package chap05.sec02;

import java.util.Scanner;

public class OneDimArrayExample02 {

	public static void main(String[] args) {
		OneDimArray02 od2=new OneDimArray02();
		od2.setName();
		od2.getName();
		od2.exchange();

	}

}

class OneDimArray02{
	Scanner sc=new Scanner(System.in);
	String[] name = new String[5];    //배열이 만들어지려면 new 쓰거나 초기화해줘야함  문자열이 저장되는 공간에 name이 아니라 name은 주소값 저장됨. 주소값 따라가면 저장된 배열 나옴
										//name ->멤버변수
	public void setName() { //자기 클래스이기 때문에 ()안에 name 안적어도 가져다쓸 수 있음
		for(int i=0; i<name.length; i++) {
			System.out.print((i+1)+"친구이름 입력: ");
			name[i]=sc.nextLine();
		}
	}
	
	public void getName() {//여기서 출력하고 끝날거면 void-반환타입 없음,  처리하고 값을 되돌려 받아야하면 반환타입 있어야함//배열반환 어려워서 없는 타입으로 구성
		for(int i=name.length-1; i>=0; i--) {
		//	for(int i=0; i<name.length; i++) {				//위랑 똑같은 코드
		//		System.out.println(name[(name.length-1)-i]);
		//	}
			System.out.println(name[i]);
			
		}
		
		
	}
	
	public void exchange() {
		String temp=null;
		temp=name[0];
		name[0]=name[4];
		name[4]=temp;
		
		for(String str:name) { //배열에 들어있는 첫번째 요소의 자료를 str에 넣어줌-> 두번째자료 " ~~    / 배열이거나 collection framework일때 사용
			System.out.printf("%5s",str);
		}
	}
}



//예제2] 키보드로 5명의 친구이름 입력 받아 배열에 저장하고 역순으로 출력하시오.

//예제3] 예제2의 첫번째 친구이름과 마지막 친구 이름을 서로 바꾸시오

//예제4] 로또번호를 생성하여 출력하시오  -> 숫자 45개가 저장될 기억장소 만들고 1~45 저장시킴, 백만번쯤 교체, 6개 뽑기

//예제5] 금액을 1000원단위로 입력하여 예제 4번의 로또번호를 금액만큼 출력하시오. -> 로또를 5천원어치 산다 -> 백만번쯤 교체하는걸 5번(할때마다 매번 섞어서 앞에서부터 6개 가져오기)
															//입력한 금액 나누기 천원 횟수

