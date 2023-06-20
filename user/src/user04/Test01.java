package user04;

public class Test01 {

	public static void main(String[] args) {
		Child c1=new Child();
		c1.test01();
		
		

	}

}


class Parent{
	int age=5;
	String name="ȫ�浿";


	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}


class Child extends Parent{
	int age;
	public void test01(){
		
		age=10;
		System.out.println(super.age);
		System.out.println(age);
		setAge(8);
		System.out.println(getAge());
	}
}

//10
//20
//5
//8
//8
