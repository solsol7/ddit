package chap11.sec02;

import java.util.ArrayList;

public class ArrayListExample02 {

	public static void main(String[] args) {
		//���ʸ� : �÷��� �����ӿ�ũ ��ü�� ����Ǵ� �����͸� ������ 
		//		 �Է��ڷḦ �˻��Ͽ� ������ �ּ�ȭ ��Ŵ			-����ȯ(downcasting) ������ �� ����
		// �������
		// �÷��ǰ�ü <Ÿ��> ����=new �÷��ǰ�ü <Ÿ��>(); //�ԷµǴ� �ڷᰡ <Ÿ��>���� ���ѵǾ���
		ArrayList<String> list=new ArrayList<String>();
		list.add("ȫ�浿");
		list.add("������ �߱� ���� 846");
		//list.add(100)   -�Է� �Ұ���
		//list.add(new Person("������")); - �Ұ���
		
		ArrayList<Person> list1=new ArrayList<Person>();
		
	}

}
