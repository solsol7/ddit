
package ddit.or.kr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class StudyMiddleTest {
	

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			StudyMiddleTest smt=new StudyMiddleTest();
			
//			1. 6명의 이름을 저장할 수 있는 변수 names를 선언 및 생성하고, 주변 친구들의 이름으로 초기화한다. (5점)
			String[] names= {"이은솔", "박민주", "김소원", "김태형", "김석호", "홍길동"};
			
//			2. 7과목의 이름을 저장할 수 있는 변수 subjects를 선언 및 생성하고, 국어, 영어, 수학, 사회, 과학, Java, Oracle로 초기화한다. (5점)
			String[] subjects= {"국어", "영어", "수학", "사회", "과학", "Java", "Oracle"};
		
//			3. 6명의 7과목의 점수(정수)를 저장할 수 있는 변수 score를 선언 및 생성한다. (5점)
//			(단, names와 subjects의 길이를 이용한다.)
			int[][] score = new int[names.length][subjects.length];
			
			
//			4. score의 모든 요소에 50~100 사이의 임의의 값(정수)을 저장한다. (5점)
			for(int i=0; i<score.length; i++) {
				for(int j=0; j<score[i].length; j++) {
					score[i][j]=(int)((Math.random()*51)+50);
				}
			}
			
//			5. 학생별 합계를 저장할 수 있는 변수 nameSum을 선언 및 생성한다. (5점)
//			(단, names의 길이를 이용한다.)
			int[] nameSum=new int[names.length];
			
//			6. nameSum의 요소에 훈련생별 합계를 저장한다. (5점)
			for(int i=0; i<score.length; i++) {
				int sum=0;
				for(int j=0; j<score[i].length; j++) {
					sum+=score[i][j];
				}
				nameSum[i]=sum;
			}
			
//			7. 학생별 평균(실수)을 저장할 수 있는 변수 nameAvg를 선언 및 생성한다. (5점)
//			(단, names의 길이를 이용한다.)		
			double[] nameAvg=new double[names.length];
			
//			8. nameAvg의 요소에 학생별 평균(실수)을 저장한다. (5점)
//			(단, 평균은 소수점 세 번째 자리에서 '반올림'하여 두 번째 자리까지 저장한다.)
			for(int i=0; i<nameAvg.length; i++) {
				double avg=(double)nameSum[i]/subjects.length;
				nameAvg[i]=Double.parseDouble(String.format("%.2f", avg));
			}
			
//			9. 과목별 합계를 저장할 수 있는 변수 subSum을 선언 및 생성한다. (5점)
//			(단, subjects의 길이를 이용한다.)
			int[] subSum=new int[subjects.length];
			
//			10. subSum의 요소에 과목별 합계를 저장한다. (5점)
			for(int i=0; i<subSum.length; i++) {
				int sum=0;
				for(int j=0; j<score.length; j++) {
					sum+=score[j][i];
				}
				subSum[i]=sum;
			}
			
//			11. 과목별 평균(실수)을 저장할 수 있는 변수 subAvg를 선언 및 생성한다. (5점)
//			(단, subjects의 길이를 이용한다.)
			double[] subAvg=new double[subjects.length];
			
//			12. subAvg의 요소에 과목별 평균(실수)을 저장한다. (5점)
//			(단, 평균은 소수점 세 번째 자리에서 '반올림'하여 두 번째 자리까지 저장한다.)
			for(int i=0; i<subAvg.length; i++) {
				double avg=(double)subSum[i]/names.length;
				subAvg[i]=Double.parseDouble(String.format("%.2f", avg));
			}
			
//			13. 학생별 석차를 저장할 수 있는 변수 rank를 선언 및 생성한다. (5점)
//			(단, names의 길이를 이용한다.)
			int[] rank = new int[names.length];
			
//			14. rank의 요소에 합계를 기준으로 훈련생별 석차를 저장한다. (15점)
			for(int i=0; i<rank.length; i++) {
				rank[i]=1;
				for(int j=0; j<rank.length; j++) {
					if(nameSum[i]<nameSum[j]) {
						rank[i]++;
					}
				}
			}
			
//			15. 위에서 생성된 변수들을 이용하여 아래와 같이 출력한다.(구분선 제외) (20점)
//			====================================================================================
//					| 국어	영어		수학		사회		과학		Java	Oracle	| 합계	평균	석차
//			--------┼-------------------------------------------------------┼-------------------
//			김범수	| 95	55		73		64		53		68		96		| 504	72.0	4
//			나얼		| 74	81		97		64		59		89		74		| 538	76.86	1
//			박효신	| 80	50		55		51		63		82		85		| 466	66.57	6
//			이수		| 99	59		84		99		55		68		72		| 536	76.57	2
//			신용재	| 51	82		53		76		91		64		93		| 510	72.86	3
//			하현우	| 84	67		73		79		55		61		73		| 492	70.29	5
//			--------┼-------------------------------------------------------┼-------------------
//			합계		| 483	394		435		433		376		432		493		|
//			평균		| 80.5	65.67	72.5	72.17	62.67	72.0	82.17	|
//			====================================================================================
			
			System.out.println("==========================================================================================");
			System.out.print("        | ");
			for(int i=0; i<subjects.length; i++) {
				System.out.print(subjects[i]+"\t");
			}
			System.out.println("| 합계        평균        석차     ");
			System.out.println("------------------------------------------------------------------------------------------");
			for(int i=0; i<names.length; i++) {
				System.out.printf("%-10s|",names[i]);
				System.out.print("  ");
				for(int j=0; j<subjects.length; j++) {
					System.out.print(score[i][j]+"\t");
				}
				System.out.print("| "+nameSum[i]);
				System.out.print("\t"+nameAvg[i]);
				System.out.print("\t  "+rank[i]);
				System.out.println();
			}
			System.out.println("------------------------------------------------------------------------------------------");
			System.out.print("합계          | ");
			for(int i=0; i<subSum.length; i++) {
				System.out.print(subSum[i]+"\t");
			}
			System.out.println("| ");
			System.out.print("평균          | ");
			for(int i=0; i<subAvg.length; i++) {
				System.out.print(subAvg[i]+"\t");
			}
			System.out.println("| ");
			System.out.println("==========================================================================================");
			
//			(optional. 15번까지 완성했다면, 도전해보세요.)
//			추가1. 사용자에게 학생을 추가할 것인지 물어보고 (y/n) (+10점)
//			사용자가 학생 추가를 원한다면 학생의 이름을 입력받아 학생의 일곱 과목 점수를 랜덤으로 부여합니다.
//			학생을 계속 입력할 것 인지 물어보고(y/n). 계속 입력을 받거나 중단합니다.
//			새로 추가된 학생의 점수를 포함하여 계산된 총 출력을 다시 보여줍니다.

//			추가2. 사용자에게 과목을 추가할 것인지 물어보고 (y/n) (+10점)
//			사용자가 과목 추가를 원한다면 과목의 이름을 입력받아 과목을 추가하고 학생들의 점수는 랜덤 부여합니다.
//			새로 추가된 과목의 점수를 포함하여 계산된 총 출력을 다시 보여줍니다.
			
//			추가3. 과목 및 합계, 평균, 석차 중에 사용자가 선택하여 정렬할 수 있는 기능을 만들어보세요. (+15점)
//			(단, 과목 및 합계, 평균은 내림차순으로 / 석차는 오름차순으로(1등이 맨 위로))
//			(단, 정렬 기준에 * 표시를 해둔다)
//				예시)
//				정렬할 대상을 선택해주세요.
//				1.국어 2.영어 3.수학 4.사회 5.과학 6.Java 7.Oracle 8.합계 9.평균 10.석차
//				선택 >> 10
//				====================================================================================
//						| 국어	영어		수학		사회		과학		Java	Oracle	| 합계	평균	석차*
//				--------┼-------------------------------------------------------┼-------------------
//				나얼		| 74	81		97		64		59		89		74		| 538	76.86	1
//				이수		| 99	59		84		99		55		68		72		| 536	76.57	2
//				신용재	| 51	82		53		76		91		64		93		| 510	72.86	3
//				김범수	| 95	55		73		64		53		68		96		| 504	72.0	4
//				하현우	| 84	67		73		79		55		61		73		| 492	70.29	5
//				박효신	| 80	50		55		51		63		82		85		| 466	66.57	6
//				--------┼-------------------------------------------------------┼-------------------
//				합계		| 483	394		435		433		376		432		493		|
//				평균		| 80.5	65.67	72.5	72.17	62.67	72.0	82.17	|
//				====================================================================================
						

//			본 내용을 모두 선택하여 복사하여 붙여넣고 '각 문제 아래'에 코드를 작성합니다.
//			문제 풀이 완료 후 소스코드 전체를 복사하여 tablet7823@daum.net 으로 메일 본문에 붙여넣어 보내주세요.
//			메일 제목은 '[초급자바 레벨테스트] 202209 이름'으로 합니다.
//			본문 아래에 건의사항이나 요청사항, 도움사항 등 내용을 작성하셔도 좋습니다.
			
//			추가4. 특정 학생의 특정 과목 점수를 수정할 수 있는 기능을 만들어보세요. (+20점)
//			예시)
//			점수를 수정하시겠습니까? (y/n) >> y
//			학생이름을 입력하세요 >> 하현우
//			과목명을 입력하세요 >> 과학
//			점수를 입력하세요 >> 100
//			====================================================================================
//					| 국어	영어		수학		사회		과학		Java	Oracle	| 합계	평균	석차*
//			--------┼-------------------------------------------------------┼-------------------
//			나얼		| 74	81		97		64		59		89		74		| 538	76.86	1
//			하현우	| 84	67		73		79		100		61		73		| 537	76.71	2
//			이수		| 99	59		84		99		55		68		72		| 536	76.57	3
//			신용재	| 51	82		53		76		91		64		93		| 510	72.86	4
//			김범수	| 95	55		73		64		53		68		96		| 504	72.0	5
//			박효신	| 80	50		55		51		63		82		85		| 466	66.57	6
//			--------┼-------------------------------------------------------┼-------------------
//			합계		| 483	394		435		433		421		432		493		|
//			평균		| 80.5	65.67	72.5	72.17	70.17	72.0	82.17	|
//			====================================================================================
			
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
			
			loop1 : while(true) {
				System.out.println("1.학생추가\t\t2.과목추가\t\t3.점수수정\t\t4.정렬\t\t5.시스템종료");
				String menu=sc.nextLine();
				switch (menu) {
				case "1":
					loop2 : while(true) {
					System.out.print("학생을 추가하시겠습니까?(y/n) : ");
					String str=sc.nextLine();
					switch (str) {
					case "y":
						System.out.print("이름 입력 : ");
						String name=sc.nextLine();
						nameArr.add(name);
						List[] scoreArr = new ArrayList[2];
						for(int i=0; i<scoreArr.length; i++) {
							scoreArr[i]=new ArrayList();
						}
						for(int i=0; i<stdScore.get(0)[0].size() ; i++) {
							scoreArr[0].add(stdScore.get(0)[0].get(i));
							int a=(int)(Math.random()*51)+50;
							scoreArr[1].add(a);
						}
						stdScore.add(scoreArr);
						
						break;
					case "n":
						break loop2;				
					default:
						System.out.println("잘못 입력하셨습니다.");
						break;
					}
					}
					smt.calNPrint(nameArr, stdScore);
				
					break;
				case "2":
					loop2 : while(true) {
						System.out.print("과목을 추가하시겠습니까?(y/n) : ");
						String str=sc.nextLine();
						switch (str) {
						case "y":
							System.out.print("과목 입력 : ");
							String subject=sc.nextLine();
							for(int i=0; i<stdScore.size(); i++) {
								stdScore.get(i)[0].add(subject);
								stdScore.get(i)[1].add((int)(Math.random()*51)+50);
							}
							break;
						case "n":
							break loop2;				
						default:
							System.out.println("잘못 입력하셨습니다.");
							break;
						}
						}
						smt.calNPrint(nameArr, stdScore);
					
					break;
				case "3" :
					System.out.print("점수를 수정하시겠습니까?(y/n)");
					String str=sc.nextLine();
					switch (str) {
					case "y":
						System.out.print("학생이름을 입력하세요 >> ");
						String name=sc.nextLine();
						System.out.print("과목명을 입력하세요 >> ");
						String subject=sc.nextLine();
						System.out.print("점수를 입력하세요 >> ");
						int newScore=sc.nextInt();
						for(int i=0; i<nameArr.size(); i++) {
							for(int j=0; j<stdScore.get(0)[1].size(); j++)
							if(nameArr.get(i).equals(name) && stdScore.get(i)[0].get(j).equals(subject)) {
								stdScore.get(i)[1].set(j, newScore);
								smt.calNPrint(nameArr, stdScore);
								break;
							}else {
								System.out.println("이름 또는 과목을 잘못 입력하셨습니다.");
								break;
							}
							break;
						}
						
						break;
					case "n":
						break;				
					default:
						System.out.println("잘못 입력하셨습니다.");
						break;
					}
					
					break;
				case "4" :
					List<Integer> sumArr= new ArrayList<>();
					for(int i=0; i<stdScore.size(); i++){
						int sum=0;
						for(Object j : stdScore.get(i)[1]) {
							sum+=(int)j;
						}
						sumArr.add(sum);
					}
					
					List<Integer> rankArr = new ArrayList<>();
					for(int i=0; i<sumArr.size(); i++) {
						int rank2=1;
						for(int j=0; j<sumArr.size(); j++) {
							if(sumArr.get(i)<sumArr.get(j)) {
								rank2++;
							}
						}
						rankArr.add(rank2);
					}
					
					List<Integer> sumArrSub= new ArrayList<>();
					for(int i=0; i<stdScore.get(0)[0].size(); i++) {
						int sum=0;
						for(int j=0; j<stdScore.size(); j++) {
							sum+=(int)stdScore.get(j)[1].get(i);
						}
						sumArrSub.add(sum);
					}	
					
					System.out.println("정렬할 과목을 입력해주세요.");
					String target=sc.nextLine();
					
					
					int a=0;
					for(int i=0; i<stdScore.get(0)[0].size(); i++) {
						if(target.equals(stdScore.get(0)[0].get(i))){
							a=i;
							for(int j=0; j<stdScore.size(); j++) {
							for(int k=0; k<stdScore.size();k++) {
								if((int)stdScore.get(j)[1].get(a)>(int)stdScore.get(k)[1].get(a)) {
									List[] temp1=stdScore.get(j);
									stdScore.set(j, stdScore.get(k));
									stdScore.set(k, temp1);
							
									String temp2=nameArr.get(j);
									nameArr.set(j, nameArr.get(k));
									nameArr.set(k, temp2);
									}
								}
							}
						}
						}
					if(target.equals("합계")) {
							for(int i=0; i<sumArr.size(); i++) {
								
							}
					
					}
					if(a==0) {
						System.out.println("잘못입력하셨습니다.");
					}else {
						smt.calNPrint(nameArr, stdScore);
					}
					break;
				case "5" :
					System.out.println("시스템을 종료합니다.");
					break loop1;
				default:
					break;
				}
			}
				
			
	}
	
	public void calNPrint(List<String> nameArr, List<List[]> stdScore) {
		List<Integer> sumArr= new ArrayList<>();
		for(int i=0; i<stdScore.size(); i++){
			int sum=0;
			for(Object j : stdScore.get(i)[1]) {
				sum+=(int)j;
			}
			sumArr.add(sum);
		}
		
		List<Integer> rankArr = new ArrayList<>();
		for(int i=0; i<sumArr.size(); i++) {
			int rank2=1;
			for(int j=0; j<sumArr.size(); j++) {
				if(sumArr.get(i)<sumArr.get(j)) {
					rank2++;
				}
			}
			rankArr.add(rank2);
		}
		
		List<Integer> sumArrSub= new ArrayList<>();
		for(int i=0; i<stdScore.get(0)[0].size(); i++) {
			int sum=0;
			for(int j=0; j<stdScore.size(); j++) {
				sum+=(int)stdScore.get(j)[1].get(i);
			}
			sumArrSub.add(sum);
		}
		System.out.println("==========================================================================================");
		System.out.print("        | ");
		for(int i=0; i<stdScore.get(0)[0].size(); i++) {
			System.out.print(stdScore.get(0)[0].get(i)+"\t");
		}
		System.out.println("| 합계        평균        석차     ");
		System.out.println("------------------------------------------------------------------------------------------");	
		for(int i=0; i<nameArr.size(); i++) {
			System.out.print(nameArr.get(i)+"\t|");
			System.out.print("  ");
			for(int j=0; j<stdScore.get(i)[1].size(); j++) {
				System.out.print(stdScore.get(i)[1].get(j)+"\t");
			}
			System.out.print("| "+sumArr.get(i)+"\t");
			double avg=(double)sumArr.get(i)/stdScore.get(i)[0].size();
			double avg2=Double.parseDouble(String.format("%.2f", avg));
			System.out.print(avg2+"\t");
			System.out.print(rankArr.get(i));
			System.out.println();
			
		}
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.print("합계          | ");
		for(int i=0; i<sumArrSub.size(); i++) {
			System.out.print(sumArrSub.get(i)+"\t");
		}
		System.out.println("| ");
		System.out.print("평균          | ");
		for(int i=0; i<sumArrSub.size(); i++) {
			double avg=(double)sumArrSub.get(i)/nameArr.size();
			double avg2=Double.parseDouble(String.format("%.2f", avg));
			System.out.print(avg2+"\t");
		}
		System.out.println("| ");
		System.out.println("==========================================================================================");
	}
}

