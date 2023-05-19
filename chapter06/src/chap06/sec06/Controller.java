package chap06.sec06;

public class Controller {

	public static void main(String[] args) {
		new Controller().controller();
		
	}

	
	public void controller() {
		MemberService memberService=new MemberService();
		Member member=new Member("홍길동","a001","1234",30); //실제는 데이터베이스에 있는것을 가져와 보관하는 클래스가 있어야함
		boolean result=memberService.login(member.getId(),member.getPasswd());
		if (result) {
			System.out.println(member.getId() +"님이 로그인 했습니다");
		}else {
			System.out.println("id나 혹은 password를 잘못입력했습니다");
		}
	}
}
