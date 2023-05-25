/*
총 16개의 피스 : 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개
흰색 피스의 개수가 주어졌을 때, 몇 개를 더하거나 빼야 올바른 세트가 되는지 구하는 프로그램을 작성하시오.
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
