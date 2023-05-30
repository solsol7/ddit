package chap11.sec01;

public class ObjectExample {

	public static void main(String[] args) {
		Person p1=new Person("ȫ�浿");
		System.out.println("getinfo : "+p1.getinfo());
		System.out.println("toString() : "+p1.toString());
		
		//Person p2=p1;
		Person p2=new Person("ȫ���");
		if(p2.equals(p1)) {	//������ ������ �ƴ϶� �ּҰ� �����ǵ� ��������� -> ��ü���������� ���� equals�޼ҵ尡 ���ִ°���
							//p2�� ����ִ� toString �޼ҵ尡 ȣ���(p2.toString()) -> Override��
			System.out.println("���� ����");
		}else {
			System.out.println("�ٸ�����");
		}
	}

}

class Person{	//Person�̶�� Ŭ�������� toString�̶�� �޼ҵ尡 ����(���������� �Ⱥ���) -> ObjectŬ���� ��ӹ޾����ϱ� toString�޼ҵ� ����
	private String name;	//��������� private���� �Ǿ��־ �ܺο����� �� Ŭ������ ������ ������ �Ұ����� ��
							//
							// +) db�� ���� Ŭ������ü�� �ϳ��� �����Ǿ���� ->�̱��� �����
							//private���� ����� ������� -> ��κ� �����ڸ޼ҵ� �Ἥ �ʱ�ȭ ��Ŵ & �� ������ �ϳ����ϳ��� ������ �������ų� �ϳ����ϳ��� �ۿ� �ִ� ������ ������ �����ϰ��� �� �� getter, setter�޼ҵ� ��
							//������ �ִ� ������� �Ѳ����� ����ϰ���� ���� toString�޼ҵ带 �����
	
	Person(String name){
		this.name=name;
	}
	String getinfo() {
		return getClass().getName()+'@'+ Integer.toHexString(hashCode());	//hashCode ȣ�� -> PersonŬ������ �ּҰ��� 10������ ��ȯ -> toHexString -> �װ� 16���� ���ڿ��� ��ȯ�϶�
	}
	
	@Override
	public String toString() {
		return name;
	}
}