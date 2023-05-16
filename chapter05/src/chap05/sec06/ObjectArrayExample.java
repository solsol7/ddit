package chap05.sec06;

public class ObjectArrayExample {//객체 배열

	public static void main(String[] args) {
//		Books[] book=new Books[3];		//new다음에 생성자메소드가 나와야 객체 만들어짐 , String클래스 제외
										//객체 생성안되고 배열만 만들어짐
//		book[0]=new Books("왕초보 영어", "EBS", 15000);
//		book[1]=new Books("경제 입문학","박정호", 30000);
//		book[2]=new Books("소크라테스 변론","김유원",10000);
		Books[] book = {new Books("왕초보 영어", "EBS", 15000),
						new Books("경제 입문학","박정호", 30000),
						new Books("소크라테스 변론","김유원",10000)};    //보편적인 방법
		
		System.out.println("----------------------------------------");
		for(Books b : book) {	//오버로딩 안하면 주소가 출력됨
			System.out.println(b);
			System.out.println("----------------------------------------");
			
		}
	}
		
}

class Books{ //책이름, 저자, 가격
	private String title;   //private-외부 클래스에서 접근하지 못함, 자기 클래스에서만 접근할 수 있음(Books에서만)
							//외부에서 데이터 접근이 불가능하기 때문에 생성자메소드가 사용됨
							//생성자메소드 - 객체초기화에 사용됨 - 멤버변수를 초기화하는 목적으로만 사용됨
	private String writer;
	private int price;
	
	public Books() {}  //생성자메소드                   오버로딩- 이름이 똑같은 메소드가 하나의 클래스 안에서 사용되어질 수 있다
	public Books(String title, String writer, int price){
		this.title=title;
		this.writer=writer;
		this.price=price;
	}
	
	@Override								//오버라이딩 : 재정의
	public String toString() {
		return "책이름 : "+title+"\n저자 : "+writer+"\n가격 : "+price; //주소 대신 얘를 반환해라
	}
	
}