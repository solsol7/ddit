package user;

public class Sol01 {//this()

	public static void main(String[] args) {
		Child child=new Child();
	}

}

class Printer{
	
	Printer(){}
	public void println(int a) {
	 System.out.println(a);
	}
	
	public void println(boolean a) {
		System.out.println(a);
	}
	
	public void println(double a) {
		System.out.println(a);
	}
	
	public void println(String a) {
		System.out.println(a);
	}
}

class ShopService{
	private static ShopService ss=null;
	private ShopService() {}
	
	public static ShopService getInstance() {
	if(ss==null) {
		ss=new ShopService();
	}
	return ss;
	}
}

class Parent{
	public String nation;
	
	public Parent() {
		this("´ëÇÑ¹Î±¹");
		System.out.println("Parent() call");
	}
	
	public Parent(String nation) {
		this.nation=nation;
		System.out.println("Parent(String nation) call");
	}
}

class Child extends Parent{
	private String name;
	
	public Child() {
		this("È«±æµ¿");
		System.out.println("Child() call");
	}
	
	public Child(String name) {
		this.name=name;
		System.out.println("Child(String name) call");
	}
}