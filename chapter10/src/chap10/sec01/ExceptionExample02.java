package chap10.sec01;

public class ExceptionExample02 {//예외

	public static void main(String[] args) {
		try {
			throw new CustomException("내가 만든 예외 클래스");	//강제로 예외가 발생됨
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}

//사용자 정의 예외클래스
// 일반예외클래스 : Exception 클래스를 상속받아 생성   -이걸 주로 많이 사용
// 실행예외클래스 : RuntimeException 클래스를 상속받아 생성
class CustomException extends Exception{
	CustomException(){}
	
	CustomException(String message){
		super(message);
	}
}
