package level_0;

public class 개미군단_산술연산자 {
	static class Solution {
	    public static int solution(int hp) {
	        int answer = 0;
	        answer = (hp/5)+((hp%5)/3)+((hp%5)%3);
	        return answer;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hp = 999;
		int answer = Solution.solution(hp);
		System.out.println(answer);
		

	}

}
