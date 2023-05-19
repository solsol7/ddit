package chap07.sec01;

public class StudentExample {

	public static void main(String[] args) {
		Student s1=new Student("홍길동",25,"여성","abc@naver.net");
		System.out.println("학생명 : "+s1.name); //Student에는 name선언 안되어있는데도 자기것처럼 쓸 수 있음
		System.out.println("나이 : "+s1.age);
		
		People p2=new People("강감찬",30,"남성"); //이미 생성되어버렸기 때문에 상속할 수 있는 방법이 없음
	}

}
