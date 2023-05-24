package user;

public class Sol02 { //�߻�Ŭ����

	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.sound();
		Cat cat=new Cat();
		cat.sound();
		System.out.println("-----------");
		
		Animal animal=null;
		animal=new Dog();
		animal.sound();
		animal=new Cat();
		animal.sound();
		System.out.println("------------");
		
		AnimalSound(new Dog());
		AnimalSound(new Cat());
		
	}
	
	public static void AnimalSound(Animal animal) {
		animal.sound();
	}

}


/*	public static void main(String[] args) {
		method(new LoginServlet());
		method(new FileDownloadServlet());
	}
	public static void method(HttpServlet servlet) {
		servlet.service();
	}
}
	*/



abstract class Animal{
	public String kind;
	
	Animal(String kind){
		this.kind=kind;
	}
	
	public abstract void sound();
}

class Dog extends Animal{
	
	Dog(){
		super("������");
	}
	
	@Override
	public void sound() {
		System.out.println(kind+"�� �۸�");
	}
}

class Cat extends Animal{
	
	Cat(){
		super("�����");
	}
	
	@Override
	public void sound() {
		System.out.println(kind+"�� �߿�");
	}
}

abstract class HttpServlet{
	public abstract void service();
}

class LoginServlet extends HttpServlet{
	LoginServlet(){}
	
	@Override
	public void service() {
		System.out.println("�α����մϴ�.");
	}
}

class FileDownloadServlet extends HttpServlet{
	FileDownloadServlet(){}
	
	@Override
	public void service() {
		System.out.println("������ �ٿ�ε��մϴ�.");
	}
}