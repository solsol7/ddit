//Collection 객체
// -List, Set, Map으로 분류	//List, Set -> 인터페이스임(객체가 될 수 없음) -> 객체가 되려면 인터페이스를 구현한 자식클래스여야함 -> 그게 ArrayList, Vector...
// 1) List : 선형구조(1차원 배열 구조)
//	  - 첨자(index)를 사용하며 중복을 허용하여 자료 저장
//	  - 객체만 저장함(일반 기본형데이터가 직접 collection framework에 저장될 수 없음 -> 클래스로 변형되어야함 : 변형을 위해 제공되는 8개의 클래스 : Wrapper클래스)
//	  - List는 interface의고 이를 구현한 객체가 ArrayList, Vector, Stack, LinkedList, Queue 등이 제공됨
//	  - ArrayList : 가장 널리 사용됨		//1차원배열임, 저장장소 16개 자동으로 만들어지고 더 큰 값 들어오면 배로 증가됨
//	  - 주요메서드 : //1,2,8번 자주사용
//		(1) add(Object obj) : ArrayList에 데이터 삽입
//		(2) get(int idx) : ArrayList idx번째 저장된 자료 반환
//		(3) boolean contains(Object obj) : ArrayList에 obj가 있는지 여부 반환  //있으면 참, 없으면 거짓
//		(4) boolean isEmpty() : ArrayList가 비어있는지 여부 반환  //비어있으면 참, 비어있지않으면 거짓
//		(5) void clear() : 모든 객체 삭제
//		(6) E remove(int idx) : idx번째 객체 삭제
//		(7) boolean remove(Object obj) : obj 객체를 찾아 삭제
//		(8) int size() : ArrayList에 존재하는 객체의 수 반환(저장된 자료의 수 반환)
//선형구조(List) -> 중간에 데이터 삽입하고싶으면 데이터가 이동해야함(이동동작 반드시 수반), 기억장소의 이용효율을 굉장히 좋으나 자료가 삽입되고 삭제될 때 많은 이동동작 수반-시간오래걸림

package chap11.sec02;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample01 {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		Person p1=new Person("이성계");		//입력할 때부터 어떤 형태의 데이터만 입력되어져라 라고 제한하는 것 - generic
		list.add("홍길동");
		list.add(100);			//일반변수가 저장되고 출력된 이유 : 저장될 때 자동으로 Integer클래스 객체로 변형됨(autoboxing)
		list.add(false);
		list.add(p1);
		list.add(new Person("정몽주"));
		
		System.out.println(list);
		
		System.out.println("일반 for문");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("기능이 향상된 for문");
		for(Object obj:list) {		//형태가 다양함 - 어떤 객체로 받을 수 없음. 모든 객체의 조상클래스인 Object로 받음(다형성, upcasting)
			System.out.println(obj);
		}
		
		System.out.println("[[반복자(Iterator) 사용]]");
		Iterator iter=list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}

class Person{
	String name;
	Person(String name){
		this.name=name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}