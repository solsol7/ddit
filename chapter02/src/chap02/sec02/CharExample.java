package chap02.sec02;

public class CharExample {

	public static void main(String[] args) {
		//char : 2byte(��ȣ���� ����:0~65535)

		char ch1='��'; //44032;
		System.out.println((char)(ch1+10));

		for(char ch='A'; ch<='Z'; ch++) {
			System.out.println(ch+"="+(int)ch);
		}
		for(int i=0; i<=255; i++) {
			System.out.println(i+"=>"+(char)i);
		}

		}
	}

