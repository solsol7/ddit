package chap07.sec01;

public class StudentExample {

	public static void main(String[] args) {
		Student s1=new Student("ȫ�浿",25,"����","abc@naver.net");
		System.out.println("�л��� : "+s1.name); //Student���� name���� �ȵǾ��ִµ��� �ڱ��ó�� �� �� ����
		System.out.println("���� : "+s1.age);
		
		People p2=new People("������",30,"����"); //�̹� �����Ǿ���ȱ� ������ ����� �� �ִ� ����� ����
	}

}
