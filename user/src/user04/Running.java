package user04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * �ῡ���� �ų� �޸��� ���ְ� �����ϴ�. �ؼ������� �������� �ڱ� �ٷ� ���� ������ �߿��� �� �߿��� ������ �̸��� �θ��ϴ�.
 * ���� ��� 1����� 3����� "mumu", "soe", "poe" �������� ������� �޸��� ���� ��,
 * �ؼ����� "soe"������ �ҷ��ٸ� 2���� "soe" ������ 1���� "mumu" ������ �߿��ߴٴ� ���Դϴ�. �� "soe" ������ 1��, "mumu" ������ 2������ �ٲ�ϴ�.
 *�������� �̸��� 1����� ���� ��� ������� ��� ���ڿ� �迭 players�� �ؼ����� �θ� �̸��� ���� ���ڿ� �迭 callings�� �Ű������� �־��� ��,
 *���ְ� ������ �� �������� �̸��� 1����� ��� ������� �迭�� ��� return �ϴ� solution �Լ��� �ϼ����ּ���.
 */

public class Running {
	Solution1 sol=new Solution1();
	
	public static void main(String[] args) {
		Running running=new Running();
		String[] players={"mumu", "soe", "poe", "kai", "mine"};
		String[] callings= {"kai", "kai", "mine", "mine"};
		String[] answer=running.sol.solution(players, callings);
		for(int i=0; i<answer.length; i++) {
			System.out.println(answer[i]);
		}
		
	}

}

class Solution01 {
	public String[] solution(String[] players, String[] callings) {
        
        for(int i=0; i<callings.length; i++) {
        	for(int j=1; j<players.length; j++) {
        		if(callings[i].equals(players[j])) {
        			String temp=null;
        			temp=players[j-1];
        			players[j-1]=players[j];
        			players[j]=temp;
        		}
        	}
        }
        return players;	
    }
}

class Solution1 {
	public String[] solution(String[] players, String[] callings) {
        
		//List<Map<String,Integer>> list=new ArrayList<>();
		Map<String, Integer> rank=new HashMap<>();
		for(int i=0; i<players.length; i++) {
			rank.put(players[i], i);
			//list.add(rank);
		}
		
		for(int i=0; i<callings.length; i++) {
			int temp=rank.get(callings[i]);
			rank.put(callings[i], temp-1);
			rank.put(players[temp-1], temp);
			String tempName=players[temp];
			players[temp]=players[temp-1];
			players[temp-1]=tempName;
		}
		
        return players;	
    }
}