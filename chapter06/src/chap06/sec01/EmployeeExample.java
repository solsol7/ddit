package chap06.sec01;

public class EmployeeExample {

	public static void main(String[] args) {
		Employees emp1=new Employees();		//Employees Ŭ������ �����ڸ޼ҵ尡 �������� X -> �⺻�����ڹۿ� ����(�ڵ����� ������ ��)
		emp1.empId=1001;					//�ٸ������� ������ �����ϴ� �� ������� X
		emp1.empName="������";
		emp1.telNum="101-1234-5678";
		
		emp1.showEmpInfo();
	}

}
