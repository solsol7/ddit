package chap07.sec05;

public abstract class Unit {
	int x;
	int y;
	String nm;
	
	Unit(String nm){
		this.nm=nm;
	}
	
	public void stop(String nm, int x, int y) {
		System.out.println(nm+"�� ("+x+","+y+")�� ����ϴ�");
	}

	public abstract void move(int x, int y);
}

class Marine extends Unit{
	
	Marine(){
		super("�غ�");
	}
	
	@Override
	public void move(int x, int y) { //x,y ��������
		System.out.println(nm+"��("+this.x+","+this.y+")���� ("+x+","+y+") ��ġ�� �̵��մϴ�");
	}
	
	public void stimPack() {	//Marine Ŭ������ ���� �޼ҵ�
		System.out.println("���ݸ�� : ������ ����");
	}
}

class Tank extends Unit{
	Tank(){
		super("��ũ");
	}

	@Override
	public void move(int x, int y) {
		System.out.println(nm+"��("+this.x+","+this.y+")���� ("+x+","+y+") ��ġ�� �̵��մϴ�");
		
	}
	
	public void sizMode() {
		System.out.println("���ݸ�� : ������� ��ȯ");
	}
}