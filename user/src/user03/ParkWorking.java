/*
 * �����ٴϴ� ���� 'O', ��ֹ��� 'X'�� ��Ÿ�� ���簢�� ���� ����� �������� �κ� �������� ��å�� �Ϸ��մϴ�. ��å�� �κ� �������� �̸� �Էµ� ��ɿ� ���� �����ϸ�,
 * ����� ������ ���� �������� �־����ϴ�.

["���� �Ÿ�", "���� �Ÿ�" �� ]
���� ��� "E 5"�� �κ� �������� ���� ��ġ���� �������� 5ĭ �̵��ߴٴ� �ǹ��Դϴ�. �κ� �������� ����� �����ϱ� ���� ���� �� ������ ���� Ȯ���մϴ�.

�־��� �������� �̵��� �� ������ ������� Ȯ���մϴ�.
�־��� �������� �̵� �� ��ֹ��� �������� Ȯ���մϴ�.
�� �� ������ ��� �ϳ��� �ش�ȴٸ�, �κ� �������� �ش� ����� �����ϰ� ���� ����� �����մϴ�.
������ ���� ���̰� W, ���� ���̰� H��� �� ��, ������ ���� ����� ��ǥ�� (0, 0), ���� �ϴ��� ��ǥ�� (H - 1, W - 1) �Դϴ�.
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
	 * E�� ���� �� S�� ��ġ���� �̵��ϴ� ���ڸ� ���� parkChar[ ][i] i�� �ε����� �Ѿ�� �̵�����.

  W�� ���� �� S�� ��ġ���� �̵��ϴ� ���ڸ� �� ������ ������ �̵� ����.

  S�� ���� �� S�� ��ġ���� �̵��ϴ� ���ڸ� ���� parkChar[i][ ] i�� �ε����� �Ѿ�� �̵�����.

  N�� ���� �� S�� ��ġ���� �̵��ϴ� ���ڸ� �� ������ ������ �̵� ����.

  �̵� ���Ҷ��� �̵��ϴ� ���ڸ� 0���� ����
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