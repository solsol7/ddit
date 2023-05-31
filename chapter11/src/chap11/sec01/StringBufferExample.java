package chap11.sec01;
//StringBuffer, StringBuilder : String Ŭ������ ����(immutable)�� ������ Ŭ����
//append() �޼��带 �̿��Ͽ� ����� ���ڿ� ���� ���ο� ���ڿ� �߰� ����)
//���� �� toString()�� �̿��Ͽ� ���ڿ�(String) Ÿ������ ��ȯ
public class StringBufferExample {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		StringBuffer sb1=new StringBuffer("ȫ�浿");
		StringBuffer sb2=new StringBuffer("ȫ�浿");
		
		if(sb1.equals(sb2)) {		//toString �޼��尡 �����ǰ� �ȵǾ��ֱ� ������ �ּҰ����� �Ǵ��� -> �ٸ� ���� ���				=>StringBuffer, StringBuilder��!! .toString ����������
									//������ϰ������ ���ڿ��� �ٲ������(���ڿ��� �ٲٴ� �޼ҵ� -> toString)
			System.out.println("��������");
		}else {
			System.out.println("�ٸ� ����");
		}
		if(sb1.toString().equals(sb2.toString())) {		
			System.out.println("��������");
		}else {
			System.out.println("�ٸ� ����");
		}
		
		
		sb.append(" select * \n ");			//����Ŭ�� ������ �������� �����ϱ� ������ ���� ���̷��� �� �ڷ� ���� ���̴� ���� ���̱�(�ƴϸ� \n���� �������ֱ�)
		sb.append("   from member \n ");
		sb.append("   where mem_id = ? ");
		
		String str=sb.toString();
		System.out.println(str);
		
	}

}
