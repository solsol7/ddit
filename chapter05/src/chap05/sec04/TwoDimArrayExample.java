/*
2�����迭���� 1] 5���� 3���� ������ �� ����� ������ ����.
			 �̸� �迭 ������ �� ����Ͻÿ�.
		[�ڷ�]
		�̸�		����		����		����
		ȫ�浿	70		80		60
		�̼���	80		90		90
		������	90		80		90
		������	75		80		80
		�̼���	60		70		60

2�����迭���� 2] �� �ڷḦ �̿��Ͽ� ������ ���(����)�� ���Ͻÿ�   ->����, ��յ� �����̱� ������ �迭�� ������ ���� ������ �� ��

2�����迭���� 3] �� �ڷḦ �̿��Ͽ� ������ ���(����) �� ����(���)�� ���Ͻÿ�

2023/05/15�� ���� ] �� 3��������� 1����� ���ʴ�� ����Ͻÿ�

*/ 

/* numberOf
������� ����
���ϵ�� + ���ϵ�� ���� : �������
1����� ���ʴ�� ����ϰ��ʹ� : ��ġ�� �ٲ�����

�̸�, ���� - Ÿ�� �ٸ� - ���� �迭�� ������ �� ����(�̸�-1�����迭, ����-2�����迭)
*/

package chap05.sec04;

public class TwoDimArrayExample {

	public static void main(String[] args) {
		TwoDimArray td=new TwoDimArray();
		td.getRank();
		td.sequence();
	}

}

class TwoDimArray{
	private String[] name= {"ȫ�浿","�̼���","������", "������","�̼���"};		//�̸��迭�� �������� ������ϱ� �޼ҵ� �տ�
	public void getScore() {
		int[][] score = {{70,80,60},{80,90,90},{90,80,90},{75,80,80},{60,70,60}};  //�ұ�Ģ�� ������ �ϳ��ϳ� �־���, ��Ģ���̰ų� ���� ���� for��
		printScore(score);
		
		}


	
	public void sumOfScore() {
		int[][] score = {{70,80,60,0,0},{80,90,90,0,0},{90,80,90,0,0},{75,80,80,0,0},{60,70,60,0,0}};
		//���� �� ���
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<3; j++) {
				score[i][3]=score[i][3]+score[i][j];
			}
			score[i][4]=score[i][3]/3;
		}
		System.out.println("               ***����ǥ***              ");
		System.out.println("--------------------------------------------");
		System.out.println("�� ��    ����       ����      ����      ����      ���");
		System.out.println("--------------------------------------------");
		printScore(score);
	}
	
	
	public void getRank() {
		int[][] score = {{70,80,60,0,0,1},{80,90,90,0,0,1},{90,80,90,0,0,1},{75,80,80,0,0,1},{60,70,60,0,0,1}};
		//���� �� ���
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<3; j++) {
				score[i][3]=score[i][3]+score[i][j];
			}
			score[i][4]=score[i][3]/3;
		}
		
		//���
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score.length; j++) {
				if(score[i][3]<score[j][3]) {
					score[i][5]++;
				}
			}
		}
		System.out.println("               ***����ǥ***              ");
		System.out.println("--------------------------------------------");
		System.out.println("�� ��    ����       ����      ����      ����      ���      ���");
		System.out.println("--------------------------------------------");
		printScore(score);
		}


	public void printScore(int[][]score) {
		for(int i=0; i<score.length; i++) {  	 //���� ������ 5 -> 5���� ���������� ����
			System.out.print(name[i]+" ");
			for(int j=0; j<score[i].length; j++) {
				System.out.printf("%6d",score[i][j]);
			}
			System.out.println();
	
			}
	}



	public void sequence() {
		int[][] score = {{70,80,60,0,0,1},{80,90,90,0,0,1},{90,80,90,0,0,1},{75,80,80,0,0,1},{60,70,60,0,0,1}};
		//���� �� ���
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<3; j++) {
				score[i][3]=score[i][3]+score[i][j];
			}
			score[i][4]=score[i][3]/3;
		}
		
		//���
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score.length; j++) {
				if(score[i][3]<score[j][3]) {
					score[i][5]++;
				}
			}
		}
		System.out.println("               ***����ǥ***              ");
		System.out.println("--------------------------------------------");
		System.out.println("�� ��    ����       ����      ����      ����      ���      ���");
		System.out.println("--------------------------------------------"); 
		
		
		
		
		//��� ���ʴ��
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score.length; j++){
				if(score[i][score.length-1]>score[j][score.length-1]) {
					int[] seq=score[i];
					score[i]=score[j];
					score[j]=seq;
					
					String na=name[i];
					name[i]=name[j];
					name[j]=na;
				}

			}

		}
		printScore(score);
		}
	}


	
//�̰��� ������