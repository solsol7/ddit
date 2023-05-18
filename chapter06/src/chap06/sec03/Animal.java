
package chap06.sec03;

public class Animal {
	private String kind;	//멤버변수 - 객체가 소멸되어지기 전까지 값을 가지고 있음
	
	Animal(){/*기본생성자
		this()			Animal(String kind) 메서드를 호출하고 싶음 -> 메소드를 부른다 : 제어가 그 쪽으로 감(메소드가 올라오는것X),매개변수를 보고 감(갯수와 타입이 같은 매개변수를 찾아감)
		 																		-> 가서 거기에 있는 명령문 다 실행하고 다시 되돌아옴
					Animal(String kind)이 메서드(매개변수가 1개 있는 메서드를)를 호출하려면 kind라는 값을 넣어줘야함 매개변수를 똑같이 써줘야함(타입이나 갯수가 다르면 안됨)
					Animal(String kind)얘가 올라오는게 아니라 제어가 내려가는거임
	 				생성자메소드에서 다른 생성자 메소드를 호출한다 - this()
					만약 여기에 this()를 쓰면 자기가 자기를 호출하는거 - 무한루프(재귀호출)
					
					중복이 발생되기 때문에 메서드 호출함
					this.kind 중복을 없애게 만들기 위해 호출함
					매개변수 갯수, 타입, 순서가 같아야함
					 * this 안에 데이터를 기술해줘야함
	 				*/
		
		this("호랑이"); // 호랑이가 Animal(String kind)메서드의 kind로 들어감 
		
	}
	Animal(String kind){ //() 괄호 안에 초기화 대상 적음 
		this.kind=kind;		//매개변수로 들어온 데이터("호랑이")를 멤버변수에 갖다놓음
		
	}
	
	public void setKind(String kind) { 		//kind의 값을 변경할 수 있도록 하기 위해
											//setter 기억공간의 값을 변경시킨다(셋팅 대상이 되어지는 대상이 있어야함)  반환값x 매개변수o
											//getter 멤버변수에 들어있는 값을 클래스 밖으로 내보내기 위해 사용 - 반환값o 매개변수x
	this.kind=kind;
	}

			
	public String getKind() {			//특정한 하나의 값만 반환 -getter, 여러개를 문자열로 바꿔서 반환- toString() 
		return kind;
	}
	
	
	
	}

