/*
�� 16���� �ǽ� : ŷ 1��, �� 1��, �� 2��, ��� 2��, ����Ʈ 2��, �� 8��
��� �ǽ��� ������ �־����� ��, �� ���� ���ϰų� ���� �ùٸ� ��Ʈ�� �Ǵ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */

package user02;

import java.util.Arrays;

public class Chess {

	public static void main(String[] args) {
		int[] num= {3,5,1,2,0,7};
		Chess1 c1=new Chess1();
		System.out.println(Arrays.toString(c1.chess(num)));
	}
}


class Chess1{
public int[] chess(int[] num) {
	int[] base = {1,1,2,2,2,8};
	int[] count= new int[6];
	for(int i=0; i<num.length; i++) {
		while(num[i]!=base[i]) {
			if(num[i]<base[i]) {
				num[i]++;
				count[i]++;
			}else if(num[i]>base[i]) {
				num[i]--;
				count[i]--;
			}
		}
		
	}
	return count;
}

}
