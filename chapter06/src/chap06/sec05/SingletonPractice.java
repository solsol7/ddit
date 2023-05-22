package chap06.sec05;

public class SingletonPractice {

	public static void main(String[] args) {
		ST st1=ST.getInstance();
		System.out.println(st1);
		ST st2=ST.getInstance();
		System.out.println(st2);
	}
}

class ST{
	private static ST a=null;
	private ST() {}
	
	public static ST getInstance() {
		if(a==null) a=new ST();
		return a;
	}
}