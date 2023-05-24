package chap05.sec07;

public enum Menu {
	Member_SignUp("회원등록"),			//0 배열 -> 클래스객체처럼 동작				""안에 든게 value가 됨
	Member_Update("회원정보 수정"),		//1
	Member_Delete("회원탈퇴");			//2
									//상수값만 쓴다면 ""불필요/ ""에 값을 배정해서 사용한다 배정된 값의 타입을 final로 선언 -> 값의 타입을 가지고 클래스의 생성자 메소드 만들듯이 만듦-하나씩 하나씩 배정되어지게/
											//만들어놓은 값을 반환받을 때 하나의 메소드로 기술 -메소드의 반환타입 : 앞에 선언되어진 타입
	private final String value;	//
	
	Menu(String value){			//value의 값 배정 ->  괄호안에 있는 값들 저장, 타입은 괄호안에 있는 값들의 타입
		this.value=value;
	}
	
	public String getValue() {
		return value;
	}
}
