package user04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class abcde {

	public static void main(String[] args) {
		String[] listName= {"가나","다라","마바","사아","자차"};
		
		List<String> list=new ArrayList<>();
		for(String str : listName) {
			list.add(str);
		}
		
		Map<Integer, String> map=new HashMap<>();
		for(int i=0; i<listName.length; i++) {
			map.put(i, listName[i]);
		}
		
		System.out.println(map.get(3));
	}

}
