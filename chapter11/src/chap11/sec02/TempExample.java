package chap11.sec02;

import java.util.List;

public class TempExample {

	public static void main(String[] args) {
		new TempExample().start();

	}
	
	public void start() {
		TempDao tempDao=TempDao.getInstance();
		
		String sql="select * from TEMP ";
		List<TempVO> result=tempDao.selectList(sql);
		
		for(TempVO list : result) {
			System.out.println(list);
			System.out.println("--------------------------------");
		}
		

//		for(int i=0; i<result.size(); i++) {
//			System.out.println(result.get(i));
//			System.out.println("--------------------------------");
//		}
		
	}
}
