package programmers_Level0;
/*
 머쓱이네 피자가게는 피자를 여섯 조각으로 잘라 줍니다. 
 피자를 나눠먹을 사람의 수 n이 매개변수로 주어질 때, n명이 주문한 피자를 남기지 않고 모두 같은 수의 피자 조각을 먹어야 한다면 
 최소 몇 판을 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.
 
 6명 -> 1판 1*6조각을 각 한조각씩
 10명 -> 5판 5*6조각을 각 3조각씩 
 6*answer%n == 0 */
public class 피자나눠먹기2_while {
	static class Solution {
		public int solution(int n) {
	        int answer = 1;
	        while (true) {
	        	if(6*answer%n == 0) {
	        		break;
	        	}
				answer++;
			}
	        return answer;
	    }
	}	


	public static void main(String[] args) {
		int n = 6;
        Solution s = new Solution();
        int answer = s.solution(n);
        System.out.println(answer);
	}
}
