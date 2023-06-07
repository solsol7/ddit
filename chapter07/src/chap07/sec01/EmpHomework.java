/*
 다음 요구사항에 맞는 메소드와 객체를 생성하여라.
[직원 클래스]
⦁ 직원 정보를 가지고 있는 Employee 클래스가 있다.
⦁ 이 클래스를 사용하여 직원들의 사번, 이름, 부서, 직급, 나이, 성별, 연봉, 연락처, 주소 등의 정보를  관리할 것이다.

     Employee e = new Employee();

1. 직원 정보 관리를 위한 객체를 생성할 때 반드시 사번, 이름, 부서, 직급의 정보가 있어야 한다.
2. 생성된 직원의 연봉을 설정할 수 있다.
3. 급여는 연봉에서 12개월을 나눈 값으로 지급하나 매달 세금으로 급여의 8%를 빼고 수령받게 될 것이다.
	따라서 급여 정보를 반환하는 메서드는 위의 사항을 고려하여 값이 반환될 수 있게 해야 한다.  
4. 회사 내규에 따라 연봉 협상은 현재 연봉의 2.5% 까지만 최대로 올릴 수 있다. 이는 모든 직원들이 동일하다.
	단, 전년도 실적에 따라 더 높이거나 낮출 수는 있다.
*/
package chap07.sec01;

public class EmpHomework {

	public static void main(String[] args) {
		Employee e=new Employee("1102","김사랑","영업부","대리");
		e.setSalary(34000000, 1.8);
		System.out.println(e.printEmp());
		System.out.println(e.printSal());
	}

}
//
//class Employee{
//	private String empNo, name, dept, position;
//	
//	private int salary;
//	private double ics;
//	private int icsSalary;
//	
//	Employee(){};
//	Employee(String empNo,String name,String dept,String position){
//		this.empNo=empNo;
//		this.name=name;
//		this.dept=dept;
//		this.position=position;
//	}
//	
//	public void setSalary(int salary, double ics) {	//현재연봉, 연봉상승률
//		this.salary=(int)(salary/12*0.92);
//		this.ics=ics;
//		this.icsSalary=(int)(salary+salary*ics*0.01);
//	}
//	
//	public String printEmp() {
//		return "사번 : "+empNo+"\n이름 : "+name+"\n부서 : "+dept+"\n직급 : "+position+"\n";
//	}
//	
//	public String printSal() {
//		return "급여 : "+salary+"\n연봉인상률 : "+ics+"%"+"\n내년 연봉 : "+icsSalary;
//	}
//	
//}
