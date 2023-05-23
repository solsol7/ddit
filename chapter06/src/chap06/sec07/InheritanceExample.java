package chap06.sec07;

public class InheritanceExample {

	public static void main(String[] args) {
		Child c1=new Child("남성","홍길동",45);
		System.out.println("이름 : "+c1.getName());		// 부모의 이름
		System.out.println("나이 : "+c1.getAge());		// 자식의 나이  -> 상속받았기 때문에 name이 없어도 반환할 수 있음,
		
	}

}


