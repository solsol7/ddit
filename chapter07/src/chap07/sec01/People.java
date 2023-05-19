package chap07.sec01;

public class People {		//부모클래스
	String name;				//부모클래스에 private 쓰면 상속 안됨 - 상속해주려면 private 쓰면 안됨
	int age;
	String gender;
	public People(String name, int age, String gender) {
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
}

