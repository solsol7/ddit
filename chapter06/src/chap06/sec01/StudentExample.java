package chap06.sec01;

public class StudentExample {

	public static void main(String[] args) {
		Student1 s1=new Student1();		//new Student() �̰� ���� �ȵ� - �����͸� �Է��� �� �ִ� ����� ����	// set�޼���(/* */�κ�) �־�� �� �� O
		s1.setStdID(1001);
		s1.setStdName("�̼���");
		
		s1.showInfo();
		System.out.println(s1);
		
		Student1 s2=new Student1(1002,"ȫ���");
		System.out.println(s2);
	}

}
class Student1{	//��ü ������ �� �л����� ���� ����ִ¹��
	private long stdID;
	private String stdName;		//Ŭ������ � ������ �������ֳ�? - Ŭ������ Ư��(�Ӽ�)�� �������� �� ���Ǵ� �� - �������
								//private �ۿ��� ���� �Ұ���- �ʱ�ȭ��� : �����ڸ޼ҵ��̿�(��κ�), ����/�� ������ �������� -getter/setter
								// 		�⺻Ű�� �ȹٲ�- Ű��Ű ������ ������ ���� ����� ��(����)-������Ʈ�� �ڷ�� �ٲپ����- �ٵ� private�̶� ���� ���� - ������ �� �ִ� ��� �����ؾ��� - getter/ setter
	//vo/ dto : ����,getter,setter�޼ҵ常���� ������ Ŭ����	
	//db�� ����� �����͵��� ��������� ����(�Ӽ��� ����/���� ����� ����)
	
	//Student()  - �����ڸ޼ҵ� : ��ü ������ ����(new�����ڿ� ���ؼ���) ȣ���� �� ����, ���� �� ȣ���ϴ� �޼ҵ� X
	public Student1() {}   //�����ڸ޼ҵ� : �⺻������
							//����ڰ� �����ڸ� ������ �ʾ��� �� �⺻������ �ڵ�����(�ϳ��� ����� �ڵ���������)
							//�⺻������ ���������� ���
	public void setStdID(long stdID)  {						//set������
		this.stdID=stdID;								//set�޼��� - ��ȯ�� ����,�Ű����� O/  get�޼��� - ���� ������ : ��ȯ�� ����,�Ű����� X
	}
	
	public void setStdName(String stdName)  {						//set ������
		this.stdName=stdName;								//set�޼��� - ��ȯ�� ����,�Ű����� O/  get�޼��� - ���� ������ : ��ȯ�� ����,�Ű����� X
	}

	
	
	public Student1(long stdID, String stdName) {		//()�ȿ� ����� �� : �Ű����� - �տ��ִ� Student �޼ҵ忡 �Ҽӵ� �� -�� �޼ҵ忡�� ���ǵǾ����� ��������
														//�Ű������� ���� ��(��������)�� ��������� �÷����� �� �޼ҵ尡 �������� ��� ���� ������
		//�����ڸ޼ҵ��� �Ű������� ���� Ÿ���� ������ ���ڿ��̸�(new Student(1,"ȫ�浿")) public Student(long stdId, String stdName)�갡 �ҷ���/�������� public Student() �갡 �Ҹ�
		this.stdID=stdID;		
		this.stdName=stdName;	//�������� - �ּ����� / ������ �ּ�(��������� �ּ�)�� ������ �ִ� �������� : this
								//this - ���������� ��������� �Ȱ��� ���縵�� �Ȱ��� ����� ��- ��������� ��Ī�� �� ��
								//Ư���������������� :   this-�ڱ��ڽ����ּ� / super-�ڱ�θ��� �ּ�
								//					this, super �޼ҵ嵵 ���� 
	}

	public void showInfo() { //�������
		System.out.println("�й� : "+stdID); //this �ٿ����ǰ� �Ⱥٿ�����  - �Ű������� ��������� �Ȱ������ �Ȱ������縵���� �Ǿ��ִ� ��쿡 ������� ȣ���� �� �� - ������ �Ű����� ����
		System.out.println("�̸� : "+stdName);
	}
	//����� mainŬ�������� �ϰ���� �� - @Override
	
	@Override
	public String toString() { //��������� �� �ϳ��� ���ڵ� �����ϸ� �ȵ�(�̸��ٲ㾲��, ���������� �ٲٱ�, Ÿ�� �����ϱ�... X)
		return "�й� : "+stdID+"�̸� : \n"+stdName;  //��ȯ������
	}
}