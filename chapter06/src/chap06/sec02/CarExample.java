package chap06.sec02;

public class CarExample {

	public static void main(String[] args) {
		Car c1=new Car();
		c1.setCompany("���� �ڵ���");
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
	
	public void setCompany(String company) {		//set�޼��� - ������� ���� ��������(������ �� O) �ʱ�ȭ�� ������� ���� ������ �� ���� //
		this.company = company;
	}
	
	public void setAuto(boolean isAuto) {
		this.isAuto = isAuto;
	}
	
	@Override
	public String toString() {
		String gearType="";  //���������� ��� �ʱ�ȭ�Ƚ�Ű�� �����߻��� �� O
		if(isAuto) {
			gearType="�ڵ�";
		}else 
			gearType="����";
		return gearType;
	}
	
}