package chap07.sec01;

public class Student extends People {//�ڽ�Ŭ����
	private String ssn;
	Student(String name, int age, String gender, String ssn){
		super(name,age,gender); //�θ�Ŭ������ �����Ǿ��� �� �ʿ��� �����͸� ��ȣ�ȿ� �־������
		this.ssn=ssn;
	}
	
	

}
