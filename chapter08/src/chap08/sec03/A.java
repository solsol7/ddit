package chap08.sec03;

interface I {
	public void methodB();
}



//public class A {	//�����						--�����ڿ� ����ڰ� ���� ����Ǿ����� -> �������� : ��ü���� ���α׷����� �����ؾ���
//	public void methodA(B b) {
//		b.methodB();
//	}
//}
//
//class B{	//������
//	public void methodB() {
//		System.out.println("methodB()");
//	}
//}

public class A {	//�����						
public void methodA(I i) {						//--����ڴ� �����ڸ� ��, �Ű������� �������̽� Ÿ�� - �������̽��� ����  ��
	i.methodB();
}
}

class B implements I{	//������					--������ -> ����� A�� �������̽��� methodB�� ȣ�������� �����δ� �������̽��� ������ BŬ������ �������̵��� methodB�� ȣ���
	@Override
	public void methodB() {					//�������̵��� ��
	System.out.println("methodB()");
}
}










