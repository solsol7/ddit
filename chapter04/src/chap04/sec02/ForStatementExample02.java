package chap04.sec02;

import java.util.Scanner;

public class ForStatementExample02 {

	public static void main(String[] args) {
		ForStatement02 ss = new ForStatement02();
		//ss.numberOfVowels();
		ss.numberOfVowels();
	}
}

class ForStatement02{//���������� �����Ǹ� default(Ŭ���� ����, �ڽ��� ���� ��Ű���� �ִ� ��� Ŭ������ ������ �� o)
	Scanner sc=new Scanner(System.in); //ForStatement02 - Scanner : ���԰���
										// ForStatemen02 Ŭ������ Scanner��� Ŭ������ ������ ����Ѵ�
	public void numberOfVowels() {
		int count=0;  //���������� �ݵ�� �ʱ�ȭ���Ѿ� ��
		
		System.out.println("�ܾ��Է� : ");
		String word=sc.nextLine();
		
		for(int i=0; i<word.length(); i++) //index -> 0���� ī����. i-> �ε����̱� ������ i<=word.length(); �ϸ� ������
			if(word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'
				||word.charAt(i)=='o'||word.charAt(i)=='u'){ //���� �ѱ��ھ� ����   persimmon->String,  p->char        
					count++;						         //charAt(�ε���) :�ε�����ġ�� �ִ� ���� �ϳ��� ����� ĳ���ͷ� ��ȯ��,	����(char)�ϱ� charAt(�ε���)=='' (ū����ǥX)
					}								
			System.out.println(word+"�� ���Ե� ������ ���� : "+count);
	}

	public void fibonacciNumber() {
		int ppNum=1;	//������
		int pNum=1; 	//����
		int currNum=0;	//�����
		System.out.printf("%3d%3d",1,1); //% : ���� ���� ���ڿ�
		for(int i=1; i<=50; i++) {
			currNum=ppNum+pNum;
			if(currNum>50) {
				break;  //�ڽ��� ���� �ݺ��� �Ǵ� switch�� ��� ->if�� ���(X), for�� ���(O)
			}else {
				System.out.printf("%3d",currNum);
				ppNum=pNum;
				pNum=currNum;
			}
		}
	}
	
}




//is a : ��Ӱ���
//has a : ���԰���

