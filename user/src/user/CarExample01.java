package user;

public class CarExample01 {

	public static void main(String[] args) {
		Car car1=new Car();
		System.out.println("car1.company : "+car1.company);
		System.out.println();
		
		Car car2=new Car("�ڰ���");
		System.out.println("car2.model : "+car2.model);
		System.out.println("car2.color : "+car2.color);
		System.out.println();
		
		Car car3=new Car("�ڰ���","����");
		System.out.println("car3.company : "+car3.company);
		System.out.println("car3.model : "+car3.model);
		System.out.println("car3.color : "+car3.color);
		System.out.println();

		Car car4=new Car("�ý�","����",200);
		System.out.println("car4.company : "+car4.company);
		System.out.println("car4.model : "+car4.model);
		System.out.println("car4.color : "+car4.color);
		System.out.println("car4.maxSpeed : "+car4.maxSpeed);
		System.out.println();
	}

}


class Car{
	String company="�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	Car(){}
	
	Car(String model){
		this(model,"����",250);
	}
	
	Car(String model, String color){
		this(model, color, 250);
	}
	
	Car(String model, String color, int maxSpeed){
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}
		
}