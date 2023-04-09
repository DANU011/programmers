package programmers_Level0;

/*
정수 num과 k가 매개변수로 주어질 때, num을 이루는 숫자 중에 k가 있으면 num의 그 숫자가 있는 자리 수를 return하고 
없으면 -1을 return 하도록 solution 함수를 완성해보세요.
*/
public class 숫자찾기_toString_indexOf {
	static class Solution {
		public int solution(int num, int k) {
			int answer = 0;
			String str_num = Integer.toString(num);
			String str_k = Integer.toString(k);
			if (str_num.indexOf(str_k) == -1) {
				answer = -1;
				
			} else {
				answer = str_num.indexOf(str_k) + 1;
			}
			return answer;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int num = 29183;
			int k = 1;
			Solution s = new Solution();
			int answer = s.solution(num, k);
			System.out.println(answer);
		}
	}
}
