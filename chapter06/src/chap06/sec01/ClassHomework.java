/* ����2] �й�(longŸ�� ����), �̸�(���ڿ�)�� �����ִ� �л�Ŭ������ �����Ͻÿ�
      	����� �л� ������ ����ϴ� �޼���� ����

	����3] �����ȣ(int Ÿ���� ����), �����, ��ȭ��ȣ�� ������ ���Ŭ����(Employees)
      	�� �ۼ��Ͻÿ�. ����� ������� ��� ���

	����4] ��ǰ��ȣ, ��ǰ��, ����ȸ��, ���� ������ �������ְ� ��ǰ������ ����� �� �ִ�
      	��ǰ Ŭ����(Products)�� �����Ͻÿ�.   */


package chap06.sec01;
/*
public class ClassHomework {

	public static void main(String[] args) {
		Student st=new Student();
		st.match();

	}

}

class Student{
	private long[] stdNo= {1713030, 1713031, 1713032, 1713033, 1713034};
	private String[] name= {"��տ�", "�̿տ�", "�ѿտ�", "���տ�", "�ڿտ�", "���տ�"};
	
	public void match() {
		for(int i=0; i<stdNo.length; i++) {
			System.out.print("�й� : "+stdNo[i]);
			System.out.println("       �̸� : "+name[i]);
		}
	}
}

*/



/*
public class ClassHomework {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.match();
	}

}




class Employee{
		private int[] empNo={1315,1316,1317,1318,1319};
		private String[] empName={"�趯��","�̶���","�Ѷ���","������","�ڶ���"};
		private String[] empTelNo={"010-4532-4381","010-1384-3541","010-1357-3651","010-4381-1318","010-4138-5472"};
		
		public void match() {
			for(int i=0; i<empNo.length; i++) {
				System.out.print("�����ȣ : "+empNo[i]);
				System.out.print("       ����� : "+empName[i]);
				System.out.print("         ��ȭ��ȣ : "+empTelNo[i]+"\n");
			}
		}
}

*/




public class ClassHomework {

	public static void main(String[] args) {
		Product prd=new Product();
		prd.match();

	}

}

class Product{
	private int[] prdNo={10000,10001,10002,10003,10004};
	private String[] prdName={"Ű����","�̾���","���콺","�ƹ���","�����"};
	private String[] prdMaker={"�ﶯ","����","�Ѷ�","����","�趯"};
	private int[] prdPrice={25000,30000,15800,26000,38000};
	
	public void match() {
		for(int i=0; i<prdNo.length; i++) {
			System.out.print("��ǰ��ȣ : "+prdNo[i]);
			System.out.printf("       ��ǰ�� : "+prdName[i]);
			System.out.printf("             ����ȸ�� : "+prdMaker[i]);
			System.out.printf("           ���� : "+prdPrice[i]+"\n");
			}
	}
}

