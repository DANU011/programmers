package programmers_Level0;

import java.util.Arrays;

/*
문자열 before와 after가 매개변수로 주어질 때, before의 순서를 바꾸어 after를 만들 수 있으면 1을, 
만들 수 없으면 0을 return 하도록 solution 함수를 완성해보세요.
 */
public class A로B만들기_toCharArray {
	static class Solution {
	    public int solution(String before, String after) {
	        int answer = 0;
	        char[] beforeC = before.toCharArray();
	        char[] afterC = after.toCharArray();//쪼개기
	        Arrays.sort(beforeC);
	        Arrays.sort(afterC);
	        String bC = new String(beforeC);
	        String aC = new String(afterC);
	        if(bC.equals(aC)) {
	        	return ++answer;
	        }
	        return answer;
	    }
	}
	public static void main(String[] args) {
		String before = "olleh";
		String after ="hello";
		Solution sol = new Solution();
		int answer = sol.solution(before, after);
		System.out.println(answer);
	}
}
