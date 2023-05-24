package user;

import java.util.Scanner;

public class Sol03 {		//�������̽�

	public static void main(String[] args) {
		Television t1=new Television();
		t1.turnOn();
		boolean a=true;
		while(a) {
			System.out.println("1: ��������     2:    3:����");
			Scanner sc=new Scanner(System.in);
			int num=sc.nextInt();
			switch(num) {
			case 1:
				System.out.println("������ �����ϼ���");
				int vol=sc.nextInt();
				t1.setVolume(vol);
				break;
			case 2:
				break;
			case 3:
				t1.turnOff();
				a=false;
				break;
			}
			
		}
	}

}

interface RemoteControl{
	public int MAX_VOLUME=10;
	public int MIN_VOUME=0;
	
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
}

class Television implements RemoteControl{
	private int volume;
	
	public void turnOn() {
		System.out.println("TV�� �մϴ�");
	}
	public void turnOff() {
		System.out.println("TV�� ���ϴ�");
	}
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume=RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOUME) {
			this.volume=RemoteControl.MIN_VOUME;
		}else {
			this.volume=volume;
		}
		System.out.println("���� TV ���� : "+this.volume);
			}
}