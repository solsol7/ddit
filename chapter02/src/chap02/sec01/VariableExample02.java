package chap02.sec01;

public class VariableExample02 {

	static int val1=200;
	public static void main(String[] args) {
		
		int sum=0;
		for(int i=1;  i<=100; i++){
			sum=sum+i;
			System.out.println("i="+i);
			System.out.println("sum="+sum);
		}
		System.out.println("val1="+val1);
		System.out.println("sum="+sum);
	}
}
//public static void myMethid() {
//	System.out.println("val1="val1);
//	System.out.println("sum="+sum);
//	
//}
//}

