/*
 * �Է�
ù° �ٿ� N(1 �� N �� 100)�� �־�����.
 * ���
ù° �ٺ��� 2��N-1��° �ٱ��� ���ʴ�� ���� ����Ѵ�.
 */
package user02;

import java.util.Scanner;

public class StarPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� N �Է� : ");
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
