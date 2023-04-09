package programmers_Level1;
/*
정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.*/
public class 짝수와홀수 {
	static class Solution {
	    public String solution(int num) {
	        String answer = "";
	        if(num%2==0) answer = "Even";
	        else answer = "Odd";
	        return answer;
	    }
	}
	public static void main(String[] args) {
		int num=4;
		Solution sol = new Solution();
		String answer = sol.solution(num);
		System.out.println(answer);
	}
}
