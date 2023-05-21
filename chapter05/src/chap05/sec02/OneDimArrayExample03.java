package chap05.sec02;

import java.util.Scanner;

public class OneDimArrayExample03 {

	public static void main(String[] args) {
		OneDimArray03 od3=new OneDimArray03();
		od3.getLottoNumber();
	}

}

class OneDimArray03{
	int[] lotto = new int[45];
	
	OneDimArray03(){//�����ڸ޼ҵ� , Ŭ������ü�� �����ɶ� ȣ��Ǿ��� (���� main �޼ҵ忡 new OneDimArray03(); <-)
		for(int i=0; i<lotto.length;i++) {
			lotto[i]=i+1;
		}
		
	}
	public void suffle() { //�迭�� ���ʴ�� �� ���� ����
		for(int i=0; i<10000000; i++) {
			int rnd=(int)(Math.random()*45); //�ٲ� ��ġ��
			int temp=lotto[0];
			lotto[0]=lotto[rnd];
			lotto[rnd]=temp;
		}
	}
	
	public void getLottoNumber() {
		Scanner sc=new Scanner(System.in);
		System.out.print("���Աݾ��� 1000�� ������ �Է� : ");
		int money=Integer.parseInt(sc.nextLine());
		for(int i=1; i<=money/1000; i++) {
			suffle();
			System.out.printf("%2c ",(char)(i+64));
			for(int j=0; j<6; j++) {
				System.out.printf("%5d", lotto[j]);
				
			}
			System.out.println();
		}
	}
	
}


