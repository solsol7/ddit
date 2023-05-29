package user02;

import java.util.Scanner;

public class ApbPractice {

//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		String word=sc.nextLine();
//		int[] count=new int[26];
//		for(int i=0; i<count.length; i++) {
//			count[i]=-1;
//		}
//		
//		for(int i=0; i<word.length(); i++) {
//			for(int j=0; j<count.length; j++) {
//				if(word.charAt(i)==(char)(j+97) && count[j]==-1) {
//					count[j]=i;
//				}
//			}
//
//		}
//		for(int i=0; i<count.length; i++) {
//			System.out.print(count[i]+" ");
//		}
//
//	}
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String word=sc.nextLine();
	int[] count=new int[26];
	for(int i=0; i<count.length; i++) {
		count[i]=-1;
	}
	
	for(int i=0; i<word.length(); i++) {
		int al=word.charAt(i)-97;		//word에 있는 알파벳의 순서(abcde.... -> 0번째알파벳, 1번째알파벳...
		
		if(count[al]==-1) {
			count[al]=i;
		}
		
	}
	for(int i=0; i<count.length; i++) {
		System.out.print(count[i]+" ");
	}

}
}
