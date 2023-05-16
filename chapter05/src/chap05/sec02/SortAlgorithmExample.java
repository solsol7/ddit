package chap05.sec02;

public class SortAlgorithmExample {

	public static void main(String[] args) {
		//다음 수를 배열에 저장하고 크기순으로 정렬하시오.
		//자료 : 35, 80, 25, 69, 44, 51, 19, 97
		//Bubble Sort : 인접된 두 자료의 크기를 비교하여 자리를 교환
		//			: 자료가 n개 일 때 n-1회전수행
		int[] source= {35, 80, 25, 69, 44, 51, 19, 97};
		SortAlgorithm sa=new SortAlgorithm();
		sa.bubbleSort(source);
	}

}

class SortAlgorithm{

	public void bubbleSort(int[] target) {
		boolean flag=false;  //개선된 버블정렬
		int cnt=0;
		for(int i=0; i<target.length-1; i++) { //각 회전
			flag=false;
			cnt++;
			for(int j=0; j<target.length-1-i; j++) { //한 행에서 숫자비교 
													 //1회전 끝나면 마지막숫자 하나씩 빼고 자리교환하기 때문에 i뺌
				if(target[j]>target[j+1]) {
					int temp=target[j];
					target[j]=target[j+1];
					target[j+1]=temp;
					flag=true;
				}
			}
			if(!flag) break;
		}
		System.out.println("수행횟수 : "+cnt);
		for(int i=0; i<target.length; i++) {
			System.out.printf("%5d",target[i]);
		}
	}
}


