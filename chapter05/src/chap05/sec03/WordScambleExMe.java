/*배열예제] 아래 단어 5개를 배열에 저장하고 임의의 단어를 선택한 후 단어 내의 철자를 섞어 사용자에게 제시한다
	사용자는 제시된 철자를 보고 단어를 맞추는 게임
	시도 횟수도 출력할 것
	[제시어] hope, apple, banana, orange, love*/

package chap05.sec03;

import java.util.Scanner;

public class WordScambleExMe {

	public static void main(String[] args) {
		WordScambleMe wd=new WordScambleMe();
		wd.choiceWord();
		String word=wd.choiceWord();
		String skWord=wd.shake(word);
		System.out.println("제시어 : "+skWord);
		System.out.print("정답을 입력하세요 : ");
		wd.answer(word);
	}

}

class WordScambleMe{
	String[] words= {"hope", "apple", "banana", "orange", "love"};
//	String word=words[(int)(Math.random()*words.length)];
	
	public String choiceWord() {	
		for(int i=0; i<10000; i++) {
			int rnd=(int)(Math.random()*words.length);
			String temp=words[0];
			words[0]=words[rnd];
			words[rnd]=temp;
			}
		String str=words[(int)(Math.random()*words.length)];
		return str;
		}
	
	public String shake(String st) {
		char[] str=st.toCharArray();
		for(int i=0; i<10000; i++) {
			int rnd=(int)(Math.random()*str.length);
			char temp=str[0];
			str[0]=str[rnd];
			str[rnd]=temp;
		}
		return (new String(str));
	}
	
	public void answer(String wrd) {
		int count=0;
		while(true) {
			count++;
			Scanner sc=new Scanner(System.in);
			String user=sc.nextLine();
			if(user.equals(wrd)) {
				System.out.println("정답입니다.");
				System.out.println("입력 횟수 : "+count);
				break;
			}else {
				System.out.println("정답이 아닙니다. 다시 입력하세요.");
				System.out.println("입력 횟수 : "+count);
			}
		}
	}

	
}
		
	

