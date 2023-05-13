package chap02.sec01;

public class VariableExample01 {
	static int days;
	public static void main(String[] args) {
		Variable02 var2=null;    /*class, null="" 문자열초기화할때*/
		var2=new Variable02();   /*매소드*/
		var2.value1=100;
//		value1=100;
		System.out.println(var2.value1);
		
//	   int sum=0;
//	   int days=0;
//	   int amountMoney=100;
//	   while(true) {
//		 days++;
//		 sum=sum+amountMoney;
//		 if(sum>=1000000) { break; }
//		 amountMoney=amountMoney*2;
//	   }
//		System.out.println("경과일수: "+days);
//		System.out.println("저축금액: "+sum);
	 }
	}

class Variable02{
	int value1; 
}