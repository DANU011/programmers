package level_0;

public class ¼¼±ÕÁõ½Ä_for {
	static class Solution {
	    public static int solution(int n, int t) {
	        int answer = 0;
	        for(int i=1; i<=t; i++) {
	        	answer=2*n;
	        	n=answer;
	        }
	        return answer;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2 ;
		int t = 10 ;
		int answer = Solution.solution(n, t);
		System.out.println(answer);

	}

}
