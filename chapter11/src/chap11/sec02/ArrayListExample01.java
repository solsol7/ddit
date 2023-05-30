//Collection 객체
// -List, Set, Map으로 분류	//List, Set -> 인터페이스임(객체가 될 수 없음) -> 객체가 되려면 인터페이스를 구현한 자식클래스여야함 -> 그게 ArrayList, Vector...
// 1) List : 선형구조(1차원 배열 구조)
//	  - 첨자(index)를 사용하며 중복을 허용하여 자료 저장
//	  - 객체만 저장함
//	  - List는 interface의고 이를 구현한 객체가 ArrayList, Vector, Stack, LinkedList, Queue 등이 제공됨
//	  - ArrayList : 가장 널리 사용됨		//1차원배열임, 저장장소 16개 자동으로 만들어지고 더 큰 값 들어오면 배로 증가됨
//	  - 주요메서드 : 
//		(1) add(Object obj) : ArrayList에 저장
//		(2) get(int idx) : ArrayList idx번째 저장된 자료 반환
//		(3) boolean contains(Object obj) : ArrayList에 obj가 있는지 여부 반환
//		(4) boolean isEmpty() : ArrayList가 비어있는지 여부 반환
//		(5) void clear() : 모든 객체 삭제
//		(6) E remove(int idx) : idx번째 객체 삭제
//		(7) boolean remove(Object obj) : obj 객체를 찾아 삭제
//		(8) int size() : ArrayList에 존재하는 객체의 수 반환
package chap11.sec02;

public class ArrayListExample01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
