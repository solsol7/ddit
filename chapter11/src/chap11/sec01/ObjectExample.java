package chap11.sec01;

public class ObjectExample {

	public static void main(String[] args) {
		Person p1=new Person("홍길동");
		System.out.println("getinfo : "+p1.getinfo());
		System.out.println("toString() : "+p1.toString());
		
		//Person p2=p1;
		Person p2=new Person("홍길순");
		if(p2.equals(p1)) {	//내용이 같은게 아니라 주소가 같은건데 같은내용뜸 -> 객체참조변수를 쓰면 equals메소드가 들어가있는거임
							//p2에 들어있는 toString 메소드가 호출됨(p2.toString()) -> Override함
			System.out.println("같은 내용");
		}else {
			System.out.println("다른내용");
		}
	}

}

class Person{	//Person이라는 클래스에는 toString이라는 메소드가 없음(가시적으로 안보임) -> Object클래스 상속받았으니까 toString메소드 있음
	private String name;	//멤버변수가 private으로 되어있어서 외부에서는 이 클래스의 내용을 참조가 불가능할 때
							//
							// +) db쓸 때는 클래스객체가 하나만 생성되어야함 ->싱글톤 써야함
							//private으로 선언된 멤버변수 -> 대부분 생성자메소드 써서 초기화 시킴 & 그 변수를 하나씩하나씩 밖으로 내보내거나 하나씩하나씩 밖에 있는 값으로 변수를 변경하고자 할 때 getter, setter메소드 씀
							//변수에 있는 내용들을 한꺼번에 출력하고싶을 때는 toString메소드를 사용함
	
	Person(String name){
		this.name=name;
	}
	String getinfo() {
		return getClass().getName()+'@'+ Integer.toHexString(hashCode());	//hashCode 호출 -> Person클래스의 주소값을 10진수로 반환 -> toHexString -> 그걸 16진수 문자열로 반환하라
	}
	
	@Override
	public String toString() {
		return name;
	}
}