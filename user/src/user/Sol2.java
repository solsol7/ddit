package user;

public class Sol2 {

	public static void main(String[] args) {
		Printer printer = new Printer();
		printer.println(10);
	}

}

class Test{
	int age;
	String name;
	
	Test(){
		age=26;
		name="Sol";
	}
}

class Board{
	String title;
	String content;
	String writer;
	String date;
	int hitcount;
	
	Board(String title, String content){
		this(title,content,"�α����� ȸ�����̵�","���� ��ǻ�� ��¥",0);
	}
	
	Board(String title, String content, String writer){
		this(title,content,writer,"���� ��ǻ�� ��¥",0);
	}
	
	Board(String title, String content, String writer, String date){
		this(title,content,writer,date,0);
	}
	
	Board(String title, String content, String writer, String date, int hitcount){
		this.title=title;
		this.content=content;
		this.writer=writer;
		this.date=date;
		this.hitcount=hitcount;
	}
}

class MemberService{
	
	MemberService(){}
	
	public boolean login(String id, String password) {
		if(id.equals("hong") && password.equals("12345")) {
			return true;
		}else return false;
	}
	
	public void logout(String id) {
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
	}
	
}

class Printer{
	
	Printer(){}
	public void println() {
		System.out.println();
	}
}