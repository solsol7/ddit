/*
�� 16���� �ǽ� : ŷ 1��, �� 1��, �� 2��, ��� 2��, ����Ʈ 2��, �� 8��
��� �ǽ��� ������ �־����� ��, �� ���� ���ϰų� ���� �ùٸ� ��Ʈ�� �Ǵ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */

package user02;

import java.util.Scanner;

public class Chess {

//	public static void main(String[] args) {
//		int[] base = {1,1,2,2,2,8};
//		int[] count= new int[6];
//		Scanner sc=new Scanner(System.in);
//		int[] num=new int [6];
//		for(int i=0; i<num.length; i++) {
//			num[i]=sc.nextInt();
//		}
//		for(int i=0; i<num.length; i++) {
//			while(num[i]!=base[i]) {
//				if(num[i]<base[i]) {
//					num[i]++;
//					count[i]++;
//				}else if(num[i]>base[i]) {
//					num[i]--;
//					count[i]--;
//				}
//			}
//			
//		}
//		for(int i=0; i<count.length; i++) {
//		System.out.print(count[i]+" ");
//		}
//	}
//}ŷ 1��, �� 1��, �� 2��, ��� 2��, ����Ʈ 2��, �� 8��
	public static void main(String[] avgs) {
		Scanner sc= new Scanner(System.in);
		int king=1-sc.nextInt();
		int queen=1-sc.nextInt();
		int rook = 2 - sc.nextInt();
        int bishop = 2 - sc.nextInt();
        int knight = 2 - sc.nextInt();
        int pawn =8 -sc.nextInt();
        
        System.out.printf("%d %d %d %d %d %d",king,queen,rook,bishop,knight,pawn);
	}

}
