package chap06.sec07;

public class Child extends Parent {
	String gender;
	int age=25;
	
	Child(){}
	Child(String gender,String name, int age){
		super(name,age);		//super메소드를 불러야 부모클래스 객체가 만들어짐
								//부모클래스의 생성자메소드와 똑같은 모습의 super메소드가 자식클래스 생성자메소드 맨 첫줄에 나와야함
		this.gender=gender;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;				//자식의 나이 반환함, 부모나이를 반환하려면 super.age;    this와 super구분 -> this-자신의 주소, super-부모의주소
								//다형성-upcasting 헷갈리지 X!!
	}
}
