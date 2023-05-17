package chap06.sec01;


public class Employees {
	int empId;
	String empName;
	String telNum;
	
	public void showEmpInfo() {
		System.out.println("-------------------------");
		System.out.println(" 사원번호    사원명    전화번호");
		System.out.println("-------------------------");
		System.out.printf("%6d  %4s  %5s",empId,empName,telNum);
	}
}
