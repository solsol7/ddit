/*
 * 입력
첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
 * 출력
첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.
 */
package user02;

import java.util.Scanner;

public class StarPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 N 입력 : ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=0; j<n-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<n; i++) {
			for(int j=0; j<i; j++){
				System.out.print(" ");
			}
			for(int j=0; j<(2*n-1)-(2*i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
