package chap06.sec01;


public class Employees {
	int empId;
	String empName;
	String telNum;
	
	public void showEmpInfo() {
		System.out.println("-------------------------");
		System.out.println(" �����ȣ    �����    ��ȭ��ȣ");
		System.out.println("-------------------------");
		System.out.printf("%6d  %4s  %5s",empId,empName,telNum);
	}
}
