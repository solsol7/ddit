package user02;

public class Generator {

	public static void main(String[] args) {
		Test t1=new Test();
		t1.haveGenerator();
		t1.down5000();
		t1.deduplication();
		System.out.println(t1.sum());
	}

}

class Test{
	int number[]=new int[5000];
	int result;
	
	public void haveGenerator() {
		int x=0;
		int sum=0;
		for(int num=0; num<5000; num++) {
				int i=num;
				while(i!=0) {
					int a=i%10;
					i=i/10;
					sum+=a;
				}
				x=sum+num;
				number[num]=x;
		}
	}
	
	public void down5000() {
		for(int i=0; i<5000; i++) {
			if(number[i]>5000) number[i]=0;
		}
	}
	
	public void deduplication() {
		for(int i=0; i<5000; i++) {
			for(int j=i+1; j<5000; j++) {
				if(number[i]==number[j]) {
					number[j]=0;
				}
			}
		}
	}
	
	public int sum() {
		int sumGenerator=0;
		int sum=0;
		for(int a:number) {
			sumGenerator+=a;
		}
		
		for(int i=0; i<=5000; i++) {
			sum+=i;
		}
		result=sum-sumGenerator;
		return result;
	}
}