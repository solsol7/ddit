/*배열예제] 아래 단어 5개를 배열에 저장하고 임의의 단어를 선택한 후 단어 내의 철자를 섞어 사용자에게 제시한다
	사용자는 제시된 철자를 보고 단어를 맞추는 게임
	시도 횟수도 출력할 것
	[제시어] hope, apple, banana, orange, love*/

package chap05.sec03;     //*****다시해보기

import java.util.Random;
import java.util.Scanner;

public class WordScambleEx {

	public static void main(String[] args) {
		WordScamble ws=new WordScamble();
//		ws.word[2];						//private 붙었기 때문에 가져올 수 X
		String str=ws.WordSelection();
		String question=ws.shuffle(str); 
		System.out.println("제시어 : "+question);
		ws.answer(str);
	}
}

class WordScamble{
	private String[] word= {"hope", "apple", "banana", "orange", "love"}; //String[] 앞에 private 접근지정자 붙이면 - 클래스 안에서만 사용, 클래스 벗어나면 접근할 수 X
																		//private으로 설정되어있는 멤버에 접근하기 위해 사용되는 메소드- getter  /  setter

	public String WordSelection() {
		Random rnd=new Random();
		int idx=rnd.nextInt(5);  // 0~4사이의 정수형 난수 발생
		return word[idx];
	}

	public String shuffle(String str) {	//String -> 반환타입 (void 썼던 자리)
		char[] ch=str.toCharArray(); 	//toCharArray메소드 - 문자열을 문자배열로 바꿔줌
		
		for(int i=0; i<1000; i++) {
			int r=(int)(Math.random()*ch.length);  //0<= <1 1보다 작기때문에 length에 -1 X
			char temp=ch[0];
			ch[0]=ch[r];
			ch[r]=temp;    //반환타입 - 문자열(public String shuffle) , 섞인 단어의 타입 - 문자배열 타입	
							//문자배열을 문자열로 만들어줘야함
		}
		return(new String(ch));  //매개변수 문자배열 가지고 문자열 생성해야함 -> 생성자메소드 부름
								//ch의 값을 가진 string 객체 생성★★

	}

	public void answer(String sss) {			//String question ->섞인 문자열 가지고와야함
		Scanner sc=new Scanner(System.in);
		int count=0;							//시도횟수
		while(true) {							//맞출때까지 입력받음  - for-횟수를 정해놓음.
			System.out.print("\n정답 : ");
			String str=sc.nextLine();
			count++;
			if(str.equals(sss)) {
				System.out.println("*******************");
				System.out.println("정답입니다");
				System.out.println("시도횟수 : "+count);
				System.out.println("*******************");
				break;
			}else {
				System.out.println("*******************");
				System.out.println("정답이 아닙니다");
			}
		}
	}

}

