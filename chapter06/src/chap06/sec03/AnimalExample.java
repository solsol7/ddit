package chap06.sec03;

public class AnimalExample {

	public static void main(String[] args) {
		Animal a1=new Animal(); //매개변수가 없는 기본생성자 호출
		System.out.println(a1.getKind());
		
		a1.setKind("강아지");
		System.out.println(a1.getKind());
		
		Animal a2=new Animal("고양이");	//매개변수가 하나 있는 생성자메소드 호출
		System.out.println(a2.getKind());
	}

}
