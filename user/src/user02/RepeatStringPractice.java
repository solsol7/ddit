/*
 * ���ڿ� S�� �Է¹��� �Ŀ�, �� ���ڸ� R�� �ݺ��� �� ���ڿ� P�� ���� �� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ��, ù ��° ���ڸ� R�� �ݺ��ϰ�, �� ��° ���ڸ� R�� �ݺ��ϴ� ������ P�� ����� �ȴ�.
 * S���� QR Code "alphanumeric" ���ڸ� ����ִ�.
 * QR Code "alphanumeric" ���ڴ� 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: �̴�.
 */

package user02;

import java.util.Scanner;

public class RepeatStringPractice {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		String s=sc.nextLine();
		char[] word=s.toCharArray();
		for(int i=0; i<word.length; i++) {
			for(int j=0; j<r; j++) {
				System.out.print(word[i]);
			}
		}
	}

}
