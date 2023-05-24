package user02;

public class Eight {

	public static void main(String[] args) {
		int count=0;
		for(int i=1; i<=10000; i++) {
			int num=i;
			while(num!=0) {
				if(num%10==8) count++;
				num=num/10;
				}
			}
		System.out.println(count);
		}
	}
