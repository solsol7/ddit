package user02;

public class SelfNumber {
	public static void main(String[] arg) {
		
		boolean[] generator=new boolean[5000];
		
		int result=0;
		
		for(int num=0; num<=5000; num++) {
			int i=num;
			int sum=0;
			while(i!=0) {
				int a=i%10;
				i=i/10;
				sum+=a;
			}
			int x=sum+num;
			if(x>0 && x<5000) {
			generator[x]=true;
			}
		}
		
		for(int i=0; i<5000; i++) {
			if(generator[i]==false) {
				result+=i;
			}
		}
		
		System.out.println(result);
	}

}
