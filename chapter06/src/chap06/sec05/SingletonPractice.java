package chap06.sec05;

public class SingletonPractice {

	public static void main(String[] args) {
		SingletonP s1=SingletonP.getInstance();
		System.out.println(s1);
		SingletonP s2=SingletonP.getInstance();
		System.out.println(s2);

	}

}

class SingletonP{
	private static SingletonP single;
	private SingletonP() {};
	
	public static SingletonP getInstance() {
		if(single==null)single=new SingletonP();
		return single;
	}
}