package chap06.sec01;

public class StudentExample {

	public static void main(String[] args) {
		Student1 s1=new Student1();		//new Student() 이거 쓰면 안됨 - 데이터를 입력할 수 있는 방법이 없음	// set메서드(/* */부분) 있어야 쓸 수 O
		s1.setStdID(1001);
		s1.setStdName("이순신");
		
		s1.showInfo();
		System.out.println(s1);
		
		Student1 s2=new Student1(1002,"홍길순");
		System.out.println(s2);
	}

}
class Student1{	//객체 생성할 때 학생정보 같이 집어넣는방법
	private long stdID;
	private String stdName;		//클래스가 어떤 정보를 가지고있나? - 클래스의 특성(속성)을 결정지을 때 사용되는 것 - 멤버변수
								//private 밖에서 접근 불가능- 초기화방법 : 생성자메소드이용(대부분), 수정/값 밖으로 내보내기 -getter/setter
								// 		기본키만 안바뀜- 키본키 제외한 나머지 값이 변경될 때(갱신)-업데이트할 자료로 바꾸어야함- 근데 private이라 접근 못함 - 접근할 수 있는 통로 마련해야함 - getter/ setter
	//vo/ dto : 변수,getter,setter메소드만으로 구성된 클래스	
	//db에 저장될 데이터들을 멤버변수로 선언(속성을 삽입/수정 저장될 공간)
	
	//Student()  - 생성자메소드 : 객체 생성할 때만(new연산자에 의해서만) 호출할 수 잇음, 원할 때 호출하는 메소드 X
	public Student1() {}   //생성자메소드 : 기본생성자
							//사용자가 생성자를 만들지 않았을 때 기본생성자 자동생성(하나라도 만들면 자동생성안함)
							//기본생성자 습관적으로 기술
	public void setStdID(long stdID)  {						//set변수명
		this.stdID=stdID;								//set메서드 - 반환값 없음,매개변수 O/  get메서드 - 값을 꺼내옴 : 반환값 있음,매개변수 X
	}
	
	public void setStdName(String stdName)  {						//set 변수명
		this.stdName=stdName;								//set메서드 - 반환값 없음,매개변수 O/  get메서드 - 값을 꺼내옴 : 반환값 있음,매개변수 X
	}

	
	
	public Student1(long stdID, String stdName) {		//()안에 기술된 것 : 매개변수 - 앞에있는 Student 메소드에 소속된 것 -그 메소드에서 정의되어지는 지역변수
														//매개변수로 받은 값(지역변수)을 멤버변수로 올려놔야 그 메소드가 없어져도 계속 값이 존재함
		//생성자메소드의 매개변수의 갯수 타입이 정수와 문자열이면(new Student(1,"홍길동")) public Student(long stdId, String stdName)얘가 불려짐/없을때는 public Student() 얘가 불림
		this.stdID=stdID;		
		this.stdName=stdName;	//참조변수 - 주소저장 / 본인의 주소(멤버변수의 주소)를 가지고 있는 참조변수 : this
								//this - 지역변수와 멤버변수가 똑같은 스펠링에 똑같은 모습일 때- 멤버변수를 지칭할 때 씀
								//특수목적참조형변수 :   this-자기자신의주소 / super-자기부모의 주소
								//					this, super 메소드도 있음 
	}

	public void showInfo() { //내용출력
		System.out.println("학번 : "+stdID); //this 붙여도되고 안붙여도됨  - 매개변수와 멤버변수가 똑같은모양 똑같은스펠링으로 되어있는 경우에 멤버변수 호출할 때 씀 - 지금은 매개변수 없음
		System.out.println("이름 : "+stdName);
	}
	//출력을 main클래스에서 하고싶을 때 - @Override
	
	@Override
	public String toString() { //여기까지는 단 하나의 글자도 변경하면 안됨(이름바꿔쓰기, 접근지정자 바꾸기, 타입 변경하기... X)
		return "학번 : "+stdID+"이름 : \n"+stdName;  //반환시켜줌
	}
}