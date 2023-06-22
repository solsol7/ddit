
package ddit.or.kr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class StudyMiddleTest {
	

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			
//			1. 6���� �̸��� ������ �� �ִ� ���� names�� ���� �� �����ϰ�, �ֺ� ģ������ �̸����� �ʱ�ȭ�Ѵ�. (5��)
			String[] names= {"������", "�ڹ���", "��ҿ�", "������", "�輮ȣ", "ȫ�浿"};
			
//			2. 7������ �̸��� ������ �� �ִ� ���� subjects�� ���� �� �����ϰ�, ����, ����, ����, ��ȸ, ����, Java, Oracle�� �ʱ�ȭ�Ѵ�. (5��)
			String[] subjects= {"����", "����", "����", "��ȸ", "����", "Java", "Oracle"};
		
//			3. 6���� 7������ ����(����)�� ������ �� �ִ� ���� score�� ���� �� �����Ѵ�. (5��)
//			(��, names�� subjects�� ���̸� �̿��Ѵ�.)
			int[][] score = new int[names.length][subjects.length];
			
			
//			4. score�� ��� ��ҿ� 50~100 ������ ������ ��(����)�� �����Ѵ�. (5��)
			for(int i=0; i<score.length; i++) {
				for(int j=0; j<score[i].length; j++) {
					score[i][j]=(int)((Math.random()*51)+50);
				}
			}
			
//			5. �л��� �հ踦 ������ �� �ִ� ���� nameSum�� ���� �� �����Ѵ�. (5��)
//			(��, names�� ���̸� �̿��Ѵ�.)
			int[] nameSum=new int[names.length];
			
//			6. nameSum�� ��ҿ� �Ʒû��� �հ踦 �����Ѵ�. (5��)
			for(int i=0; i<score.length; i++) {
				int sum=0;
				for(int j=0; j<score[i].length; j++) {
					sum+=score[i][j];
				}
				nameSum[i]=sum;
			}
			
//			7. �л��� ���(�Ǽ�)�� ������ �� �ִ� ���� nameAvg�� ���� �� �����Ѵ�. (5��)
//			(��, names�� ���̸� �̿��Ѵ�.)		
			double[] nameAvg=new double[names.length];
			
//			8. nameAvg�� ��ҿ� �л��� ���(�Ǽ�)�� �����Ѵ�. (5��)
//			(��, ����� �Ҽ��� �� ��° �ڸ����� '�ݿø�'�Ͽ� �� ��° �ڸ����� �����Ѵ�.)
			for(int i=0; i<nameAvg.length; i++) {
				double avg=(double)nameSum[i]/subjects.length;
				nameAvg[i]=Double.parseDouble(String.format("%.2f", avg));
			}
			
//			9. ���� �հ踦 ������ �� �ִ� ���� subSum�� ���� �� �����Ѵ�. (5��)
//			(��, subjects�� ���̸� �̿��Ѵ�.)
			int[] subSum=new int[subjects.length];
			
//			10. subSum�� ��ҿ� ���� �հ踦 �����Ѵ�. (5��)
			for(int i=0; i<subSum.length; i++) {
				int sum=0;
				for(int j=0; j<score.length; j++) {
					sum+=score[j][i];
				}
				subSum[i]=sum;
			}
			
//			11. ���� ���(�Ǽ�)�� ������ �� �ִ� ���� subAvg�� ���� �� �����Ѵ�. (5��)
//			(��, subjects�� ���̸� �̿��Ѵ�.)
			double[] subAvg=new double[subjects.length];
			
//			12. subAvg�� ��ҿ� ���� ���(�Ǽ�)�� �����Ѵ�. (5��)
//			(��, ����� �Ҽ��� �� ��° �ڸ����� '�ݿø�'�Ͽ� �� ��° �ڸ����� �����Ѵ�.)
			for(int i=0; i<subAvg.length; i++) {
				double avg=(double)subSum[i]/names.length;
				subAvg[i]=Double.parseDouble(String.format("%.2f", avg));
			}
			
//			13. �л��� ������ ������ �� �ִ� ���� rank�� ���� �� �����Ѵ�. (5��)
//			(��, names�� ���̸� �̿��Ѵ�.)
			int[] rank = new int[names.length];
			
//			14. rank�� ��ҿ� �հ踦 �������� �Ʒû��� ������ �����Ѵ�. (15��)
			for(int i=0; i<rank.length; i++) {
				rank[i]=1;
				for(int j=0; j<rank.length; j++) {
					if(nameSum[i]<nameSum[j]) {
						rank[i]++;
					}
				}
			}
			
//			15. ������ ������ �������� �̿��Ͽ� �Ʒ��� ���� ����Ѵ�.(���м� ����) (20��)
//			====================================================================================
//					| ����	����		����		��ȸ		����		Java	Oracle	| �հ�	���	����
//			--------��-------------------------------------------------------��-------------------
//			�����	| 95	55		73		64		53		68		96		| 504	72.0	4
//			����		| 74	81		97		64		59		89		74		| 538	76.86	1
//			��ȿ��	| 80	50		55		51		63		82		85		| 466	66.57	6
//			�̼�		| 99	59		84		99		55		68		72		| 536	76.57	2
//			�ſ���	| 51	82		53		76		91		64		93		| 510	72.86	3
//			������	| 84	67		73		79		55		61		73		| 492	70.29	5
//			--------��-------------------------------------------------------��-------------------
//			�հ�		| 483	394		435		433		376		432		493		|
//			���		| 80.5	65.67	72.5	72.17	62.67	72.0	82.17	|
//			====================================================================================
			
			System.out.println("==========================================================================================");
			System.out.print("        | ");
			for(int i=0; i<subjects.length; i++) {
				System.out.print(subjects[i]+"\t");
			}
			System.out.println("| �հ�        ���        ����     ");
			System.out.println("------------------------------------------------------------------------------------------");
			for(int i=0; i<names.length; i++) {
				System.out.printf("%-10s|",names[i]);
				System.out.print("  ");
				for(int j=0; j<subjects.length; j++) {
					System.out.print(score[i][j]+"\t");
				}
				System.out.print("  "+nameSum[i]);
				System.out.print("\t"+nameAvg[i]);
				System.out.print("\t  "+rank[i]);
				System.out.println();
			}
			
			
			
//			(optional. 15������ �ϼ��ߴٸ�, �����غ�����.)
//			�߰�1. ����ڿ��� �л��� �߰��� ������ ����� (y/n) (+10��)
//			����ڰ� �л� �߰��� ���Ѵٸ� �л��� �̸��� �Է¹޾� �л��� �ϰ� ���� ������ �������� �ο��մϴ�.
//			�л��� ��� �Է��� �� ���� �����(y/n). ��� �Է��� �ްų� �ߴ��մϴ�.
//			���� �߰��� �л��� ������ �����Ͽ� ���� �� ����� �ٽ� �����ݴϴ�.
			
			List<String> nameArr = new ArrayList<>();
			List<List[]> stdScore = new ArrayList<>();
			
			for(int i=0; i<names.length; i++) {
				nameArr.add(names[i]);
			}
			for(int i=0; i<score.length; i++) {
				List[] scoreArr = new ArrayList[2];
				for(int j=0; j<scoreArr.length; j++) {
					scoreArr[j]=new ArrayList();
				}
				for(int j=0; j<subjects.length; j++) {
					scoreArr[0].add(subjects[j]);
				}
				for(int j=0; j<score[i].length; j++) {
					scoreArr[1].add(score[i][j]);
				}
				stdScore.add(scoreArr);
			}
			
			List<Integer> sumArr= new ArrayList<>();
			for(int i=0; i<stdScore.size(); i++){
				int sum=0;
				for(Object j : stdScore.get(i)[1]) {
					sum+=(int)j;
				}
				sumArr.add(sum);
			}
			
			int rank2=1;
			for(int i=0; i<sumArr.size(); i++) {
				for(int j=0; j<sumArr.size(); j++) {
					if(sumArr.get(i)<sumArr.get(j)) {
						rank2++;
					}
				}
				sumArr.add(rank2);
			}
			
			System.out.println("==========================================================================================");
			System.out.print("        | ");
			for(int i=0; i<stdScore.get(0)[0].size(); i++) {
				System.out.print(stdScore.get(0)[0].get(i)+"\t");
			}
			System.out.println("| �հ�        ���        ����     ");
			System.out.println("------------------------------------------------------------------------------------------");	
			
			
			
			
			
			
/* ���.... 
			Map<String, Map<String, Integer>> nameMap=new HashMap<>();		// <�̸�<����, ����>>
			List<String> subjectArr = new ArrayList<>();
			for(String str : subjects) {
				subjectArr.add(str);
			}
			
			for(int i=0; i<names.length; i++) {								//�迭�� �ִ� �̸�, ����, ���� �ʿ� �ֱ�
				Map<String, Integer> newScore = new HashMap<>();
				for(int j=0; j<subjects.length; j++) {
					newScore.put(subjects[j], score[i][j]);
				}
				nameMap.put(names[i], newScore);
			}
			
			loop : while(true) {
				System.out.print("�л��� �߰��Ͻðڽ��ϱ�?(y/n) : ");
				String str=sc.nextLine();
				switch (str) {
				case "y":
					System.out.print("�̸� �Է� : ");
					String name=sc.nextLine();
					Map<String, Integer> scoreMap=new HashMap<>();
					for(int i=0; i<subjectArr.size() ; i++) {
						int a=(int)(Math.random()*51)+50;
						scoreMap.put(subjectArr.get(i), a);
					}
					nameMap.put(name, scoreMap);
					break;
				case "n":
					break loop;				
				default:
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
					break;
				}
			}
			
			System.out.println("==========================================================================================");
			System.out.print("        | ");
			for(int i=0; i<subjectArr.size(); i++) {
				System.out.print(subjectArr.get(i)+"\t");
			}
			System.out.println("| �հ�        ���        ����     ");
			System.out.println("------------------------------------------------------------------------------------------");	
			for(String key : nameMap.keySet()) {
				System.out.printf(key+"      |");
				System.out.print("  ");
				int nameSum2=0;
				for(int i=0; i<subjectArr.size(); i++) {
					int a=nameMap.get(key).get(subjectArr.get(i));
					System.out.print(a+"\t");										//���� ����
					nameSum2+=a;													//�л��� �հ�
				}
					double nameAvg2=(double)nameSum2/subjectArr.size();
					nameAvg2=Double.parseDouble(String.format("%.2f", nameAvg2));		//�л��� ���
		
				System.out.print("  "+nameSum2);
				System.out.print("\t"+nameAvg2);
				//System.out.print("\t  "+rank[i]);			���
				System.out.println();
			
			}
			
			
*/
			
//			�߰�2. ����ڿ��� ������ �߰��� ������ ����� (y/n) (+10��)
//			����ڰ� ���� �߰��� ���Ѵٸ� ������ �̸��� �Է¹޾� ������ �߰��ϰ� �л����� ������ ���� �ο��մϴ�.
//			���� �߰��� ������ ������ �����Ͽ� ���� �� ����� �ٽ� �����ݴϴ�.

//			�߰�3. ���� �� �հ�, ���, ���� �߿� ����ڰ� �����Ͽ� ������ �� �ִ� ����� ��������. (+15��)
//			(��, ���� �� �հ�, ����� ������������ / ������ ������������(1���� �� ����))
//			(��, ���� ���ؿ� * ǥ�ø� �صд�)
//				����)
//				������ ����� �������ּ���.
//				1.���� 2.���� 3.���� 4.��ȸ 5.���� 6.Java 7.Oracle 8.�հ� 9.��� 10.����
//				���� >> 10
//				====================================================================================
//						| ����	����		����		��ȸ		����		Java	Oracle	| �հ�	���	����*
//				--------��-------------------------------------------------------��-------------------
//				����		| 74	81		97		64		59		89		74		| 538	76.86	1
//				�̼�		| 99	59		84		99		55		68		72		| 536	76.57	2
//				�ſ���	| 51	82		53		76		91		64		93		| 510	72.86	3
//				�����	| 95	55		73		64		53		68		96		| 504	72.0	4
//				������	| 84	67		73		79		55		61		73		| 492	70.29	5
//				��ȿ��	| 80	50		55		51		63		82		85		| 466	66.57	6
//				--------��-------------------------------------------------------��-------------------
//				�հ�		| 483	394		435		433		376		432		493		|
//				���		| 80.5	65.67	72.5	72.17	62.67	72.0	82.17	|
//				====================================================================================
			
//			�߰�4. Ư�� �л��� Ư�� ���� ������ ������ �� �ִ� ����� ��������. (+20��)
//				����)
//				������ �����Ͻðڽ��ϱ�? (y/n) >> y
//				�л��̸��� �Է��ϼ��� >> ������
//				������� �Է��ϼ��� >> ����
//				������ �Է��ϼ��� >> 100
//				====================================================================================
//						| ����	����		����		��ȸ		����		Java	Oracle	| �հ�	���	����*
//				--------��-------------------------------------------------------��-------------------
//				����		| 74	81		97		64		59		89		74		| 538	76.86	1
//				������	| 84	67		73		79		100		61		73		| 537	76.71	2
//				�̼�		| 99	59		84		99		55		68		72		| 536	76.57	3
//				�ſ���	| 51	82		53		76		91		64		93		| 510	72.86	4
//				�����	| 95	55		73		64		53		68		96		| 504	72.0	5
//				��ȿ��	| 80	50		55		51		63		82		85		| 466	66.57	6
//				--------��-------------------------------------------------------��-------------------
//				�հ�		| 483	394		435		433		421		432		493		|
//				���		| 80.5	65.67	72.5	72.17	70.17	72.0	82.17	|
//				====================================================================================

//			�� ������ ��� �����Ͽ� �����Ͽ� �ٿ��ְ� '�� ���� �Ʒ�'�� �ڵ带 �ۼ��մϴ�.
//			���� Ǯ�� �Ϸ� �� �ҽ��ڵ� ��ü�� �����Ͽ� tablet7823@daum.net ���� ���� ������ �ٿ��־� �����ּ���.
//			���� ������ '[�ʱ��ڹ� �����׽�Ʈ] 202209 �̸�'���� �մϴ�.
//			���� �Ʒ��� ���ǻ����̳� ��û����, ������� �� ������ �ۼ��ϼŵ� �����ϴ�.
	}
	
}
