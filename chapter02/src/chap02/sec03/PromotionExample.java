package chap02.sec03;

public class PromotionExample {

	public static void main(String[] args) {
		// promotion : �ڵ��� ��ȯ
		//ǥ�������� ū������ ��ȯ
		//���Ŀ����� int���� ���� Ÿ���� �ڷ��  int�� ��ȯ ��
		byte b1=100;
		short s1=20;
		
		int res1=b1+s1; //short (X) -> b1, s1�� int���� ���� Ÿ���̹Ƿ� int�� ��ȯ
		float f1=20f;
		long l1=1000L;
		
		float res2=f1+l1;  //long (X)  -> long���� float�� ǥ�������� �� ����
		

	}

}

