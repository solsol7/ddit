package util;

import java.util.List;
import java.util.Map;

public class ProdView {
	private static ProdView instance=null;
	private ProdView() {}
	
	public static ProdView getInstance() {
		if(instance==null) instance=new ProdView();
		return instance;
	}
	
	public void displayProd(List<Map<String, Object>> list) {
		System.out.println("   [[ ��ǰ LIST  ]]");
		System.out.println("���� ��ǰ��ȣ       ��ǰ��         ��ǰ��");
		System.out.println("------------------------------------");
		for(int i=0; i<list.size(); i++) {
			for(Map.Entry<String, Object> entry : list.get(0).entrySet()) {
			System.out.printf("%3d 15s, %30s\n",(i+1), entry.getKey(), (String)entry.getValue());
			}
		}
	}
}