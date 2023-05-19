package chap06.sec05;		//�̱������� ����� --> ���� �ȵǸ� �ܿ��

public class Account {
	private static Account ac=null;	//account�� ������ static->��ü�� �����ǵ縻�� method area�� �� �ϳ��� �������, ��ü�����Ǹ� ac��� ������ ��ü�� �ּҳ־���
	private Account() {}
	
	public static Account getInstance() {	//��ī��Ʈ ��ü�������ϰ� ��ī��Ʈ Ŭ�����̸����� �ҷ��پ��ڴ�  ��ġ Math.random()<-static�޼ҵ�//��ȯŸ���� �ڱ��ڽ�->�ڱ�Ŭ������ �ִ� �ּҰ� �����ش�  
											//��� Ŭ���������� getInstance �̸����� �����
		if (ac==null) ac=new Account();	//account==null ->��ü������ �ȵ� ���� //account!=null->��ü �����Ȼ��� -> �ѹ� �����Ǹ� ��ü ���� �������ϰ� ������ �ּҸ� ��� ��ȯ��
		return ac;								//��������� �̱����� ������
		}
	
}


//this�������� �� �� ����- ��ü�� �����Ǿ����� ���� ����ϱ� ������ this�� ���� �������� ���Ҷ����� ����


/*
public class Account {
	private static Account ac=null;	//
	private Account() {}
	
	public static Account getInstance() {	//
		if (ac==null) ac=new Account();	// Account ��ü�� �����ϴ°� new Account();�� �� �� ���� 
										//		- �ݵ�� getInstance()����� -> �ѹ� ����Ǹ� ���̻� ac�� null���� �ƴ� 
										//  	- ac�� ���� �ּ�(ó���� getInstance �̿��ؼ� ac��  �� �ּ�)�� �״�� ��ȯ��
		return ac;						//
		}
	
}
*/

