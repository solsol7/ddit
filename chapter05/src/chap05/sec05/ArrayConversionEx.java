package chap05.sec05;

public class ArrayConversionEx {

	public static void main(String[] args) {
		ArrayConversion ac=new ArrayConversion();
		//ac.histogram();
		ac.oneToTwo();

	}

}

class ArrayConversion{
	private int[] dice =new int[6];  //�ֻ��� �� ���� �߻� Ƚ��
	
	public ArrayConversion() {		//�� Ŭ���� ��ü�� �����Ǿ����� �ڵ����� ȣ��Ǿ� �����
		for(int i=0; i<50; i++) {
			int rnd=(int)(Math.random()*6);
			dice[rnd]++;
		}
	
	}
	
	public void histogram() {
		for(int i=0; i<dice.length; i++) {
			System.out.print((i+1)+" : ");
			for(int j=0; j<dice[i];j++) {
				System.out.print("*");
			}
			System.out.println(" ("+dice[i]+")");
		}
	}
	//1������ 2���� �迭�� �ٲٱ�
	public void oneToTwo() {				
		int rowCount=dice[0];						//�迭�� ���� ����, dice[0] -> �ӽ��ִ�
		for(int i=1; i<dice.length; i++) {
			if(rowCount<dice[i]) {					//�ִ񰪱��ϱ�
				rowCount=dice[i];
			}
		}
		
		char[][] ch=new char[rowCount][6];			//�� : �߻��� ���̽� �迭�� �ִ�, ���ڹ迭(*)
		for(int i=0; i<ch[0].length; i++) {   //��
			for(int j=0; j<dice[i]; j++) {
				ch[j][i]='*';
			}
		}
		//���
		for(int i=rowCount-1; i>=0; i--) {
			System.out.printf("%2d : ",i+1);
			for(int j=0; j<ch[i].length; j++) {
				System.out.printf("%5s",ch[i][j]);
			}
			System.out.println();
		}
		System.out.println("===================================");
		System.out.println("         1    2    3    4    5    6");
	

	}
}