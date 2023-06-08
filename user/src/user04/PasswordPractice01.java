package user04;

public class PasswordPractice01 {

	public static void main(String[] args) {
		Solution s1 = new Solution();
		System.out.println(s1.solution("aukks", "wbqd", 5));

	}

}

class Solution {
	public String solution(String s, String skip, int index) {
		String answer = "";

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			for (int j = 0; j < index; j++) {
				ch++;
				if (ch > 'z') {
					ch=(char)(ch-26);
				}
				if (skip.contains(String.valueOf(ch))) {
					j--;
				}
			}
			answer = answer + ch;
		}

		return answer;
	}
}