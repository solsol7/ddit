package chap05.sec01;

public class ReferenceTypeExample {//모든 클래스의 부모 클래스 -> Object클래스
	//클래스이름 뒤에 extends Object가 생략되어있음
//자바에서 어떤 클래스를 상속받으려면 클래스에 extends를 붙여주면 됩니다.
//그런데 extends를 붙여주지 않아도 자바의 모든 클래스는 기본적으로
//java.lang.Object를 상속받습니다.

public static void main(String[] args) {
Person p1=new Person("홍길동",50);  // 
String str=new String("홍길동");

int[] score=new int[10];

System.out.println("p1="+p1);  //주소출력   , akakakak 부분(오버라이딩) 쓰면 내용 출력됨
System.out.println("str="+str); //내용출력
//오브젝트 클래스의 toString 메소드 ->  객체정보를 반환할 때 사용
//("p1="+p1)요기서 +p1, +str 뒤에 .toString 메소드가 생략되어짐.
// String클래스에서 toString 메소드 오버라이드 -> 재정의한 것. 값을 찍게 만들어줌.
System.out.println("score"+score);    //배열-> 클래스의 성질 가지고 o     //주소출력

}

}

class Person{
String name;		//생성자메소드-new 뒤에 붙은거. 기능 - 객체 초기화(멤버변수 초기화)
int age;			//name, age - 멤버변수

Person(){} // 매개변수  person이 일을 하기 위해 외부로부터 데이터 받아들이는 통로역할/ 매개변수가(괄호안에 변수가) X -> 기본생성자
Person(String name, int age){
this.name=name;				//name, age - 지역변수

	//메소드 오버로딩 : 한 클래스내에서 이름이 똑같은 메소드가 여러개 존재할 수 o, 한 클래스 내에서 발생
				//목적 : 다양한 데이터 취급, 매개변수의 갯수/타입이 다르면 메소드 이름이 똑


//같아도 상관없음(다른메소드로 취급)
	//오버라이딩 : 부모자식간 상속관계에 잇는 두개 이상의 클래스에서 발생, 부모클래스에서 정의해놓은 메소드를 자식 클래스에서 재정의
	//모든 클래스는 생성자메소드가 하나 이상 있어야 함.(안만들면 자바 컴파일러가 자동으로 삽입(default 생성자)
					//-> Person(){} 이거 자동생성
	//사용자가 만들어놓으면 자동으로 안만듦
	//기본생성자 습관적으로 기술하기- 오류발생 최소화
this.name=name;
this.age=age;
}
//akakakak
@Override  //@ -> 컴파일되어지는 주석, 기능을 단순화시킬 수 O
public String toString() { 
return this.name; 
}

}
