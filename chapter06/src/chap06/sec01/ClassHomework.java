/* 예제2] 학번(long타입 정수), 이름(문자열)을 갖고있는 학생클래스를 설계하시오
      	기능은 학생 정보를 출력하는 메서드로 구성

	예제3] 사원번호(int 타입의 정수), 사원명, 전화번호를 보유한 사원클래스(Employees)
      	를 작성하시오. 기능은 사원정보 출력 기능

	예제4] 제품번호, 제품명, 제조회사, 가격 정보를 가지고있고 제품정보를 출력할 수 있는
      	제품 클래스(Products)를 생성하시오.   */


package chap06.sec01;
/*
public class ClassHomework {

	public static void main(String[] args) {
		Student st=new Student();
		st.match();

	}

}

class Student{
	private long[] stdNo= {1713030, 1713031, 1713032, 1713033, 1713034};
	private String[] name= {"김왕왕", "이왕왕", "한왕왕", "유왕왕", "박왕왕", "원왕왕"};
	
	public void match() {
		for(int i=0; i<stdNo.length; i++) {
			System.out.print("학번 : "+stdNo[i]);
			System.out.println("       이름 : "+name[i]);
		}
	}
}

*/



/*
public class ClassHomework {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.match();
	}

}




class Employee{
		private int[] empNo={1315,1316,1317,1318,1319};
		private String[] empName={"김땡땡","이땡땡","한땡땡","유땡땡","박땡땡"};
		private String[] empTelNo={"010-4532-4381","010-1384-3541","010-1357-3651","010-4381-1318","010-4138-5472"};
		
		public void match() {
			for(int i=0; i<empNo.length; i++) {
				System.out.print("사원번호 : "+empNo[i]);
				System.out.print("       사원명 : "+empName[i]);
				System.out.print("         전화번호 : "+empTelNo[i]+"\n");
			}
		}
}

*/




public class ClassHomework {

	public static void main(String[] args) {
		Product prd=new Product();
		prd.match();

	}

}

class Product{
	private int[] prdNo={10000,10001,10002,10003,10004};
	private String[] prdName={"키보드","이어폰","마우스","아무거","음료수"};
	private String[] prdMaker={"삼땡","엘땡","한땡","유땡","김땡"};
	private int[] prdPrice={25000,30000,15800,26000,38000};
	
	public void match() {
		for(int i=0; i<prdNo.length; i++) {
			System.out.print("제품번호 : "+prdNo[i]);
			System.out.printf("       제품명 : "+prdName[i]);
			System.out.printf("             제조회사 : "+prdMaker[i]);
			System.out.printf("           가격 : "+prdPrice[i]+"\n");
			}
	}
}

