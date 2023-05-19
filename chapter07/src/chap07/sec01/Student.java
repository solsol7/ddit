package chap07.sec01;

public class Student extends People {//자식클래스
	private String ssn;
	Student(String name, int age, String gender, String ssn){
		super(name,age,gender); //부모클래스가 생성되어질 때 필요한 데이터를 괄호안에 넣어줘야함
		this.ssn=ssn;
	}
	
	

}
