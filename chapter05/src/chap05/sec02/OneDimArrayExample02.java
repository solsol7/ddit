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
	String[] name = new String[5];    //�迭�� ����������� new ���ų� �ʱ�ȭ�������  ���ڿ��� ����Ǵ� ������ name�� �ƴ϶� name�� �ּҰ� �����. �ּҰ� ���󰡸� ����� �迭 ����
										//name ->�������
	public void setName() { //�ڱ� Ŭ�����̱� ������ ()�ȿ� name ����� �����پ� �� ����
		for(int i=0; i<name.length; i++) {
			System.out.print((i+1)+"ģ���̸� �Է�: ");
			name[i]=sc.nextLine();
		}
	}
	
	public void getName() {//���⼭ ����ϰ� �����Ÿ� void-��ȯŸ�� ����,  ó���ϰ� ���� �ǵ��� �޾ƾ��ϸ� ��ȯŸ�� �־����//�迭��ȯ ������� ���� Ÿ������ ����
		for(int i=name.length-1; i>=0; i--) {
		//	for(int i=0; i<name.length; i++) {				//���� �Ȱ��� �ڵ�
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
		
		for(String str:name) { //�迭�� ����ִ� ù��° ����� �ڷḦ str�� �־���-> �ι�°�ڷ� " ~~    / �迭�̰ų� collection framework�϶� ���
			System.out.printf("%5s",str);
		}
	}
}



//����2] Ű����� 5���� ģ���̸� �Է� �޾� �迭�� �����ϰ� �������� ����Ͻÿ�.

//����3] ����2�� ù��° ģ���̸��� ������ ģ�� �̸��� ���� �ٲٽÿ�

//����4] �ζǹ�ȣ�� �����Ͽ� ����Ͻÿ�  -> ���� 45���� ����� ������ ����� 1~45 �����Ŵ, �鸸���� ��ü, 6�� �̱�

//����5] �ݾ��� 1000�������� �Է��Ͽ� ���� 4���� �ζǹ�ȣ�� �ݾ׸�ŭ ����Ͻÿ�. -> �ζǸ� 5õ����ġ ��� -> �鸸���� ��ü�ϴ°� 5��(�Ҷ����� �Ź� ��� �տ������� 6�� ��������)
															//�Է��� �ݾ� ������ õ�� Ƚ��

