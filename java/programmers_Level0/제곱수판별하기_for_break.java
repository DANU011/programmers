package level_0;

public class 제곱수판별하기_for_break {
	static class Solution {
		public static int solution(int n) {
			int answer = 0;
			for (int i = 1; i <= n / i; i++) {
//제곱수 일 경우 n=i*i 최대로 필요한 수 i
				if (n % i == 0 && n / i == i) {
					answer = 1; 
// n이 i*i와 같은 형태의 곱으로 나타낼 수 있으면 1로 설정
					break;
				}
			}
			if (answer == 0) {
				answer = 2; 
// 루프를 모두 돌았는데도 answer가 0이면, n이 제곱수가 아니므로 answer를 2로 설정
			}
			return answer;
		}
	}

	/* 루프를 모두 돌았는데도 answer가 0이면, n이 제곱수가 아니므로 answer를 2로 설정 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 144;
		int answer = Solution.solution(n);
		System.out.println(answer);

	}

}
