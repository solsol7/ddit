package chap11.sec03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {		//맵

	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<Integer, String>();		//Map -> 인터페이스 ,  HashMap -> 클래스
		//자료 저장
		map.put(1000, "홍길동");
		map.put(1001, "이순신");
		map.put(1002, "강감찬");
		
		String name=map.get(1001);
		System.out.println(name);
		
		Set<Integer> keySet=map.keySet();
		Iterator<Integer> iter=keySet.iterator();
		while(iter.hasNext()) {
			Integer keys=iter.next();
			System.out.println(keys+"=>"+map.get(keys));
			
		}
	}
}
