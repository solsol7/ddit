/*�迭����] �Ʒ� �ܾ� 5���� �迭�� �����ϰ� ������ �ܾ ������ �� �ܾ� ���� ö�ڸ� ���� ����ڿ��� �����Ѵ�
	����ڴ� ���õ� ö�ڸ� ���� �ܾ ���ߴ� ����
	�õ� Ƚ���� ����� ��
	[���þ�] hope, apple, banana, orange, love*/

package chap05.sec03;

import java.util.Scanner;

public class WordScambleExMe {

	public static void main(String[] args) {
		WordScambleMe wd=new WordScambleMe();
		wd.choiceWord();
		String word=wd.choiceWord();
		String skWord=wd.shake(word);
		System.out.println("���þ� : "+skWord);
		System.out.print("������ �Է��ϼ��� : ");
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
				System.out.println("�����Դϴ�.");
				System.out.println("�Է� Ƚ�� : "+count);
				break;
			}else {
				System.out.println("������ �ƴմϴ�. �ٽ� �Է��ϼ���.");
				System.out.println("�Է� Ƚ�� : "+count);
			}
		}
	}

	
}
		
	

