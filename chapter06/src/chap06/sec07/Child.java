package chap06.sec07;

public class Child extends Parent {
	String gender;
	int age=25;
	
	Child(){}
	Child(String gender,String name, int age){
		super(name,age);		//super�޼ҵ带 �ҷ��� �θ�Ŭ���� ��ü�� �������
								//�θ�Ŭ������ �����ڸ޼ҵ�� �Ȱ��� ����� super�޼ҵ尡 �ڽ�Ŭ���� �����ڸ޼ҵ� �� ù�ٿ� ���;���
		this.gender=gender;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;				//�ڽ��� ���� ��ȯ��, �θ��̸� ��ȯ�Ϸ��� super.age;    this�� super���� -> this-�ڽ��� �ּ�, super-�θ����ּ�
								//������-upcasting �򰥸��� X!!
	}
}
