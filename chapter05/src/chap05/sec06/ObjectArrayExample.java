package chap05.sec06;

public class ObjectArrayExample {//��ü �迭

	public static void main(String[] args) {
//		Books[] book=new Books[3];		//new������ �����ڸ޼ҵ尡 ���;� ��ü ������� , StringŬ���� ����
										//��ü �����ȵǰ� �迭�� �������
//		book[0]=new Books("���ʺ� ����", "EBS", 15000);
//		book[1]=new Books("���� �Թ���","����ȣ", 30000);
//		book[2]=new Books("��ũ���׽� ����","������",10000);
		Books[] book = {new Books("���ʺ� ����", "EBS", 15000),
						new Books("���� �Թ���","����ȣ", 30000),
						new Books("��ũ���׽� ����","������",10000)};    //�������� ���
		
		System.out.println("----------------------------------------");
		for(Books b : book) {	//�����ε� ���ϸ� �ּҰ� ��µ�
			System.out.println(b);
			System.out.println("----------------------------------------");
			
		}
	}
		
}

class Books{ //å�̸�, ����, ����
	private String title;   //private-�ܺ� Ŭ�������� �������� ����, �ڱ� Ŭ���������� ������ �� ����(Books������)
							//�ܺο��� ������ ������ �Ұ����ϱ� ������ �����ڸ޼ҵ尡 ����
							//�����ڸ޼ҵ� - ��ü�ʱ�ȭ�� ���� - ��������� �ʱ�ȭ�ϴ� �������θ� ����
	private String writer;
	private int price;
	
	public Books() {}  //�����ڸ޼ҵ�                   �����ε�- �̸��� �Ȱ��� �޼ҵ尡 �ϳ��� Ŭ���� �ȿ��� ���Ǿ��� �� �ִ�
	public Books(String title, String writer, int price){
		this.title=title;
		this.writer=writer;
		this.price=price;
	}
	
	@Override								//�������̵� : ������
	public String toString() {
		return "å�̸� : "+title+"\n���� : "+writer+"\n���� : "+price; //�ּ� ��� �긦 ��ȯ�ض�
	}
	
}