package chap06.sec05;

public class SingletonExample {

	public static void main(String[] args) {
//		Account ac=new Account();					//Account ac=new Account ->�����ڸ޼ҵ� ���ڴ� : ���������ڰ� private���� �Ǿ��ֱ� ������ ������
		Account ac1=Account.getInstance();  //getInstance -> static�� public�� -> ��ü�� �������� �ʾƵ� �ҷ��� �� �� ����
		Account ac2=Account.getInstance();
		Account ac3=Account.getInstance();
		System.out.println("ac1="+ac1);
		System.out.println("ac2="+ac2);
		System.out.println("ac3="+ac3);
	}

}

