package user03;

public class StarParctice01 {

	public static void main(String[] args) {
		
		int[] num=new int[6];
		int maxNum=0;
		
		for(int i=0; i<30; i++) {
			int a=((int)(Math.random()*6)+1);
			num[a-1]++;
		}
		
//		for(int i=1; i<num.length; i++) {
//			if(num[i-1]<num[i]) {
//				maxNum=num[i];
//			}
//		}
		
		maxNum=num[0];						//배열의 행의 갯수, dice[0] -> 임시최댓값
		for(int i=1; i<num.length; i++) {
			if(maxNum<num[i]) {					//최댓값구하기
				maxNum=num[i];
			}
		}
		
		char[][] star = new char[maxNum][6];
		
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i]; j++) {
				star[j][i]='*';
			}
		}
		
		for(int i=star.length-1; i>0; i--) {
			System.out.print(i+" :\t");
			for(int j=0; j<star[i].length; j++) {
				System.out.print(star[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("--------------------------------------------------");
		System.out.println("\t1\t2\t3\t4\t5\t6");
		
		//---------------------------------------------------
		
		
		
		
//		int[] num=new int[6];
//		int maxNum=0;
//		
//		for(int i=0; i<30; i++) {
//			int a=((int)(Math.random()*6));
//			num[a]=num[a]+1;
//		}
//		
//		for(int i=0; i<num.length-1; i++) {
//			maxNum=num[0];
//			if(num[i+1]>num[i]) {
//				maxNum=num[i+1];
//			}
//		}
//		System.out.println("\t1\t2\t3\t4\t5\t6");
//		System.out.println("----------------------------------------------------");
//
//		System.out.println();
//		for(int i=0; i<maxNum; i++) {
//			System.out.print((i+1)+":");
//			for(int j=0; j<num.length; j++) {
//			if(num[j]!=0) {
//				System.out.print("\t*");
//				System.out.print(" ");
//				num[j]--;
//			}else {
//				System.out.print("\t ");
//			}
//			
//			}
//			System.out.println();
//		}
		
	}

}