package chap05.sec07;

public class Controller {

		public static void main(String[] args) {
			Menu[] m1=Menu.values();		//value�� ���� �����Ǿ��� �� ������ Ŭ������ü�� �迭 Ÿ������ ��ȯ�� / ��ȯŸ���� �ش� ������ ��ü�� �迭 Ÿ��
			for(int i=0; i<m1.length; i++) {
				System.out.println(m1[i]);  //m1�� ���� �ּҰ� ��ȯ��    //m1[i] -> ����� ��ȯ
			}
			
			for(Menu m:Menu.values()) {				
				System.out.print(m+"(");
				System.out.println(m.getValue()+")");		//value�� ��ȯ�ϰ� �ϴ� �޼ҵ� ȣ��
			}
		}
}
