package chap07.sec04;

public abstract class Shape { //�߻�Ŭ���� -> ��ü�� �� �� ����
	String kind;
	
	Shape(String kind){
		this.kind=kind;
	}
	
	public abstract void draw();
	
	@Override
	public String toString() {
		return kind;
	}
}
