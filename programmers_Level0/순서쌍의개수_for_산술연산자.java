package level_0;

public class 순서쌍의개수_for_산술연산자 { //약수의 갯수를 찾는 문제
	static class Solution {
	    public static int solution(int n) {
	        int answer = 0;
	        for(int i =1; i<=n; i++) {
	        	if(n%i==0) answer++;
	        }
	        return answer;
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 20;
		int answer = Solution.solution(n);
		System.out.println(answer);
	}

}
