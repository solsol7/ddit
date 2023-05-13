package chap04.sec02;

public class ForStatementExample03 {

	public static void main(String[] args) {
		ForStatement03 fs03=new ForStatement03();
		fs03.shape05();
	}

}

class ForStatement03{
	
	public void shape01() {
		for(int i=0; i<5; i++) {	//행 담당하는 for문
			for(int j=0; j<=i; j++) { //*출력 담당하는 for문
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("[1번 도형]");
	}

	public void shape02() {
		for(int i=0; i<5; i++) {	//행 담당하는 for문
			for(int j=0; j<i; j++) {//공백 담당하는 for문
				System.out.print(" ");
			}
			for(int j=0; j<(5-i); j++) { //*출력 담당하는 for문
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("[2번 도형]");
	}

	public void shape03() {
		for(int i=0; i<5; i++) {	//행 담당하는 for문
			for(int j=0; j<(5-i); j++) {//공백 담당하는 for문
				System.out.print(" ");
			}
			for(int j=0; j<(i*2)+1; j++) { //*출력 담당하는 for문
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("[3번 도형]");
	}
	
	public void shape04() {
		for(int i=0; i<5; i++) {	//행 담당하는 for문
			for(int j=0; j<(5-i); j++) {//공백 담당하는 for문
				System.out.print(" ");
			}
			for(int j=0; j<i+1; j++) { //*출력 담당하는 for문
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("[4번 도형]");
	}
	
	public void shape05() {
		for(int i=0; i<5; i++) {	//행 담당하는 for문
			for(int j=0; j<5-i; j++) { //*출력 담당하는 for문
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("[5번 도형]");
	}
}

