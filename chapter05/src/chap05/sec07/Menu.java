package chap05.sec07;

public enum Menu {
	Member_SignUp("ȸ�����"),			//0 �迭 -> Ŭ������üó�� ����				""�ȿ� ��� value�� ��
	Member_Update("ȸ������ ����"),		//1
	Member_Delete("ȸ��Ż��");			//2
									//������� ���ٸ� ""���ʿ�/ ""�� ���� �����ؼ� ����Ѵ� ������ ���� Ÿ���� final�� ���� -> ���� Ÿ���� ������ Ŭ������ ������ �޼ҵ� ������� ����-�ϳ��� �ϳ��� �����Ǿ�����/
											//�������� ���� ��ȯ���� �� �ϳ��� �޼ҵ�� ��� -�޼ҵ��� ��ȯŸ�� : �տ� ����Ǿ��� Ÿ��
	private final String value;	//
	
	Menu(String value){			//value�� �� ���� ->  ��ȣ�ȿ� �ִ� ���� ����, Ÿ���� ��ȣ�ȿ� �ִ� ������ Ÿ��
		this.value=value;
	}
	
	public String getValue() {
		return value;
	}
}
