package chap06.sec02;

public class Shape {
	String kind="������";  //�����ʱ�ȭ
	int height=50;
	int weight=15;
	
	{					//�ʱ�ȭ���
		kind="Ÿ����";
		height=70;
	}

	Shape(String kind,int weight){		//�����ڸ޼ҵ�
		this.kind=kind;
		this.weight=weight;
	}

	@Override
	public String toString() {
		return "���� : "+kind+"\n���� : "+weight+"\n���� : "+height;
	}


}
