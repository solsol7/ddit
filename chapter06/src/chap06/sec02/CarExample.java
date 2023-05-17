package chap06.sec02;

public class CarExample {

	public static void main(String[] args) {
		Car c1=new Car();
		c1.setCompany("르노 자동차");
		c1.setAuto(true);
		System.out.println(c1);

	}

}

class Car{
	private String company;
	private boolean isAuto;
	
	Car(){}
	Car(String company,boolean isAuto){
		this.company=company;
		this.isAuto=isAuto;
	}
	
	public void setCompany(String company) {		//set메서드 - 멤버변수 값을 설정해줌(변경할 수 O) 초기화된 멤버변수 값을 변경할 수 있음 //
		this.company = company;
	}
	
	public void setAuto(boolean isAuto) {
		this.isAuto = isAuto;
	}
	
	@Override
	public String toString() {
		String gearType="";  //지역변수의 경우 초기화안시키면 오류발생할 수 O
		if(isAuto) {
			gearType="자동";
		}else 
			gearType="수동";
		return gearType;
	}
	
}