package chap07.sec03;

public class Tv extends Product{//Product��ӹ���
	Tv(){
		super(1000);	//1000�� ������ ProductŬ������ �����ڸ޼ҵ� ȣ��
	}
	
	@Override
	public String toString() {
		return "TV";
	}
}
