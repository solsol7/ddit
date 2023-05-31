package chap11.sec01;
//StringBuffer, StringBuilder : String 클래스의 단점(immutable)을 보완한 클래스
//append() 메서드를 이용하여 저장된 문자열 끝에 새로운 문자열 추가 가능)
//연산 후 toString()를 이용하여 문자열(String) 타입으로 변환
public class StringBufferExample {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		StringBuffer sb1=new StringBuffer("홍길동");
		StringBuffer sb2=new StringBuffer("홍길동");
		
		if(sb1.equals(sb2)) {		//toString 메서드가 재정의가 안되어있기 때문에 주소값으로 판단함 -> 다른 내용 출력				=>StringBuffer, StringBuilder만!! .toString 명시해줘야함
									//내용비교하고싶으면 문자열로 바꿔줘야함(문자열로 바꾸는 메소드 -> toString)
			System.out.println("같은내용");
		}else {
			System.out.println("다른 내용");
		}
		if(sb1.toString().equals(sb2.toString())) {		
			System.out.println("같은내용");
		}else {
			System.out.println("다른 내용");
		}
		
		
		sb.append(" select * \n ");			//오라클은 공백을 기준으로 구분하기 때문에 오류 줄이려면 앞 뒤로 공백 붙이는 습관 들이기(아니면 \n으로 구분해주기)
		sb.append("   from member \n ");
		sb.append("   where mem_id = ? ");
		
		String str=sb.toString();
		System.out.println(str);
		
	}

}
