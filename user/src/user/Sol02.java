package user;

public class Sol02 { //추상클래스

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
		super("강아지");
	}
	
	@Override
	public void sound() {
		System.out.println(kind+"는 멍멍");
	}
}

class Cat extends Animal{
	
	Cat(){
		super("고양이");
	}
	
	@Override
	public void sound() {
		System.out.println(kind+"는 야옹");
	}
}

abstract class HttpServlet{
	public abstract void service();
}

class LoginServlet extends HttpServlet{
	LoginServlet(){}
	
	@Override
	public void service() {
		System.out.println("로그인합니다.");
	}
}

class FileDownloadServlet extends HttpServlet{
	FileDownloadServlet(){}
	
	@Override
	public void service() {
		System.out.println("파일을 다운로드합니다.");
	}
}