package level_0;

public class 자릿수더하기_while {
	static class Solution {
	    public static int solution(int n) {
	        int answer = 0;
	    	while (n > 0) {
				answer += n % 10; // 일의 자리부터 자릿수 더하기
				n /= 10;
			}
			return answer;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 930211;
		int answer = Solution.solution(n);
		System.out.println(answer);

	}

}
