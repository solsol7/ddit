package chap02.sec03;

public class CastExample03 {

	public static void main(String[] args) {
		/* ���� : 1���� 365.2422���̴�. �� �ڷ�� 
		 "1���� 365�� xx�ð� xx�� xx�� �̴�."�� ����ϵ��� ���α׷� �Ͻÿ�.*/
		double i;
		double hour, min, sec;
		i=0.2422;
		
		hour=i*24;       //0.2422���� �ð����� �ٲٱ�
		double re1;    
		re1=hour%1;        //�ð����� �ٲ� �� ������ ���ϱ�
		hour=hour-re1;       //�ð�-������
		
		min=re1*60;
		double re2=min%1;
		min=min-re2;		
		
		
		sec=re2*60;
		double re3=sec%1;
		sec=sec-re3;
		
		System.out.printf("1���� 365�� %d�ð� %d�� %d�� �̴�.",(int)hour, (int)min, (int)sec);
	}

}

