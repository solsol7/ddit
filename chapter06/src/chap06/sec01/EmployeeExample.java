package chap06.sec01;

public class EmployeeExample {

	public static void main(String[] args) {
		Employees emp1=new Employees();		//Employees 클래스에 생성자메소드가 존재하지 X -> 기본생성자밖에 못씀(자동으로 생성된 것)
		emp1.empId=1001;					//다른곳에서 데이터 정의하는 것 좋은방법 X
		emp1.empName="강감찬";
		emp1.telNum="101-1234-5678";
		
		emp1.showEmpInfo();
	}

}
