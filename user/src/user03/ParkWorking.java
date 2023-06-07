/*
 * 지나다니는 길을 'O', 장애물을 'X'로 나타낸 직사각형 격자 모양의 공원에서 로봇 강아지가 산책을 하려합니다. 산책은 로봇 강아지에 미리 입력된 명령에 따라 진행하며,
 * 명령은 다음과 같은 형식으로 주어집니다.

["방향 거리", "방향 거리" … ]
예를 들어 "E 5"는 로봇 강아지가 현재 위치에서 동쪽으로 5칸 이동했다는 의미입니다. 로봇 강아지는 명령을 수행하기 전에 다음 두 가지를 먼저 확인합니다.

주어진 방향으로 이동할 때 공원을 벗어나는지 확인합니다.
주어진 방향으로 이동 중 장애물을 만나는지 확인합니다.
위 두 가지중 어느 하나라도 해당된다면, 로봇 강아지는 해당 명령을 무시하고 다음 명령을 수행합니다.
공원의 가로 길이가 W, 세로 길이가 H라고 할 때, 공원의 좌측 상단의 좌표는 (0, 0), 우측 하단의 좌표는 (H - 1, W - 1) 입니다.
 */

package user03;

public class ParkWorking {

	public static void main(String[] args) {
		Solution s1=new Solution();
		String[] park= {"SOO","OOO","OOO"};
		String[] routes	= {"E 2","S 2","W 1"};
		System.out.println(s1.solution(park, routes));

	}

}

class Solution{
	public int[] solution(String[] park, String[] routes) {
		int[] answer = new int[2];
		int x=0;
		int y=0;
		char[][] parkChar=new char[park.length][park[0].length()];
		
		for(int i=0; i<park.length; i++) {
        	for(int j=0; j<park[0].length(); j++) {
        		parkChar[i][j]=park[i].charAt(j);
        	}
        }
		
		for(int i=0; i<parkChar.length; i++) {
			for(int j=0; j<parkChar[i].length; j++) {
				if(parkChar[i][j]=='S') {
					x=i;
					y=j;
				}
			}
		}
		
		for(int i=0; i<routes.length; i++) {
			int count=(int)(routes[i].charAt(2));
			if(routes[i].contains("E")) {
				int a=x;
				int b=y;
				while(count!=0) {	
					if((int)(routes[i].charAt(2))+x>parkChar[0].length ) {
						count=0;
					}else {
						if(parkChar[x][y]!='X') {
							parkChar[x][y]='O';
							parkChar[x][y+1]='S';
							y=y+1;
							count--;
						}else {
							parkChar[a][b]='S';
							count=0;
						}
					}
					answer[0]=x;
					answer[1]=y;
				}
			}else if(routes[i].contains("W")) {
				int a=x;
				int b=y;
				while(count!=0) {		
					if((int)(x-routes[i].charAt(2))<0 ) {
						count=0;
					}else {
						if(parkChar[x][y]!='X') {
							parkChar[x][y]='O';
							parkChar[x][y-1]='S';
							y=y-1;
							count--;
						}else {
							parkChar[a][b]='S';
							count=0;
						}
					}
					answer[0]=x;
					answer[1]=y;
				}
			}else if(routes[i].contains("S")) {
				int a=x;
				int b=y;
				while(count!=0) {
						if((int)(routes[i].charAt(2))+x>parkChar.length) {
							count=0;
						}else {
							if(parkChar[x][y]!='X') {
								parkChar[x][y]='O';
								parkChar[x+1][y]='S';
								x=x+1;
								count--;
							}else {
								parkChar[a][b]='S';
								count=0;
							}
						}
						answer[0]=x;
						answer[1]=y;
				}
			}else if(routes[i].contains("N")) {
				int a=x;
				int b=y;
				while(count!=0) {
						if((int)(routes[i].charAt(2))+x>parkChar[0].length ) {
							count=0;
						}else {
							if(parkChar[x][y]!='X') {
								parkChar[x][y]='O';
								parkChar[x-1][y]='S';
								x=x-1;
								count--;
							}else {
								parkChar[a][b]='S';
								count=0;
							}
						}
						answer[0]=x;
						answer[1]=y;
					}
			}
		}
		
		
		return answer;
	}
}



class Solution1 {
    public int[] solution(String[] park, String[] routes) {
    	Method method=new Method();
        int[] answer = {};
        int a=0;
        int b=0;
        char[][] parkChar=new char[park.length][park[0].length()];
        
        for(int i=0; i<park.length; i++) {
        	for(int j=0; j<park[0].length(); j++) {
        		parkChar[i][j]=park[i].charAt(j);
        	}
        }
        
        for(int i=0; i<routes.length; i++) {
        	int count=routes[i].charAt(2);
        	
	        while(count!=0) {
	        
		        for(int j=0; j<park.length; j++) {
		        	for(int k=0; k<park[0].length(); k++) {
		        		if(parkChar[i][j]=='S') {
		        			a=j;
		        			b=k;
		        		}
		        	}
		        }
		        
		        for(int l=0; l<routes.length; l++) {
		        	if(routes[l].contains("E")) {
		        		//method.outOfPark();
		        		method.obstacle();
		        		parkChar[a][b]='O';
		        		parkChar[a][b+1]='S';
		        		count--;
		        	}else if(routes[l].contains("W")) {
		        		//method.outOfPark();
		        		method.obstacle();
		        		parkChar[a][b]='O';
		        		parkChar[a][b-1]='S';
		        		count--;
		        	}else if(routes[l].contains("S")) {
		        		//method.outOfPark();
		        		method.obstacle();
		        		parkChar[a][b]='O';
		        		parkChar[a+1][b]='S';
		        		count--;
		        	}else if(routes[l].contains("N")) {
		        		//method.outOfPark();
		        		method.obstacle();
		        		parkChar[a][b]='O';
		        		parkChar[a-1][b]='S';
		        		count--;
		        	}
		        }
	        }
        }
        
        for(int i=0; i<park.length; i++) {
        	for(int j=0; j<park[0].length(); j++) {
        		if(parkChar[i][j]=='S') {
        			answer[0]=i;
        			answer[1]=j;
        		}
        	}
        }
        
        
        return answer;
    }
}

class Method{
	/*
	 * E가 있을 때 S의 위치에서 이동하는 숫자를 더해 parkChar[ ][i] i의 인덱스를 넘어가면 이동안함.

  W가 있을 때 S의 위치에서 이동하는 숫자를 빼 음수가 나오면 이동 안함.

  S가 있을 때 S의 위치에서 이동하는 숫자를 더해 parkChar[i][ ] i의 인덱스를 넘어가면 이동안함.

  N이 있을 때 S의 위치에서 이동하는 숫자를 빼 음수가 나오면 이동 안함.

  이동 안할때는 이동하는 숫자를 0으로 만듦
	 */
	public void outOfPark( char[][] parkChar, String[] routes) {
		for(int l=0; l<routes.length; l++) {
        	if(routes[l].contains("E")) {
        		
        	}else if(routes[l].contains("W")) {
        		
        	}else if(routes[l].contains("S")) {
        		
        	}else if(routes[l].contains("N")) {
        		
        	}
        }
	}
	
	public void obstacle() {
		
	}
}